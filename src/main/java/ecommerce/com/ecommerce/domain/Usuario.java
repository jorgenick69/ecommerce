package ecommerce.com.ecommerce.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
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
    @ManyToOne
    private Foto foto;
    
    //CHEQUEAR CON LOS CHICOS COMO SERIAN LAS RELACIONES DESDE LAS DEMAS PERSPECTIVAS
    @OneToMany
    private List<Transaccion> compras;
}
