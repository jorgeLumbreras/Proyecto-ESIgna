package org.crearUsuarios.Dominio;

import org.crearUsuarios.Persistencia.AgenteCrearUsuarios;

public class GestorCrearUsuarios {
	
	public GestorCrearUsuarios(){
		
	}
	public boolean crearUsuario(){
		AgenteCrearUsuarios agent=new AgenteCrearUsuarios();
		return agent.crearUsuario();
	}
}
