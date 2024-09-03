package com.pe.app.backoffice.model.request;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class UsuarioSistemaRequest  extends BaseBeanRequest{
	private Integer idusuariosistema;
	private Integer idperfil;
	private Integer idopcionpadre;
	private String nuevonickname;
	private String nuevaclave;
	private String emailusuario;
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
	public Integer getIdopcionpadre() {
		return idopcionpadre;
	}
	public void setIdopcionpadre(Integer idopcionpadre) {
		this.idopcionpadre = idopcionpadre;
	}
	public String getNuevonickname() {
		return nuevonickname;
	}
	public void setNuevonickname(String nuevonickname) {
		this.nuevonickname = nuevonickname;
	}
	public String getNuevaclave() {
		return nuevaclave;
	}
	public void setNuevaclave(String nuevaclave) {
		this.nuevaclave = nuevaclave;
	}
	public String getEmailusuario() {
		return emailusuario;
	}
	public void setEmailusuario(String emailusuario) {
		this.emailusuario = emailusuario;
	}
	
	
}
