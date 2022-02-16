
package ecommerce.com.ecommerce.domain;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name="transaccion")
public class Transaccion {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    private Long numeroVenta;
    @OneToMany
    private List <Producto> producto;
    @OneToOne(targetEntity = Usuario.class)
    @JoinColumn(name="id",referencedColumnName = "id")
    private Usuario usuario;
    @Temporal(value=TemporalType.DATE)
    @Column(name="fecha")
    private Date fecha;
    private Boolean pago=false;
    private Boolean embalaje=false;
    private Boolean envio=false;
    private Boolean recepcion=false;
}