package ecommerce.com.ecommerce.domain;

import ecommerce.com.ecommerce.enums.Envio;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Producto {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;
  private String nombre;
  private String marca;
  private String descripcion;
  private Integer precio;
  private Integer descuento;
  private Integer precioActual;
  @OneToOne
  private Categoria categoria;
  private Envio tipoEnvio;
  private List <Foto> fotos;
  private Date alta;
  private Long stock;
  private Boolean estado;
}
