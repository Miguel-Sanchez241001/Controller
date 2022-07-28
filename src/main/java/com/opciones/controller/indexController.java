package com.opciones.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.opciones.model.Usuario;

@Controller
@RequestMapping("/app") // nivel en la ruta
public class indexController {
	
	String template = "index";
	
	
	@RequestMapping(value = {"index","/","","home"}, method = RequestMethod.GET)	
	public String statIn(Model model) {

		model.addAttribute("Titulo", "Hola pes gil te estoy escribiendo desde el servidor"); // envio de datos
		return template;
	}	
	
	@GetMapping(value = {"perfil","per"})
	public String perfil(Model model) {
		Usuario user = new Usuario();
		user.setApellido("Herrera");
		user.setNombre("Miguel");
		user.setTelefono(999445612);
		model.addAttribute("usuario", user);
		
		model.addAttribute("titulo", "Hola ".concat(user.getNombre()));
		
		
		return "perfil";
	}
	
}
