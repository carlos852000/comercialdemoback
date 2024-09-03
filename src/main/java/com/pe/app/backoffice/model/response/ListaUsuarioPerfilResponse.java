package com.pe.app.backoffice.model.response;

public class ListaUsuarioPerfilResponse {
	private Integer idperfil;
	private String nombre;
	private Integer idsistema;
	private Integer idmodulo;
	public Integer getIdperfil() {
		return idperfil;
	}
	public void setIdperfil(Integer idperfil) {
		this.idperfil = idperfil;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getIdsistema() {
		return idsistema;
	}
	public void setIdsistema(Integer idsistema) {
		this.idsistema = idsistema;
	}
	public Integer getIdmodulo() {
		return idmodulo;
	}
	public void setIdmodulo(Integer idmodulo) {
		this.idmodulo = idmodulo;
	}
	
}
