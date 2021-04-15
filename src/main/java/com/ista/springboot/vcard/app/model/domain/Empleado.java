package com.ista.springboot.vcard.app.model.domain;

public class Empleado {
	
	private String nombre;
	private String horario;
	private String correo;
	private String celular;
	private String cargo;
	private Ciudad ciudad;
	private Sucursal sucursal;
	
	
	
	public Empleado(String nombre, String horario, String correo, String celular, String cargo, Ciudad ciudad,Sucursal sucursal) {
		this.nombre = nombre;
		this.horario = horario;
		this.correo = correo;
		this.celular = celular;
		this.cargo = cargo;
		this.ciudad = ciudad;
		this.sucursal = sucursal;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getCelular() {
		return celular;
	}
	public void setCeular(String celular) {
		this.celular = celular;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Ciudad getCiudad() {
		return ciudad;
	}
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	public Sucursal getSucursal() {
		return sucursal;
	}
	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
	

}
