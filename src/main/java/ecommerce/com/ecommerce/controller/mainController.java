package ecommerce.com.ecommerce.controller;

import ecommerce.com.ecommerce.domain.Cart;
import ecommerce.com.ecommerce.domain.Producto;
import ecommerce.com.ecommerce.domain.Usuario;
import ecommerce.com.ecommerce.service.ProductoService;
import ecommerce.com.ecommerce.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/")
public class mainController {

    @Autowired
    private ProductoService productoService;
    @Autowired
    private UsuarioService usuarioService;

    Cart cart = new Cart();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("productos", productoService.listarTodos());
        model.addAttribute("descuentos",productoService.listarDescuentos());
        return "index";
    }

    @GetMapping("/home")
    public String home(Model model, HttpSession session){
        model.addAttribute("productos", productoService.listarTodos());
        model.addAttribute("descuentos",productoService.listarDescuentos());
        return "index";
    }

    @PreAuthorize("hasAnyRole('ROLE_USER','ROLE_ADMIN')")
    @GetMapping("/addCart")
    public String addCart(Model model,@RequestParam String id) {
        List<Producto>carrito = new ArrayList<>();
        carrito.add(productoService.buscarPorId(id));
        model.addAttribute("carrito", carrito);
        return "carrito";
    }
}
