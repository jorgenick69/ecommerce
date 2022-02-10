
package ecommerce.com.ecommerce.Domain;

import java.util.Date;
import java.util.List;

public class Tienda {
    private String id;
    private String nombre;
    private String telefono;
    private String email;
    private String Rubro;
    private String domicilio;
    private List <Producto> producto;
    private Usuario administrador;
    private List <Foto> Fotos;
    private Reputacion reputacion;
    private Date alta;
    private Boolean estado;
    private String clave;
   
}
