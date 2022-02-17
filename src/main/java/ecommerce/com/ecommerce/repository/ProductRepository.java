package ecommerce.com.ecommerce.repository;

import ecommerce.com.ecommerce.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface ProductRepository extends JpaRepository<Producto,String> {

    @Query("SELECT a FROM producto a WHERE a.categoria=:categoria")
    List<Producto>findByCategoria(@Param("categoria") String categoria);

    @Query("SELECT a FROM producto a WHERE a.marca=:marca")
    List<Producto>findByMarca(@Param("marca") String marca);

    @Query("SELECT a FROM producto a WHERE a.genero=:genero")
    List<Producto>findByGenero(@Param("genero") String genero);

    @Query("SELECT a FROM producto a WHERE a.modelo=:modelo")
    List<Producto>findByModelo(@Param("modelo") String modelo);

    @Query("SELECT a FROM producto a WHERE a.estilo=:estilo")
    List<Producto>findByEstilo(@Param("estilo") String estilo);

    @Query("SELECT a FROM producto a WHERE a.categoria=:estilo ORDER BY a.precio DESC")
    List<Producto>findByEstiloPrecioDesc(@Param("estilo") String estilo);

    @Query("SELECT a FROM producto a WHERE a.categoria=:estilo ORDER BY a.precio ASC")
    List<Producto>findByEstiloPrecioAsc(@Param("estilo") String estilo);

    @Query("SELECT a FROM producto a WHERE a.duracion=:duracion")
    List<Producto>findByDuracion(@Param("duracion") String duracion);

    @Query("SELECT a FROM producto a WHERE a.uso=:uso")
    List<Producto>findByUso(@Param("uso") String uso);

    @Query("SELECT a FROM producto WHERE ")

}
