package ecommerce.com.ecommerce.service;

import ecommerce.com.ecommerce.Domain.Usuario;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioService {
    
    public Usuario save(Usuario usuario);
    public Optional<Usuario> get(String Id);            //Optional validar si el objeto existe o no
    public void update (Usuario usuario);
    public void delete(String Id);
}
