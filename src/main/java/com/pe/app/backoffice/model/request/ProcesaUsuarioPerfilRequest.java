package com.pe.app.backoffice.model.request;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class ProcesaUsuarioPerfilRequest extends BaseBeanRequest{
	private Integer idusuariosistema;
	private Integer idperfil;
	private Integer accion;
	public Integer getIdusuariosistema() {
		return idusuariosistema;
	}
	public void setIdusuariosistema(Integer idusuariosistema) {
		this.idusuariosistema = idusuariosistema;
	}
	public Integer getIdperfil() {
		return idperfil;
	}
	public void setIdperfil(Integer idperfil) {
		this.idperfil = idperfil;
	}
	public Integer getAccion() {
		return accion;
	}
	public void setAccion(Integer accion) {
		this.accion = accion;
	}
	

}
