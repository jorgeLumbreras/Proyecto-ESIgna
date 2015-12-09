package org.modificarAsignatura.Dominio;

import org.crearAsignaturas.Dominio.Asignatura;
import org.modificarAsignatura.Persistencia.AgenteModificarAsignaturas;

public class GestorModificarAsignaturas {
	
	public GestorModificarAsignaturas(){
		
	}
	public boolean modificarAsignatura(Asignatura asig, String nom, String cur){
		AgenteModificarAsignaturas agent = new AgenteModificarAsignaturas();
		return agent.modificarAsignatura(asig, nom, cur);
	}
}
