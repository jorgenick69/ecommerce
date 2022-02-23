package ecommerce.com.ecommerce.repository;

import ecommerce.com.ecommerce.domain.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;

@Repository
public interface TransaccionRepository extends JpaRepository<Transaccion,String> {

    @Query("SELECT a FROM Transaccion a WHERE a.usuario.nombreUsuario LIKE %:user%")
    List<Transaccion>findByUser(@Param("user") String user);

    @Query("SELECT a FROM Transaccion a WHERE a.numeroVenta=:num")
    List<Transaccion>findByNum(@Param("num") Long numeroVenta);

    @Query("SELECT a FROM Transaccion a WHERE a.txEstado=:estado")
    List<Transaccion>findByStatus(@Param("estado")String estado);

    @Query("SELECT a FROM Transaccion a WHERE a.fecha BETWEEN :date1 AND :date2")
    List<Transaccion> findByTxTimeBetween(@Param("date1") Date date1,@Param("date2") Date date2);
}
