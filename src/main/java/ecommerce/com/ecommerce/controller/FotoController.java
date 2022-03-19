package ecommerce.com.ecommerce.controller;

import ecommerce.com.ecommerce.domain.Foto;
import ecommerce.com.ecommerce.domain.Producto;
import ecommerce.com.ecommerce.service.FotoService;
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
@Autowired
private FotoService fotoService;
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
/* No seria requerido gracias al Dto de foto.*/
    @GetMapping("/productos")
    private ResponseEntity<byte[]> fotoProductoxid(@RequestParam String id) {

        Foto fotodup = fotoService.buscarporId(id);
        if (fotodup.getContenido() != null) {
            byte[] foto = fotodup.getContenido();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_JPEG);
            return new ResponseEntity<>(foto, headers, HttpStatus.OK);
        }else{
            return null;
        }
    }
}



