package ecommerce.com.ecommerce.domain;

import ecommerce.com.ecommerce.enums.Envio;
import ecommerce.com.ecommerce.enums.Genero;
import java.io.Serializable;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "producto")
public class Producto implements Serializable{
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  private String id;
  private String marca;
  private String modelo;
  private String codigo;
  private String descripcion;
  private Integer costo;
  private Integer remarque;
  private Integer precio;
  private Integer descuento;
  private Integer precioActual;//<- Ganancia: precio actual - costo
  @OneToOne
  private Categoria categoria;
  @Enumerated(value = EnumType.STRING)
  private Envio tipoEnvio;
  @OneToMany
  private List <Foto> fotos;
  @Temporal(TemporalType.DATE)
  private Date alta;
  private Integer stock;
  private Boolean estado;
  @Enumerated(value = EnumType.STRING)
  private Genero genero;
  private String color;
  private String colorCristal;
  private String material;
  private String estilo;
  private String tamano;
  private String duracion;
  private String uso;
}
