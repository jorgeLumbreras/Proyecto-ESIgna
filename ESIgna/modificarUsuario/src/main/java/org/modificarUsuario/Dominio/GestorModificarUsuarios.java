package org.modificarUsuario.Dominio;

import org.crearUsuarios.Dominio.Usuario;
import org.modificarUsuario.Persistencia.AgenteModificarUsuarios;

public class GestorModificarUsuarios {
 
	public GestorModificarUsuarios(){
		
	}
	
	public boolean modificarUsuario(Usuario user, String nom, String pass){
		AgenteModificarUsuarios agent = new AgenteModificarUsuarios();
		return agent.modificarUsuario(user, nom, pass);
	}
}
