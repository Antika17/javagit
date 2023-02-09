package mipoo;

import java.time.LocalDate;

public class Person {
	private String nombre;
	private String direccion;
	private String codPostal;
	private String ciudad;
	private Fecha fechaNac;
	
	public Person(String nombre, String direccion, String codPostal, String ciudad, Fecha fechaNac) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.codPostal = codPostal;
		this.ciudad = ciudad;
		this.fechaNac = fechaNac;
	}
	
	

	public Person() {
			}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Fecha getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Fecha fechaNac) {
		this.fechaNac = fechaNac;
	}
	


	@Override
	public String toString() {
		return "Person [nombre=" + nombre + ", direccion=" + direccion + ", codPostal=" + codPostal + ", ciudad="
				+ ciudad + ", fechaNac=" + fechaNac + "]";
	}
	
	
		

}
