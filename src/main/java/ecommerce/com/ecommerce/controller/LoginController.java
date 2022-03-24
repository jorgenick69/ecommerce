package ecommerce.com.ecommerce.controller;

import ecommerce.com.ecommerce.Exceptions.ServiceException;
import ecommerce.com.ecommerce.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("")
    public String login(Model model, @RequestParam(required = false) String error, @RequestParam(required = false) String nombreusuario,
                        @RequestParam(required = false)String logout) throws ServiceException {
        if (error != null) {
            model.addAttribute("error", "Usuario o Contraseña son incorrectas");
        }
        if (nombreusuario != null) {
            model.addAttribute("username", nombreusuario);
        }
        return "login";
    }
}


