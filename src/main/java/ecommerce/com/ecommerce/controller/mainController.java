package ecommerce.com.ecommerce.controller;

import ecommerce.com.ecommerce.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class mainController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/")
    public String index(Model model, HttpSession session) {
        model.addAttribute("productos", productoService.listarTodos());
        model.addAttribute("sesion", session.getAttribute("idusuario"));
        return "index";
    }

    @GetMapping("/getCart")
    public String getCart(Model model, HttpSession session) {
/*
        model.addAttribute("cart", detalles);
        model.addAttribute("orden", orden);
*/
        //sesion
        model.addAttribute("sesion", session.getAttribute("idusuario"));
        return "/carrito";
    }
}
