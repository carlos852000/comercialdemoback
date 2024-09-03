package com.pe.app.backoffice.model.request;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class AccesoRequest  extends BaseBeanRequest{
	private Integer idperfil;
	private Integer idopcion;
	private Integer acceso;
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
	public Integer getAcceso() {
		return acceso;
	}
	public void setAcceso(Integer acceso) {
		this.acceso = acceso;
	}
	
	
}
