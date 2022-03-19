package ecommerce.com.ecommerce.controller;

import ecommerce.com.ecommerce.domain.Usuario;
import ecommerce.com.ecommerce.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("")
    public String login(Model model, @RequestParam(required = false) String error, @RequestParam(required = false) String username,
                        @RequestParam(required = false)String logout, HttpSession session){
        if (error != null) {
            model.addAttribute("error", "el usuario o la contraseña ingresadas no son validas");
        }
        if (username != null) {
            model.addAttribute("username", username);
            session.setAttribute("idusuario", usuarioService.findByUser(username).getId());
        }
        return "login";
    }
}


