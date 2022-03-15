package ecommerce.com.ecommerce.controller;

import ecommerce.com.ecommerce.Exceptions.ServiceException;
import ecommerce.com.ecommerce.domain.Producto;
import ecommerce.com.ecommerce.domain.Usuario;
import ecommerce.com.ecommerce.enums.Rol;
import ecommerce.com.ecommerce.service.ProductoService;
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
    @Autowired
    private ProductoService productoService;

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
                return "redirect:/usuarios/lista";
            }
        } else {
            model.addAttribute("usuario", new Usuario());
        }
        return "carga-usuario";
    }

    @PostMapping("/cargar")
    public String cargarUsuario(Model model, @ModelAttribute Usuario usuario, MultipartFile archivo,@RequestParam String password2) throws ServiceException {
        usuario.setEstado(Boolean.TRUE);
        usuario.setRol(Rol.ADMIN);
        usuarioService.crear(usuario,archivo,password2);
        return "index";
    }

    @GetMapping("/eliminar")
    public String eliminarUsuario(String id){
       usuarioService.borrar(id);
       return "redirect:/usuarios/admin#usuarios";
    }

    ////////////CONTROLER DASHBOARD ADMIN////////////////
    @GetMapping("/admin")
    public String adminDashboard(Model model){
        model.addAttribute("productos",productoService.listarTodos());
        model.addAttribute("usuarios",usuarioService.listarTodos());
        model.addAttribute("cantidadUsuarios", usuarioService.listarTodos().size());
        model.addAttribute("cantidadProductos", productoService.listarTodos().size());
        return "admin-dashboard";
    }
}
