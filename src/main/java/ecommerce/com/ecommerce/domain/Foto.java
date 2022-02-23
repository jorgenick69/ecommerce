package ecommerce.com.ecommerce.domain;

<<<<<<< HEAD
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import lombok.Data;
import java.io.Serializable;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

=======
import javax.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
>>>>>>> 1f9f84dad47566cf83952bcfc2a4198e7d77da98

@Data
@Entity
@Table(name="foto")
<<<<<<< HEAD
public class Foto implements Serializable{
  private static final long serialVersionUID = 1L;
=======
public class Foto {
>>>>>>> 1f9f84dad47566cf83952bcfc2a4198e7d77da98
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String nombre;
    private String mime; //asigna el formato de la foto
    @Lob //le indica que va a ser un tipo de dato con mucho contenido
    @Basic(fetch = FetchType.LAZY) //para que la foto no se cargue inmediatamente sino cuando lo solicito
    private byte[] contenido;
}
