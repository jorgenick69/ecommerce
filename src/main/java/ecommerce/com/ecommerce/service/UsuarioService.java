package ecommerce.com.ecommerce.service;

import ecommerce.com.ecommerce.Exceptions.ServiceException;
import ecommerce.com.ecommerce.domain.Usuario;
import ecommerce.com.ecommerce.enums.Rol;
import ecommerce.com.ecommerce.repository.UsuarioRepository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UsuarioService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private FotoService fotoService;

    public List<Usuario> listarTodos(){return usuarioRepository.findAll();}

    public Usuario validacion(Usuario usuario,String password2) throws ServiceException {

        if (usuario.getNombre().isEmpty() || usuario.getNombre() == null) {
            throw new ServiceException("El nombre no puede estar vacío");
        }
        if (usuario.getApellido().isEmpty() || usuario.getApellido() == null) {
            throw new ServiceException("El apellido no puede estar vacío");
        }
        if (password2==null) {
            throw new ServiceException("La contraseña no puede ser nula");

        }if (usuario.getClave() == null) {

            throw new ServiceException("La contraseña no puede ser nula");

        }if (!(password2.equals(usuario.getClave())) ) {

            throw new ServiceException("Las contraseña tienen que ser iguales");
        }
        return usuario;
    }

    @Transactional
    public void crear(Usuario usuario, MultipartFile archivo, @RequestParam String password2) throws ServiceException {
            Usuario validado = validacion(usuario,password2);

            if (archivo.getSize() != 0) {
                usuario.setFoto(fotoService.crear(archivo));
            }else {
                usuario.setFoto(null);
            }
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            validado.setClave(encoder.encode(usuario.getClave()));
            validado.setFechaAlta(new Date());
            validado.setEstado(true);
            validado.setRol(Rol.USER);
            usuarioRepository.save(validado);
    }

    public Usuario findById(String id) {
        Optional<Usuario> respuesta = usuarioRepository.findById(id);
        if (respuesta.isPresent()) {
            Usuario usuario= respuesta.get();
            return usuario;
        } else {
            return null;
        }
    }

    public Usuario findByUser(String user){
        Optional<Usuario> respuesta = usuarioRepository.findByUser(user);
        if (respuesta.isPresent()){
            Usuario usuario = respuesta.get();
            return usuario;
        }else{
            return null;
        }
    }

    public Usuario findByDni(String user){
        Optional<Usuario> respuesta = usuarioRepository.findByUserDni(user);
        if (respuesta.isPresent()){
            Usuario usuario = respuesta.get();
            return usuario;
        }else{
            return null;
        }
    }

    public Optional<Usuario> usuarioEmail(String email) {
        Optional user = usuarioRepository.findByUserEmail(email);
        return user;
    }

    public Usuario findByEmail(String user){
        Optional<Usuario> respuesta = usuarioRepository.findByUserEmail(user);
        if (respuesta.isPresent()){
            Usuario usuario = respuesta.get();
            return usuario;
        }else{
            return null;
        }
    }

    @Transactional
    public void actualizar(Usuario usuario) {usuarioRepository.save(usuario);}


    @Transactional
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public void borrar(String Id) {usuarioRepository.deleteById(Id);}

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            Usuario usuario = usuarioRepository.findByUsername(username);
            User user;
            List<GrantedAuthority> authorities = new ArrayList<>();

            authorities.add(new SimpleGrantedAuthority("ROLE_"+usuario.getRol()));
            return new User(username, usuario.getClave(),authorities);
        } catch (Exception e) {
            throw new UsernameNotFoundException("EL usuario solicitado no existe");
        }
    }
}
