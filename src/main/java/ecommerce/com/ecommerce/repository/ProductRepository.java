package ecommerce.com.ecommerce.repository;

import ecommerce.com.ecommerce.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface ProductRepository extends JpaRepository<Producto,String> {

   @Query("SELECT a FROM Producto a WHERE a.categoria=:categoria")
    List<Producto>findByCategoria(@Param("categoria") String categoria);

    @Query("SELECT a FROM Producto a WHERE a.marca=:marca")
    List<Producto>findByMarca(@Param("marca") String marca);

    @Query("SELECT a FROM Producto a WHERE a.genero=:genero")
    List<Producto>findByGenero(@Param("genero") String genero);

    @Query("SELECT a FROM Producto a WHERE a.modelo=:modelo")
    List<Producto>findByModelo(@Param("modelo") String modelo);

    @Query("SELECT a FROM Producto a WHERE a.estilo=:estilo")
    List<Producto>findByEstilo(@Param("estilo") String estilo);

    @Query("SELECT a FROM Producto a WHERE a.categoria=:estilo ORDER BY a.precio DESC")
    List<Producto>findByEstiloPrecioDesc(@Param("estilo") String estilo);

    @Query("SELECT a FROM Producto a WHERE a.categoria=:estilo ORDER BY a.precio ASC")
    List<Producto>findByEstiloPrecioAsc(@Param("estilo") String estilo);

    @Query("SELECT a FROM Producto a WHERE a.duracion=:duracion")
    List<Producto>findByDuracion(@Param("duracion") String duracion);

    @Query("SELECT a FROM Producto a WHERE a.uso=:uso")
    List<Producto>findByUso(@Param("uso") String uso);
  
    @Query("SELECT a FROM Producto a WHERE  a.marca LIKE %:query%" +
            " OR a.modelo LIKE %:query% OR a.codigo LIKE %:query% OR a.descripcion LIKE %:query%" +
            " OR a.categoria.titulo LIKE %:query% OR a.color LIKE %:query%" +
            " OR a.colorCristal LIKE %:query% OR a.material LIKE %:query% OR a.estilo LIKE %:query%" +
            " OR a.tamano LIKE %:query% OR a.duracion LIKE %:query%" +
            " OR a.uso LIKE %:query%")
    List<Producto>findByOcurrence(@Param("query") String query);

    @Query("SELECT a FROM Producto a WHERE a.stock<=:stock")
    List<Producto>findByStock(@Param("stock") Integer stock);
}
