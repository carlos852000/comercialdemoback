package com.pe.app.seguridad.model.response;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class LoginUsuarioResponse extends BaseBeanRequest {
	
	private Integer idusuario;
	private String nickname;
	private String clave;
	private Integer bloqueo;
	
	public Integer getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public Integer getBloqueo() {
		return bloqueo;
	}
	public void setBloqueo(Integer bloqueo) {
		this.bloqueo = bloqueo;
	}
	
	
}
