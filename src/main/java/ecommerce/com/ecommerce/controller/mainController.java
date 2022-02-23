package ecommerce.com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class mainController {
        @GetMapping("/")
        public String index() {
            return "index";
        }
<<<<<<< HEAD
 //sarasa       
=======
>>>>>>> 592cc0c2936913dcf366443f8f4e68066a5c5c2c
}
