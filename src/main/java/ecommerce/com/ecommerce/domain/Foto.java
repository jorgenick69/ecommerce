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
    private String mime; //asigna el formato de la foto
    @Lob //le indica que va a ser un tipo de dato con mucho contenido
    @Basic(fetch = FetchType.LAZY) //para que la foto no se cargue inmediatamente sino cuando lo solicito
    private byte[] contenido;
}