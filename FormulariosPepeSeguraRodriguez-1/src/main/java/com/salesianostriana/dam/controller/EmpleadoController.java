package com.salesianostriana.dam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.model.Empleado;



@Controller
public class EmpleadoController {
	
	//Método get
	@GetMapping("/empleado")
	public String mostrarFormulario(Model model) {
		Empleado e = new Empleado();
		model.addAttribute("empleadoForm", e);
		return "login";
	}
	//Metodo post
	@PostMapping("/addEmpleado")
	public String submit(@ModelAttribute("empleadoForm") Empleado e, Model model) {
		model.addAttribute("empleado",e);
		return "view"; //recordar que en el return view significa una pagina de html 
	}
}
