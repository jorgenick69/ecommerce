
package ecommerce.com.ecommerce.domain;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="foto")
public class Foto implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    private String id;
}
