package ecommerce.com.ecommerce.service;

import ecommerce.com.ecommerce.Exceptions.ServiceException;
import ecommerce.com.ecommerce.domain.Foto;
import ecommerce.com.ecommerce.domain.Producto;
import ecommerce.com.ecommerce.repository.FotoRepository;
import ecommerce.com.ecommerce.repository.ProductRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ProductoService {

    @Autowired
    private ProductRepository pRep;

    @Autowired
    private FotoService fotoService;

    @Autowired
    private FotoRepository fotoRepository;

    @Transactional
    public void crear(Producto producto, ArrayList <MultipartFile> archivo) throws ServiceException {

        if (producto.getPrecio()==null && producto.getRemarque() != null && producto.getCosto()!= null   ) {
            producto.setPrecio(producto.getCosto()+(producto.getCosto()*producto.getRemarque())/100);
            if (producto.getDescuento() != null && producto.getDescuento()>= 0 ) {
                  producto.setPrecioFinal(producto.getPrecio()-(producto.getPrecio()*producto.getDescuento())/100); 
            }else{
            producto.setPrecioFinal(producto.getPrecio());
            producto.setDescuento(0.0);
            }
        }else if(producto.getPrecio() != null && producto.getPrecio()>=0){
        producto.setPrecio(producto.getPrecio());

         if ( producto.getDescuento() != null && producto.getDescuento()>= 0) {
                  producto.setPrecioFinal(producto.getPrecio()-(producto.getPrecio()*producto.getDescuento())/100); 
            }else{
            producto.setPrecioFinal(producto.getPrecio());
             producto.setDescuento(0.0);}

        producto.setRemarque((producto.getCosto() -((producto.getPrecio()*100)/producto.getCosto())));
        }
        List<Foto> fotos = new ArrayList<>();
        if(archivo!=null || !archivo.isEmpty()){
            for (MultipartFile ar : archivo) {
                if (ar.getSize() != 0){
                    fotos.add(fotoService.crear(ar));
                } else {
                    continue;
                }
        }
        producto.setFoto(fotos);
}

        producto.setEstado(true);
        pRep.save(producto);}

    @Transactional
    public void actualizar(Producto producto) throws ServiceException{
        if (producto.getPrecio()==null && producto.getRemarque() != null && producto.getCosto()!= null   ) {
            producto.setPrecio(producto.getCosto()+(producto.getCosto()*producto.getRemarque())/100);
            if (producto.getDescuento() != null && producto.getDescuento()>= 0 ) {
                producto.setPrecioFinal(producto.getPrecio()-(producto.getPrecio()*producto.getDescuento())/100);
            }else{
                producto.setPrecioFinal(producto.getPrecio());
                producto.setDescuento(0.0);
            }
        }else if(producto.getPrecio() != null && producto.getPrecio()>=0){
            producto.setPrecio(producto.getPrecio());

            if ( producto.getDescuento() != null && producto.getDescuento()>= 0) {
                producto.setPrecioFinal(producto.getPrecio()-(producto.getPrecio()*producto.getDescuento())/100);
            }else{
                producto.setPrecioFinal(producto.getPrecio());
                producto.setDescuento(0.0);}

            producto.setRemarque((producto.getCosto() -((producto.getPrecio()*100)/producto.getCosto())));
        }
        pRep.save(producto);
    }

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
    
    public List<Producto> filtrar(String query, String tamano, 
           Double preciomin, Double preciomax, String orden){
        System.out.println("////////////////////////////////////////////////");
        System.out.println("////////////////////////////////////////////////");
        System.out.println("////////////////////////////////////////////////");
        System.out.println("////////////////////////////////////////////////");
        System.out.println("////////////////////////////////////////////////");
        System.out.println("////////////////////////////////////////////////");
        System.out.println("////////////////////////////////////////////////");
        System.out.println("////////////////////////////////////////////////");
        System.out.println(query);
        System.out.println(tamano);
        System.out.println(preciomin);
        System.out.println(preciomax);
        System.out.println(orden);
        return pRep.filtrar(query, tamano, preciomin, preciomax, orden); 
    }

    public List<Producto> listarGenero(String genero){return pRep.findByGenero(genero);}

    public List<Producto> listarEstilo(String estilo){return pRep.findByEstilo(estilo);}

    public List<Producto> listarModelo(String modelo){return pRep.findByModelo(modelo);}

    public List<Producto> listarMarca(String marca){return pRep.findByMarca(marca);}

    public List<Producto> listarDuracion(String duracion){return pRep.findByDuracion(duracion);}

    public List<Producto> listarUso(String uso){return pRep.findByUso(uso);}

    public List<Producto> listarSuperQuery(String nombre){return pRep.findByOcurrence(nombre);}

    public List<Producto> listarStock(Integer stock){return pRep.findByStock(stock);}

    public List<Producto> listarTodos(){return pRep.findAll();}
    
    public List<Producto> listarCategoria(String categoria){return pRep.findByCategoria(categoria);}

    public void eliminarProd(String id){pRep.deleteById(id);}

    public Producto buscarPorId(String id){return pRep.findById(id).orElse(null);}

    public List<Producto>listarDescuentos(){return pRep.findDescuentos();}


}