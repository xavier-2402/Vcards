package com.ista.springboot.vcard.app.model.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sucursal {

	/*
	public Sucursal(String codSucursal, String nombreSucursal, String codCiudad) {
		
		this.codSucursal = codSucursal;
		this.nombreSucursal = nombreSucursal;
		this.codCiudad = codCiudad;
	}
	*/
	@Value("${sucursal.codigo}")
	private String codSucursal;
	@Value("${sucursal.nombre}")
	private String nombreSucursal;
	@Value("${ciudad.codigo}")
	private String codCiudad;
	public String getCodSucursal() {
		return codSucursal;
	}
	public void setCodSucursal(String codSucursal) {
		this.codSucursal = codSucursal;
	}
	public String getNombreSucursal() {
		return nombreSucursal;
	}
	public void setNombreSucursal(String nombreSucursal) {
		this.nombreSucursal = nombreSucursal;
	}
	public String getCodCiudad() {
		return codCiudad;
	}
	public void setCodCiudad(String codCiudad) {
		this.codCiudad = codCiudad;
	}
	
	
	
	
}
