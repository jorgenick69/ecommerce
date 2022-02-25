package ecommerce.com.ecommerce.domain;

import javax.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@Table(name="foto")
public class Foto {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String nombre;
    private String mime;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] contenido;

}
