package com.pe.app.backoffice.model.request;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class VerificarAccesoRequest extends BaseBeanRequest{
	private Integer idperfil;
	private Integer idopcion;
	public Integer getIdperfil() {
		return idperfil;
	}
	public void setIdperfil(Integer idperfil) {
		this.idperfil = idperfil;
	}
	public Integer getIdopcion() {
		return idopcion;
	}
	public void setIdopcion(Integer idopcion) {
		this.idopcion = idopcion;
	}

	
	
}
