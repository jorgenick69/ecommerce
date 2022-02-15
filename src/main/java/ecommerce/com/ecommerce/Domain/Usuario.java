package ecommerce.com.ecommerce.Domain;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String id;
    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private String telefono;
    private Date fechaNacimiento;
    private Date fechaAlta;
    private String nombreUsuario;
    private String rol;//revisar
    private Boolean estado;
    private String clave;
    private Foto foto;
    
    //CHEQUEAR CON LOS CHICOS COMO SERIAN LAS RELACIONES DESDE LAS DEMAS PERSPECTIVAS
    @OneToMany(mappedBy = "usuario")    
    private List<Transaccion> compras;
}
