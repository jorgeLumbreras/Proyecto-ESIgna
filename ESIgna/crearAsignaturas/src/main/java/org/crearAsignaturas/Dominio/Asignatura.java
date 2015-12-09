package org.crearAsignaturas.Dominio;

public class Asignatura {
	String nombre;
	String curso;
	
	public Asignatura(String nom, String cur){
		nombre=nom;
		curso=cur;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
