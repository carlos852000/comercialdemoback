package com.pe.app.backoffice.model.request;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class UsuarioRequest  extends BaseBeanRequest{
	private Integer tipoaccion;
	private Integer idsistema;
	private Integer idperfil;
	private Integer idusuariosistema;
	private Integer idpersonasistema;
	private Integer idtipodocumentousuario;
	private Integer idtienda;
	private String nrodocumentousuario;
	private String apellidopaternousuario;
	private String apellidomaternousuario;
	private String nombreusuario;
	private String nuevaclave;
	private Integer idsexousuario;
	private String emailusuario;
	private Integer totalFilasPorPage;
	private Integer nroPage;
	private Integer totalFilas;
	private Integer totalPages;
	public Integer getTipoaccion() {
		return tipoaccion;
	}
	public void setTipoaccion(Integer tipoaccion) {
		this.tipoaccion = tipoaccion;
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
	public Integer getIdusuariosistema() {
		return idusuariosistema;
	}
	public void setIdusuariosistema(Integer idusuariosistema) {
		this.idusuariosistema = idusuariosistema;
	}
	public Integer getIdpersonasistema() {
		return idpersonasistema;
	}
	public void setIdpersonasistema(Integer idpersonasistema) {
		this.idpersonasistema = idpersonasistema;
	}
	public Integer getIdtipodocumentousuario() {
		return idtipodocumentousuario;
	}
	public void setIdtipodocumentousuario(Integer idtipodocumentousuario) {
		this.idtipodocumentousuario = idtipodocumentousuario;
	}
	public String getNrodocumentousuario() {
		return nrodocumentousuario;
	}
	public void setNrodocumentousuario(String nrodocumentousuario) {
		this.nrodocumentousuario = nrodocumentousuario;
	}
	public String getApellidopaternousuario() {
		return apellidopaternousuario;
	}
	public void setApellidopaternousuario(String apellidopaternousuario) {
		this.apellidopaternousuario = apellidopaternousuario;
	}
	public String getApellidomaternousuario() {
		return apellidomaternousuario;
	}
	public void setApellidomaternousuario(String apellidomaternousuario) {
		this.apellidomaternousuario = apellidomaternousuario;
	}
	public String getNombreusuario() {
		return nombreusuario;
	}
	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}
	public String getNuevaclave() {
		return nuevaclave;
	}
	public void setNuevaclave(String nuevaclave) {
		this.nuevaclave = nuevaclave;
	}
	public Integer getIdsexousuario() {
		return idsexousuario;
	}
	public void setIdsexousuario(Integer idsexousuario) {
		this.idsexousuario = idsexousuario;
	}
	public String getEmailusuario() {
		return emailusuario;
	}
	public void setEmailusuario(String emailusuario) {
		this.emailusuario = emailusuario;
	}
	public Integer getTotalFilasPorPage() {
		return totalFilasPorPage;
	}
	public void setTotalFilasPorPage(Integer totalFilasPorPage) {
		this.totalFilasPorPage = totalFilasPorPage;
	}
	public Integer getNroPage() {
		return nroPage;
	}
	public void setNroPage(Integer nroPage) {
		this.nroPage = nroPage;
	}
	public Integer getTotalFilas() {
		return totalFilas;
	}
	public void setTotalFilas(Integer totalFilas) {
		this.totalFilas = totalFilas;
	}
	public Integer getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}
	public Integer getIdtienda() {
		return idtienda;
	}
	public void setIdtienda(Integer idtienda) {
		this.idtienda = idtienda;
	}
	
}
