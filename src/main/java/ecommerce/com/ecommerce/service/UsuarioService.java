package ecommerce.com.ecommerce.service;

import ecommerce.com.ecommerce.domain.Usuario;
import ecommerce.com.ecommerce.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listar(){return usuarioRepository.findAll();}

    @Transactional
    public Usuario crear(Usuario usuario) {return usuarioRepository.save(usuario);}

    public Optional<Usuario> listarPorId(String Id) {return usuarioRepository.findById(Id);}

    @Transactional
    public void actualizar(Usuario usuario) {usuarioRepository.save(usuario);}

    @Transactional
    public void borrar(String Id) {usuarioRepository.deleteById(Id);}
}
