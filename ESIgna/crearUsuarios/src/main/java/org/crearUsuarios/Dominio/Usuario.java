package org.crearUsuarios.Dominio;

public class Usuario {
	String nombre;
	String password;
	
	public Usuario(String nom, String pass){
		nombre=nom;
		password=pass;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
