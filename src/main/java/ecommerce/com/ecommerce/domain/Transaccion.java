package ecommerce.com.ecommerce.domain;

import java.io.Serializable;
import ecommerce.com.ecommerce.enums.TransaccionEstado;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name="transaccion")
public class Transaccion implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="venta_gen")
    @SequenceGenerator(name="venta_gen",sequenceName="venta_seq_gen",initialValue=1,allocationSize=1)
    private Long numeroVenta;
    @OneToMany
    private List <Producto> producto;
    @OneToOne
    private Usuario usuario;
    @Temporal(value=TemporalType.DATE)
    private Date fecha;
    @Enumerated
    private TransaccionEstado txEstado;
}