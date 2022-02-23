package ecommerce.com.ecommerce.repository;

import ecommerce.com.ecommerce.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,String> {

    @Query("SELECT a FROM Categoria a WHERE a.titulo LIKE %:titulo%")
    List<Categoria>findByNombre(@Param("titulo")String titulo);

}
