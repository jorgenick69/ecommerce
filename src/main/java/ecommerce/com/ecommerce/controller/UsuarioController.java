package ecommerce.com.ecommerce.controller;

import ecommerce.com.ecommerce.Exceptions.ServiceException;
import ecommerce.com.ecommerce.domain.Usuario;
import ecommerce.com.ecommerce.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/lista")
    public String lis_usuario(Model model, @RequestParam(required = false) String id) {
        if (id != null) {
            model.addAttribute("usuarios", usuarioService.findById(id));
        } else {
            model.addAttribute("usuarios", usuarioService.listarTodos());
        }
        return "lista-usuario";
    }

    @GetMapping("/carga-usuario")
    public String cargarUsuario(Model model, @RequestParam(required = false) String id){

            if (id != null) {
                Usuario optional = usuarioService.findById(id);
                if (optional != null) {
                    model.addAttribute("usuario", optional);
                } else {
                    return "redirect:/usuario/lista";
                }
            } else {
                model.addAttribute("usuario", new Usuario());
            }
        return "carga-usuario";
    }

    @PostMapping("/cargar")
    public String reg_autor(Model model, @ModelAttribute Usuario usuario, MultipartFile archivo,@RequestParam String password2) throws ServiceException {
        usuarioService.crear(usuario,archivo,password2);
        return "index";
    }
}
