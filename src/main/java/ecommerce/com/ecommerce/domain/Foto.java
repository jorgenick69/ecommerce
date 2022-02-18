
package ecommerce.com.ecommerce.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Foto implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    //wTF?
    private String id;
}
