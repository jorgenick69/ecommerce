package ecommerce.com.ecommerce.controller;

import ecommerce.com.ecommerce.Exceptions.ServiceException;
import ecommerce.com.ecommerce.domain.Producto;
import ecommerce.com.ecommerce.service.FotoService;
import ecommerce.com.ecommerce.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @Autowired
    private FotoService fotoService;

    @GetMapping("/carga-producto")
    public String cargarProducto(Model model, @RequestParam(required = false) String id) {
        if (id != null) {
            Producto optional = productoService.listarId(id);
            if (optional != null) {
                model.addAttribute("producto", optional);
            } else {
                return "redirect:/producto/lista";
            }
        } else {
            model.addAttribute("producto", new Producto());
        }
        return "carga-producto";
    }

    @PostMapping("/cargar")
    public String cargarProducto(Model model,@ModelAttribute Producto producto, ArrayList <MultipartFile> archivox)throws ServiceException {
        productoService.crear(producto,archivox);
        return "redirect:/usuarios/admin#lista-productos";
    }

    @GetMapping("/editar-producto")
    public String editarProducto(Model model, @ModelAttribute Producto producto,@RequestParam(required = false) String id) {
        Producto optional = productoService.listarId(id);
        model.addAttribute("producto", optional);
        return "editar-producto";
    }

    @PostMapping("/modificar")
    public String modificarProducto(Model model, @ModelAttribute Producto producto) throws ServiceException{
        productoService.actualizar(producto);
        return "redirect:/usuarios/admin#lista-productos";
    }

    @GetMapping("/buscar")
    public String buscar(Model model, @RequestParam String busqueda) {
        model.addAttribute("busqueda", productoService.listarSuperQuery(busqueda));
        return "listar-productos";
    }

    @GetMapping("/lista")
    public String lis_producto(Model model, @RequestParam(required = false) String id) {
        if (id != null) {
            model.addAttribute("productos", productoService.listarId(id));
        } else {
            model.addAttribute("productos", productoService.listarTodos());
        }
        return "listar-productos";
    }

    @GetMapping("/lista-categoria")
    public String lis_categoria(Model model, @RequestParam(required = false) String categoria) {

        model.addAttribute("busqueda", productoService.listarCategoria(categoria));

        return "listar-productos";
    }

    @GetMapping("/lista-genero")
    public String lis_genero(Model model, @RequestParam(required = false) String genero) {

        model.addAttribute("busqueda", productoService.listarGenero(genero));

        return "listar-productos";
    }

    @GetMapping("/eliminar")
    public String eliminarProducto(@RequestParam String id) {
        productoService.eliminarProd(id);
        return "redirect:/usuarios/admin#lista-productos";
    }

    @GetMapping("/producto-descripcion")
    public String productoDescripcion(Model model,@RequestParam String id){
        model.addAttribute("producto",productoService.buscarPorId(id));
        return "producto-descripcion";
    }

}


