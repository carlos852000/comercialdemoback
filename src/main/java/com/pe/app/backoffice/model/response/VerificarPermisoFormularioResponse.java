package com.pe.app.backoffice.model.response;

import java.util.List;

public class VerificarPermisoFormularioResponse {
	private Integer permiso;
	private Integer idacceso;
	private Integer idaccesoboton;
	private List<VerificarAccesoBotonResponse> listBotones;
	public Integer getPermiso() {
		return permiso;
	}
	public void setPermiso(Integer permiso) {
		this.permiso = permiso;
	}
	public Integer getIdacceso() {
		return idacceso;
	}
	public void setIdacceso(Integer idacceso) {
		this.idacceso = idacceso;
	}
	public List<VerificarAccesoBotonResponse> getListBotones() {
		return listBotones;
	}
	public void setListBotones(List<VerificarAccesoBotonResponse> listBotones) {
		this.listBotones = listBotones;
	}
	public Integer getIdaccesoboton() {
		return idaccesoboton;
	}
	public void setIdaccesoboton(Integer idaccesoboton) {
		this.idaccesoboton = idaccesoboton;
	}
	
}
