
package ecommerce.com.ecommerce.domain;

import javax.persistence.ManyToOne;

public class Foto {
    @ManyToOne(targetEntity = Producto.class)//wTF?
    private String id;
}
