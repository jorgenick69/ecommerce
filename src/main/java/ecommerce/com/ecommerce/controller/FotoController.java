package ecommerce.com.ecommerce.controller;

import ecommerce.com.ecommerce.domain.Producto;
import ecommerce.com.ecommerce.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/foto")
public class FotoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/producto")
    private ResponseEntity<byte[]> fotoPortada(@RequestParam String id) {

        Producto producto = productoService.listarId(id);
        if (producto.getFoto().get(0).getContenido() != null) {
            byte[] foto = producto.getFoto().get(0).getContenido();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_JPEG);

            return new ResponseEntity<>(foto, headers, HttpStatus.OK);
        }else{
            return null;
        }
    }

    @GetMapping("/productos")
    private ResponseEntity<byte[]> fotoProducto(@RequestParam String id,@RequestParam Integer opcion) {

        Producto producto = productoService.listarId(id);
        if (producto.getFoto().get(0).getContenido() != null) {
            byte[] foto = producto.getFoto().get(0).getContenido();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_JPEG);

            return new ResponseEntity<>(foto, headers, HttpStatus.OK);
        }else{
            return null;
        }
    }
}



