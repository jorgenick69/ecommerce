
package ecommerce.com.ecommerce.Domain;

import java.util.Date;
import java.util.List;

public class Transaccion {
    private String id;
    private Long nVeinnta;
    private String nombreTienda;
    private List <Producto> producto;
    private Usuario usuario;
    private Date fecha;
    private Boolean estado;
}
