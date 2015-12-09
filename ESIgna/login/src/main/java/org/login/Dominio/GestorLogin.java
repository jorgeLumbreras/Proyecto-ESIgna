package org.login.Dominio;

import org.crearUsuarios.Dominio.Usuario;
import org.login.Persistencia.AgenteLogin;

public class GestorLogin {
	
	public GestorLogin(){
		
	}
	public Usuario login(String nom, String pass){
		AgenteLogin agent= new AgenteLogin();
		return agent.login(nom, pass);
	}
}
