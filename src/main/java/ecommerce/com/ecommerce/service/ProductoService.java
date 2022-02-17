package ecommerce.com.ecommerce.service;

import ecommerce.com.ecommerce.domain.Producto;
import ecommerce.com.ecommerce.domain.Transaccion;
import ecommerce.com.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductRepository pRep;

    public void cargarProducto(Producto producto){pRep.save(producto);}

    public void borrarProductoId(String id) {
        Optional<Producto> response = pRep.findById(id);
        if (response.isPresent()) {pRep.delete(response.get());}}

    public List<Producto> productoGenero(String genero){return pRep.findByGenero(genero);}

    public List<Producto> productoEstilo(String estilo){return pRep.findByEstilo(estilo);}

    public List<Producto> productoModelo(String modelo){return pRep.findByModelo(modelo);}

    public List<Producto> productoMarca(String marca){return pRep.findByMarca(marca);}

    public List<Producto> productoDuracion(String duracion){return pRep.findByDuracion(duracion);}

    public List<Producto> productoUso(String uso){return pRep.findByUso(uso);}

    public List<Producto> productoTodos(String nombre){return pRep.findByOcurrence(nombre);}

}
