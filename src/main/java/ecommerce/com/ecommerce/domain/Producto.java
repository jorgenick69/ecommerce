package ecommerce.com.ecommerce.domain;

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
  private Double costo;
  private Double remarque;
  private Double precio;
  private Double descuento;
  private Double precioFinal;
  private String categoria;
  @OneToMany
  @JoinColumn(name="producto")
  private List<Foto> foto;
  @Temporal(TemporalType.DATE)
  private Date alta;
  private Integer stock;
  private Boolean estado;
  private String genero;
  private String color;
  private String colorCristal;
  private String material;
  private String estilo;
  private String tamano;
  private String duracion;
  private String uso;
}
