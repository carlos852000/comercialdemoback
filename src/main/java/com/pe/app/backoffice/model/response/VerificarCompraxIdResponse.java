package com.pe.app.backoffice.model.response;

import java.util.Date;

public class VerificarCompraxIdResponse {
	private Integer idcompra;
	private Integer idproveedor;
	private Integer idtiendarecepcion;
	private Integer idestadocompra;
	private Date fechacompra;
	private Date fechaentrega;
	private String referencia;
	private Float montosinigv;
	private Float montoigv;
	private Integer incluidoigv;
	private Float montototal;
	private String representante;
	private String tienda;
	private String estadocompra;
	private Integer idtipoemision;
	private String numerodocumento;
	public Integer getIdcompra() {
		return idcompra;
	}
	public void setIdcompra(Integer idcompra) {
		this.idcompra = idcompra;
	}
	public Integer getIdproveedor() {
		return idproveedor;
	}
	public void setIdproveedor(Integer idproveedor) {
		this.idproveedor = idproveedor;
	}
	public Integer getIdtiendarecepcion() {
		return idtiendarecepcion;
	}
	public void setIdtiendarecepcion(Integer idtiendarecepcion) {
		this.idtiendarecepcion = idtiendarecepcion;
	}
	public Integer getIdestadocompra() {
		return idestadocompra;
	}
	public void setIdestadocompra(Integer idestadocompra) {
		this.idestadocompra = idestadocompra;
	}
	public Date getFechacompra() {
		return fechacompra;
	}
	public void setFechacompra(Date fechacompra) {
		this.fechacompra = fechacompra;
	}
	public Date getFechaentrega() {
		return fechaentrega;
	}
	public void setFechaentrega(Date fechaentrega) {
		this.fechaentrega = fechaentrega;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public Float getMontosinigv() {
		return montosinigv;
	}
	public void setMontosinigv(Float montosinigv) {
		this.montosinigv = montosinigv;
	}
	public Float getMontoigv() {
		return montoigv;
	}
	public void setMontoigv(Float montoigv) {
		this.montoigv = montoigv;
	}
	public Integer getIncluidoigv() {
		return incluidoigv;
	}
	public void setIncluidoigv(Integer incluidoigv) {
		this.incluidoigv = incluidoigv;
	}
	public Float getMontototal() {
		return montototal;
	}
	public void setMontototal(Float montototal) {
		this.montototal = montototal;
	}
	public String getRepresentante() {
		return representante;
	}
	public void setRepresentante(String representante) {
		this.representante = representante;
	}
	public String getTienda() {
		return tienda;
	}
	public void setTienda(String tienda) {
		this.tienda = tienda;
	}
	public String getEstadocompra() {
		return estadocompra;
	}
	public void setEstadocompra(String estadocompra) {
		this.estadocompra = estadocompra;
	}
	public Integer getIdtipoemision() {
		return idtipoemision;
	}
	public void setIdtipoemision(Integer idtipoemision) {
		this.idtipoemision = idtipoemision;
	}
	public String getNumerodocumento() {
		return numerodocumento;
	}
	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}
	
}
