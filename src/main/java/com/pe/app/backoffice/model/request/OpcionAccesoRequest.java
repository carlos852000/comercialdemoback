package com.pe.app.backoffice.model.request;

import java.util.List;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class OpcionAccesoRequest extends BaseBeanRequest{
	private Integer idsistema;
	private Integer idperfil;
	private Integer idopcion;
	private Integer accion;
	private List<AccesoRequest> datosAcceso;

	public List<AccesoRequest> getDatosAcceso() {
		return datosAcceso;
	}

	public void setDatosAcceso(List<AccesoRequest> datosAcceso) {
		this.datosAcceso = datosAcceso;
	}

	public Integer getIdsistema() {
		return idsistema;
	}

	public void setIdsistema(Integer idsistema) {
		this.idsistema = idsistema;
	}

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

	public Integer getAccion() {
		return accion;
	}

	public void setAccion(Integer accion) {
		this.accion = accion;
	}
	
	
}
