package ecommerce.com.ecommerce.controller;

import ecommerce.com.ecommerce.service.TransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaccion")
public class TransaccionController {

    @Autowired
    TransaccionService transaccionService;

    @GetMapping("/crear")
    public String crear_trans (Model model, @RequestParam(required = false) String id) {
        if (id != null) {
            model.addAttribute("productos", transaccionService.listarPorId(id));
        } else {
            model.addAttribute("productos", transaccionService.listarTodas());
        }
        return "lista-transaccion";
    }





}
