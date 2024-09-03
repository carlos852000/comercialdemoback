package com.pe.app.backoffice.model.request;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class VerificaPermisosRequest  extends BaseBeanRequest{
	private Integer idperfil;
	private Integer idacceso;
	private String opcion;
	public Integer getIdperfil() {
		return idperfil;
	}
	public void setIdperfil(Integer idperfil) {
		this.idperfil = idperfil;
	}
	public String getOpcion() {
		return opcion;
	}
	public void setOpcion(String opcion) {
		this.opcion = opcion;
	}
	public Integer getIdacceso() {
		return idacceso;
	}
	public void setIdacceso(Integer idacceso) {
		this.idacceso = idacceso;
	}

}
