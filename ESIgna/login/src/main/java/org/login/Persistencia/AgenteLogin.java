package org.login.Persistencia;

import org.crearUsuarios.Dominio.Usuario;

public class AgenteLogin {
	
	public AgenteLogin(){
		
	}
	public Usuario login(String nom, String pass){
		return new Usuario(nom,pass);
	}
}
