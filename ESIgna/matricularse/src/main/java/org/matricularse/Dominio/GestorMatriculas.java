package org.matricularse.Dominio;

import org.crearAsignaturas.Dominio.Asignatura;
import org.crearUsuarios.Dominio.Usuario;
import org.matricularse.Persistencia.AgenteMatriculas;

public class GestorMatriculas {
	
	public GestorMatriculas(){
		
	}
	public boolean matricular(Usuario user, Asignatura asig){
		AgenteMatriculas agent = new AgenteMatriculas();
		return agent.matricular(user, asig);
	}
}
