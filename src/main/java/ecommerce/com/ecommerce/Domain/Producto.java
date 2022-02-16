
package ecommerce.com.ecommerce.Domain;

import ecommerce.com.ecommerce.enums.Envio;
import java.util.Date;
import java.util.List;

public class Producto {
  private String id;
  private String nombre;
  private String marca;
  private String descripcion;
  private Integer precio;
  private Integer descuento;
  private Integer precioActual;
  private Categoria categoria;
  private List <Caracteristica> caracteristica;
  private Envio tipoEnvio;
  private List <Foto> fotos;
  private Date alta;
  private Long stock;
  private Boolean estado;
}
