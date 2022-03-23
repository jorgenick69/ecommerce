package ecommerce.com.ecommerce.controller;

import ecommerce.com.ecommerce.domain.Producto;
import ecommerce.com.ecommerce.domain.Transaccion;
import ecommerce.com.ecommerce.domain.Usuario;
import ecommerce.com.ecommerce.enums.Envio;
import ecommerce.com.ecommerce.enums.TransaccionEstado;
import ecommerce.com.ecommerce.service.TransaccionService;
import ecommerce.com.ecommerce.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/transaccion")
public class TransaccionController {

    @Autowired
    TransaccionService transaccionService;
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/compra")
    public String crear_trans (Model model,@RequestParam(required = false) String id) {
        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpSession session = attr.getRequest().getSession(true);
        Transaccion tx = new Transaccion();
        List<Producto>carrito=(List<Producto>)session.getAttribute("usuariocarrito");
        Usuario usuario = (Usuario)session.getAttribute("usuariosession");
        tx.setUsuario(usuario);
        tx.setCarrito(carrito);
        tx.setEstado(TransaccionEstado.PREPARACION);
        tx.setEnvio(Envio.DOMICILIO);
        tx.setFecha(new Date());
        transaccionService.crear(tx);
        return "redirect:/home";
    }




    
}
