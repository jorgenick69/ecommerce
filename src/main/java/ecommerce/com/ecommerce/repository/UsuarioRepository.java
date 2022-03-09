package ecommerce.com.ecommerce.repository;

import ecommerce.com.ecommerce.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository 
public interface UsuarioRepository extends JpaRepository<Usuario, String>{

    @Query("SELECT a FROM Usuario a WHERE a.nombreUsuario LIKE %:query%")
    List<Usuario>findByNombreUsuario(@Param("query") String query);

    @Query("SELECT a FROM Usuario a WHERE a.email LIKE %:query%")
    List<Usuario>findByMail(@Param("query") String query);

    @Query("SELECT a FROM Usuario a WHERE a.dni LIKE %:query%")
    List<Usuario>findByDni(@Param("query") String query);

    @Query("SELECT a FROM Usuario a WHERE a.nombreUsuario LIKE %:query%")
    Usuario findByUsername(@Param("query") String query);

}
