package ecommerce.com.ecommerce.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
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
    @Temporal(TemporalType.DATE)
    private Date fechaAlta;
    private String nombreUsuario;
    @Enumerated
    private String rol;
    private Boolean estado;
    private String clave;
    @OneToOne
    private Foto foto;
    @OneToMany
    private List<Transaccion> compras;
}
