package ecommerce.com.ecommerce.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
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
    @OneToOne
    private Foto foto;
    
    //CHEQUEAR CON LOS CHICOS COMO SERIAN LAS RELACIONES DESDE LAS DEMAS PERSPECTIVAS
    @OneToMany(mappedBy = "usuario")    
    private List<Transaccion> compras;
}
