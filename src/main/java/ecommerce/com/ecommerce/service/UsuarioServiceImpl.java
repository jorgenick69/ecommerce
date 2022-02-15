package ecommerce.com.ecommerce.service;

import ecommerce.com.ecommerce.Domain.Usuario;
import ecommerce.com.ecommerce.repository.UsuarioRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Optional<Usuario> get(String Id) {
        return usuarioRepository.findById(Id);
    }

    @Override
    public void update(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void delete(String Id) {
        usuarioRepository.deleteById(Id);
    }
    
    
}
