package ecommerce.com.ecommerce.domain;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

import java.util.List;

@Data
@Entity
@Table(name="cart")
public class Cart{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    @OneToMany
    private List<Producto>productos;
    @OneToOne
    private Usuario usuario;
}
