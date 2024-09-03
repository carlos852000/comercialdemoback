package com.pe.app.backoffice.model.response;

public class ListarClienteGrupoDetalleResponse {
	private Integer idclientegrupodet;
	private String numerodocumento;
	private String apellidopaterno;
	private String apellidomaterno;
	private String nombre;
	public Integer getIdclientegrupodet() {
		return idclientegrupodet;
	}
	public void setIdclientegrupodet(Integer idclientegrupodet) {
		this.idclientegrupodet = idclientegrupodet;
	}
	public String getNumerodocumento() {
		return numerodocumento;
	}
	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}
	public String getApellidopaterno() {
		return apellidopaterno;
	}
	public void setApellidopaterno(String apellidopaterno) {
		this.apellidopaterno = apellidopaterno;
	}
	public String getApellidomaterno() {
		return apellidomaterno;
	}
	public void setApellidomaterno(String apellidomaterno) {
		this.apellidomaterno = apellidomaterno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
