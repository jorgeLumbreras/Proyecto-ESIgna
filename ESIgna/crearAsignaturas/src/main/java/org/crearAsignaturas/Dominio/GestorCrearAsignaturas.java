package org.crearAsignaturas.Dominio;

import org.crearAsignaturas.Persistencia.AgenteCrearAsignaturas;

public class GestorCrearAsignaturas {

	public GestorCrearAsignaturas(){
		
	}
	
	public boolean crearAsignatura(){
		AgenteCrearAsignaturas agent = new AgenteCrearAsignaturas();
		return agent.crearAsignatura();
	}
}
