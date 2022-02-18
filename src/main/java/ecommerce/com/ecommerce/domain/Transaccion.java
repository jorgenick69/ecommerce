
package ecommerce.com.ecommerce.domain;

import java.io.Serializable;
import lombok.Data;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name="transaccion")
public class Transaccion implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private Long numeroVenta;
    @OneToMany
    private List <Producto> producto;
    @OneToOne(targetEntity = Usuario.class)
    private Usuario usuario;
    @Temporal(value=TemporalType.DATE)
    private Date fecha;
    private Boolean pago=false;
    private Boolean embalaje=false;
    private Boolean envio=false;
    private Boolean recepcion=false;
}