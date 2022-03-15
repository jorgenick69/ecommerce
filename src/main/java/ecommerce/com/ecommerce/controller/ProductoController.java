package ecommerce.com.ecommerce.controller;

import ecommerce.com.ecommerce.Exceptions.ServiceException;
import ecommerce.com.ecommerce.domain.Producto;
import ecommerce.com.ecommerce.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.ArrayList;

@Controller
@RequestMapping("/productos")
public class ProductoController{

    @Autowired
    private ProductoService productoService;

    @GetMapping("/carga-producto")
    public String cargarProducto(Model model, @RequestParam(required = false) String id){
        if (id != null){
            Producto optional = productoService.listarId(id);
            if (optional != null){
                model.addAttribute("producto", optional);
            }else {
                return "redirect:/producto/lista";
            }
        }else{
            model.addAttribute("producto", new Producto());
        }
        return "carga-producto";
    }

    @PostMapping("/cargar")
    public String cargarProducto(Model model,@ModelAttribute Producto producto, ArrayList <MultipartFile> archivox)throws ServiceException {
        productoService.crear(producto,archivox);
        return "redirect:/usuarios/admin#lista-productos";
    }
    
    @GetMapping("/buscar")
    public String buscar(Model model, @RequestParam String query){
       model.addAttribute("busqueda", productoService.listarSuperQuery(query));
    return "listar-productos";
    }
    
    @GetMapping("/lista")
    public String lis_producto(Model model, @RequestParam(required = false) String id) {
        if (id != null) {
            model.addAttribute("productos", productoService.listarId(id));
        } else {
            model.addAttribute("productos", productoService.listarTodos());
        }
        return "lista-productos";
    }

    @GetMapping("/eliminar")
    public String eliminarProducto(@RequestParam String id){
        productoService.eliminarProd(id);
        return "redirect:/usuarios/admin#lista-productos";
    }
}


