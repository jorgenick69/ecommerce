
package ecommerce.com.ecommerce.Domain;

import java.util.Date;
import java.util.List;

@Entity;
@Table(name="usuarios");
public class Usuario {
    private String id;
    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private String telefono;
    private Date fechaNacimiento;
    private Date fechaAlta;
    private String nombreUsuario;
    private List <Transaccion> compras;
    private String rol;//revisar
    private Boolean estado;
    private String clave;
    private Foto foto;
}
