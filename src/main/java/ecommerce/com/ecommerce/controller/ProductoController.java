package ecommerce.com.ecommerce.controller;

import ecommerce.com.ecommerce.Exceptions.ServiceException;
import ecommerce.com.ecommerce.domain.Foto;
import ecommerce.com.ecommerce.domain.Producto;
import ecommerce.com.ecommerce.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
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

    @GetMapping("/carga-producto")
    public String cargarProducto(Model model, @ModelAttribute(value = "producto") Producto producto){
        return "carga-producto";
    }

    @PostMapping("/cargar")
    public String cargarProducto(@ModelAttribute Producto producto, ArrayList <MultipartFile> archivox
                                 )throws ServiceException {

        productoService.crear(producto,archivox);
        return "index";
        
    }
}
