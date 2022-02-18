package ecommerce.com.ecommerce.service;

import ecommerce.com.ecommerce.domain.Usuario;
import ecommerce.com.ecommerce.repository.UsuarioRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

   @Autowired
    private UsuarioRepository usuarioRepository;
    /*

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> get(String Id) {
        return usuarioRepository.findById(Id);
    }

    public void update(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public void delete(String Id) {
        usuarioRepository.deleteById(Id);
    }
    
    */
}
