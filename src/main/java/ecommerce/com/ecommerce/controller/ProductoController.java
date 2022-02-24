package ecommerce.com.ecommerce.controller;

import ecommerce.com.ecommerce.domain.Producto;
import ecommerce.com.ecommerce.enums.Genero;
import ecommerce.com.ecommerce.service.CategoriaService;
import ecommerce.com.ecommerce.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;
    @Autowired
    private CategoriaService categoriaService;

//    @GetMapping("/cargarproducto")
//    public String cargarProducto(Model model, @RequestParam(required = false) String id) {
//        if (id != null) {
//            Producto optional = productoService.listarId(id);
//            if (optional != null) {
//                model.addAttribute("producto", optional);
//            } else {
//                return "redirect:/productos/list";
//            }
//        } else {
//            model.addAttribute("producto", new Producto());
//        }
//        model.addAttribute("categoria", categoriaService.listar());
//        model.addAttribute("genero", Genero.values());
//
//        return "cargarProducto";
//    }
    
    @GetMapping("/cargarproducto")
    public String cargarProducto(Model model, @ModelAttribute(value = "producto") Producto producto){
//        
//        model.addAttribute("categoria", categoriaService.listar());
//        model.addAttribute("genero", Genero.values());
        
        
        return "cargarproducto";
    }

    @PostMapping("/cargar")
    public String cargarProducto(@ModelAttribute Producto producto) {
        productoService.crear(producto);
        
        return "index";
    }
}
