package ecommerce.com.ecommerce.controller;

import ecommerce.com.ecommerce.domain.Producto;
import ecommerce.com.ecommerce.service.ProductoService;
import ecommerce.com.ecommerce.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
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

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("productos", productoService.listarTodos());
        model.addAttribute("descuentos",productoService.listarDescuentos());
        return "index";
    }

    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("productos", productoService.listarTodos());
        model.addAttribute("descuentos",productoService.listarDescuentos());
        List<Producto>carrito = new ArrayList<>();
        model.addAttribute("carrito",carrito);
        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpSession session = attr.getRequest().getSession(true);
        session.setAttribute("usuariocarrito",carrito);
        return "index";
    }

    @PreAuthorize("hasAnyRole('ROLE_USER','ROLE_ADMIN')")
    @GetMapping("/addCart")
    public String addCart(Model model,@RequestParam String id) {
        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpSession session = attr.getRequest().getSession(true);
        List<Producto>carrito =(List<Producto>)session.getAttribute("usuariocarrito");
        Producto producto = productoService.buscarPorId(id);
        Boolean flag = false;
        if (carrito.size()==0){
            carrito.add(producto);}

        if(carrito.size()!=0){
            flag=false;
            for (Producto p : carrito) {
                if (p.getId().equals(producto.getId())) {
                    flag=true;
                    p.setCantidad((p.getCantidad())+1);
                    p.setPrecioFinal((producto.getPrecioFinal() * p.getCantidad()));
                }
            }
            if (flag==false){
                carrito.add(producto);
            }
        }
        model.addAttribute("carrito", carrito);
        session.setAttribute("usuariocarrito", carrito);
        return "carrito";
    }

    @PreAuthorize("hasAnyRole('ROLE_USER','ROLE_ADMIN')")
    @GetMapping("/cart")
    public String getCart(Model model) {
        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpSession session = attr.getRequest().getSession(true);
        session.getAttribute("usuariocarrito");
        model.addAttribute("carrito",session.getAttribute("usuariocarrito"));
        return "carrito";
    }

    @PreAuthorize("hasAnyRole('ROLE_USER','ROLE_ADMIN')")
    @GetMapping("/removecart")
    public String removeCart(Model model,@RequestParam String id) {
        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpSession session = attr.getRequest().getSession(true);
        List<Producto>carrito =(List<Producto>)session.getAttribute("usuariocarrito");
        for (Producto a:carrito) {
            if(a.getId().equals(id)){
                carrito.remove(a);
                break;
            }
        }
        session.setAttribute("usuariocarrito", carrito);
        model.addAttribute("carrito",session.getAttribute("usuariocarrito"));
        return "redirect:/cart";
    }


}
