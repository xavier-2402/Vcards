package com.ista.springboot.vcard.app.model.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ciudad {
	
	@Value("${ciudad.codigo}")
	private String codCiudad;
	@Value("${ciudad.nombre}")
	private String nombreCiudad;
	
	
	/*
	public Ciudad(String codCiudad, String nombreCiudad) {
	
		this.codCiudad = codCiudad;
		this.nombreCiudad = nombreCiudad;
	}*/
	
	public String getCodCiudad() {
		return codCiudad;
	}
	public void setCodCiudad(String codCiudad) {
		this.codCiudad = codCiudad;
	}
	public String getNombreCiudad() {
		return nombreCiudad;
	}
	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
	
	

}
