package ecommerce.com.ecommerce.repository;

import ecommerce.com.ecommerce.domain.Foto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FotoRepository extends JpaRepository<Foto, String> {
  /*  @Query("SELECT a FROM Foto a WHERE a.id=:query")
    Foto buscarFotoPorId(@Param("query") String query);*/

    @Query("SELECT a FROM Foto a WHERE a.producto.id=:query")
    List<Foto> listaFotos(@Param("query")String query);
}
