package ecommerce.com.ecommerce.domain;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import java.io.Serializable;
import javax.persistence.*;

@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String titulo;
}
