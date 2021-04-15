package com.ista.springboot.vcard.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ista.springboot.vcard.app.AppConfig;
import com.ista.springboot.vcard.app.model.domain.Empleado;


@Controller
@RequestMapping("/empleado")
public class EmpleadoController {
	
	@Autowired()
	List<Empleado> empleado;
		
	@GetMapping("/ver")
	public String VerEmpleado(Model model) {
		model.addAttribute("titulo", "Datos Empleados");
		model.addAttribute("empleado", empleado);
		
		return "ver";
	}
	

}
