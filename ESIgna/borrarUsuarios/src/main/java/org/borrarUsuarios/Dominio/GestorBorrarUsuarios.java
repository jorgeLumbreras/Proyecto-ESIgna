package org.borrarUsuarios.Dominio;

import org.borrarUsuarios.Persistencia.AgenteBorrarUsuarios;
import org.crearUsuarios.Dominio.Usuario;

public class GestorBorrarUsuarios {

	public GestorBorrarUsuarios(){
		
	}
	
	public boolean borrarUsuario(Usuario user){
		AgenteBorrarUsuarios agent = new AgenteBorrarUsuarios();
		return agent.borrarUsuario(user);
	}
}
