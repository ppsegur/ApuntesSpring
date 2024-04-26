package com.salesianostriana.dam.fragmanetoscontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;



@Controller
public class MainController {
@GetMapping("/")
public String index() {
    return "index";//Mostramos la plantilla del index Html
}

@GetMapping("/otra")
public String otra(Model model) {
   model.addAllAttributes("mensaje", "Este es un mensaje en una cadena");
   return "otrapagina";
}


}
