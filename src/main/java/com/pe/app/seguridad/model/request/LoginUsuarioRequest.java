package com.pe.app.seguridad.model.request;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class LoginUsuarioRequest extends BaseBeanRequest{

	private String username;
	private String clave;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
}
