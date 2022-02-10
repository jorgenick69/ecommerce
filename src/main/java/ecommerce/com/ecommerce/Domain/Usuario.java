
package ecommerce.com.ecommerce.Domain;

import java.util.Date;
import java.util.List;

public class Usuario {
    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private String telefono;
    private Date fechaNacimiento;
    private Date fechaAlta;
    private String nombreUsuario;
    private List <Transaccion> compra;
    private String rol;//revisar
    private Boolean estado;
    private String clave;
}
