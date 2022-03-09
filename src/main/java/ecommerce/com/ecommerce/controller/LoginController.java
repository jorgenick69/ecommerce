package ecommerce.com.ecommerce.controller;

import ecommerce.com.ecommerce.domain.Transaccion;
import ecommerce.com.ecommerce.service.TransaccionService;
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
    TransaccionService transaccionService;

    @GetMapping("")
    public String login(Model model, @RequestParam(required = false) String error, @RequestParam(required = false) String username,
                        @RequestParam(required = false)String logout){
        if (error != null) {
            model.addAttribute("error", "el usuario o la contraseña ingresadas no son validas");
        }
        if (username != null) {
            model.addAttribute("username", username);
        }
        return "login";
    }
}


