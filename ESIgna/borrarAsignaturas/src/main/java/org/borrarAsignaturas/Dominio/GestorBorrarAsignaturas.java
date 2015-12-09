package org.borrarAsignaturas.Dominio;

import org.borrarAsignaturas.Persistencia.AgenteBorrarAsignaturas;
import org.crearAsignaturas.Dominio.Asignatura;

public class GestorBorrarAsignaturas {

	public GestorBorrarAsignaturas(){
		
	}
	
	public boolean borrarAsignatura(Asignatura asig){
		AgenteBorrarAsignaturas agent=new AgenteBorrarAsignaturas();
		return agent.borrarAsignatura(asig);
	}
}
