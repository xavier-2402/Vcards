package com.ista.springboot.vcard.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ista.springboot.vcard.app.model.domain.Ciudad;
import com.ista.springboot.vcard.app.model.domain.Empleado;
import com.ista.springboot.vcard.app.model.domain.Sucursal;

@Configuration
public class AppConfig {
	
	@Bean("Empleado")
	public List<Empleado> AgregarEmpleado() {
		
		Ciudad ciudad = new Ciudad();
		Sucursal sucursal = new Sucursal();
		
		
		Empleado empleado1 = new Empleado("Xavier Yanza","Lunes a vienes (09:00-19:00)","xavier.y.2013@gmail.com","0960909098","Gerente General",ciudad,sucursal);
		Empleado empleado2 = new Empleado("Jessica Alvarez","Lunes a vienes (06:00-14:00)","jessi.1998@gmail.com","0977684321","Gerente de Compras",ciudad,sucursal);
		Empleado empleado3 = new Empleado("Juan Mendoza","Lunes a vienes (14:00-22:00)","juanm@gmail.com","0976543219","Desarrollador",ciudad,sucursal	);
		
		
		return Arrays.asList(empleado1,empleado2,empleado3);
		//return empleado1;
		
	}

}
