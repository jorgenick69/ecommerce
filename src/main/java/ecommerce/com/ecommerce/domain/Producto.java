package ecommerce.com.ecommerce.domain;

import ecommerce.com.ecommerce.enums.Envio;
import ecommerce.com.ecommerce.enums.Genero;
import java.io.Serializable;
import lombok.Data;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import javax.persistence.OneToMany;

@Data
@Entity
@Table(name = "producto")
public class Producto implements Serializable{
    private static final long serialVersionUID = 1L;
  //Required
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;
  private String marca;
  private String modelo;
  private String codigo;
  private String descripcion;
  private Integer precio;
  private Integer descuento;
  private Integer precioActual;
  @OneToOne
  private Categoria categoria; //Armazones de Receta, Lentes de Sol, Lentes de Contacto, Accesorios.
  @Enumerated(value = EnumType.STRING)
  private Envio tipoEnvio; //ej: retiro local, correo, domicilio;
  @OneToMany
  private List <Foto> fotos;//si no existe imagen 404 marca.
  private Date alta; //ej: ultimos ingresos -> desde hace 15 dias ej. o mostrame los mas recientes.
  private Integer stock; // its over 9000!!! - Vegeta
  private Boolean estado;
  //Not required
  @Enumerated(value = EnumType.STRING)
  private Genero genero;
  private String color;
  private String colorCristal;
  private String material;
  private String estilo; //ej: cuadrado, rectangular,aviador, cat eye;
  private String tamano; //Tamaño, capacidad, ej: Chico (80mm) - 20ml etc,etc
  private String duracion; //ej: diario,quincenal,mensual
  private String uso; //ej: astigmatismo, toricas, cosmeticos;
}
