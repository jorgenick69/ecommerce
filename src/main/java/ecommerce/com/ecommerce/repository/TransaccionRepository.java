package ecommerce.com.ecommerce.repository;

import ecommerce.com.ecommerce.domain.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TransaccionRepository extends JpaRepository<Transaccion,String> {

    //Buscar por nombre de usuario
    @Query("SELECT a FROM Transaccion a WHERE a.nombreUsuario LIKE('%',:user,'%')")
    List<Transaccion>findByUser(@Param("user") String user);

    //Buscar por numero de venta
    @Query("SELECT a FROM Transaccion a WHERE a.numeroTransaccion=:num")
    List<Transaccion>findByNum(@Param("num") String num);

    //Buscar por fecha
    @Query("SELECT a FROM Transaccion a WHERE a.fecha=:fecha")
    List<Transaccion>findByDate(@Param("fecha") String fecha);

    //Buscar por Estado
    @Query("SELECT a FROM Transaccion a WHERE a.recepcion=false")
    List<Transaccion>findByStatus();

    //Buscar entre Fechas
    @Query("SELECT a FROM Transaccion a BETWEEN a.fecha=:date1 AND a.fecha=:date2")
    List<Transaccion> findByTxTimeBetween(@Param("date1,date2") String date1,String date2);
}
