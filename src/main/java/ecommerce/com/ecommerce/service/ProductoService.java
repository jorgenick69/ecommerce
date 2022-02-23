package ecommerce.com.ecommerce.service;

import ecommerce.com.ecommerce.domain.Producto;
import ecommerce.com.ecommerce.repository.ProductRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoService {

    @Autowired
    private ProductRepository pRep;

    @Transactional
    public void crear(Producto producto){pRep.save(producto);}

    @Transactional
    public void borrar(String id) {
        Optional<Producto> response = pRep.findById(id);
        if (response.isPresent()) {pRep.delete(response.get());}}

    public Producto listarId(String id){
        Optional<Producto> respuesta = pRep.findById(id);
        if (respuesta.isPresent()) {
            Producto producto = respuesta.get();
            return producto;
        } else {
            return null;
        }
    }

    public List<Producto> listarGenero(String genero){return pRep.findByGenero(genero);}

    public List<Producto> listarEstilo(String estilo){return pRep.findByEstilo(estilo);}

    public List<Producto> listarModelo(String modelo){return pRep.findByModelo(modelo);}

    public List<Producto> listarMarca(String marca){return pRep.findByMarca(marca);}

    public List<Producto> listarDuracion(String duracion){return pRep.findByDuracion(duracion);}

    public List<Producto> listarUso(String uso){return pRep.findByUso(uso);}

    public List<Producto> listarSuperQuery(String nombre){return pRep.findByOcurrence(nombre);}

    public List<Producto> listarStock(Integer stock){return pRep.findByStock(stock);}

}