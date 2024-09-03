package com.pe.app.backoffice.model.response;

import java.util.Date;

public class ListarMovimientoResponse {
	private Integer idmovimiento;
	private Integer idtabla;
	private Date fechamovimiento;
	private Date fechaingreso;
	private Integer idproveedor;
	private Integer idsucursalorigen;
	private Integer idsucursaldestino;
	private Integer idestadomovimiento;
	private String estadomovimiento;
	private Integer idtipodocumento;
	private String nrodocumento;
	private String observacion;
	private Float montosinigv;
	private Float montoigv;
	private Float saldo;
	private Float montototal;
	private String referencia;
	private String referenciamovimiento;
	private String representante;
	private String tiendaorigen;
	private String tiendadestino;
	public Date getFechamovimiento() {
		return fechamovimiento;
	}
	public void setFechamovimiento(Date fechamovimiento) {
		this.fechamovimiento = fechamovimiento;
	}
	public Date getFechaingreso() {
		return fechaingreso;
	}
	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}
	public Integer getIdproveedor() {
		return idproveedor;
	}
	public void setIdproveedor(Integer idproveedor) {
		this.idproveedor = idproveedor;
	}
	public Integer getIdsucursalorigen() {
		return idsucursalorigen;
	}
	public void setIdsucursalorigen(Integer idsucursalorigen) {
		this.idsucursalorigen = idsucursalorigen;
	}
	public Integer getIdsucursaldestino() {
		return idsucursaldestino;
	}
	public void setIdsucursaldestino(Integer idsucursaldestino) {
		this.idsucursaldestino = idsucursaldestino;
	}
	public Integer getIdestadomovimiento() {
		return idestadomovimiento;
	}
	public void setIdestadomovimiento(Integer idestadomovimiento) {
		this.idestadomovimiento = idestadomovimiento;
	}
	public Integer getIdtipodocumento() {
		return idtipodocumento;
	}
	public void setIdtipodocumento(Integer idtipodocumento) {
		this.idtipodocumento = idtipodocumento;
	}
	public String getNrodocumento() {
		return nrodocumento;
	}
	public void setNrodocumento(String nrodocumento) {
		this.nrodocumento = nrodocumento;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
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
	public Float getSaldo() {
		return saldo;
	}
	public void setSaldo(Float saldo) {
		this.saldo = saldo;
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
	public String getTiendaorigen() {
		return tiendaorigen;
	}
	public void setTiendaorigen(String tiendaorigen) {
		this.tiendaorigen = tiendaorigen;
	}
	public String getTiendadestino() {
		return tiendadestino;
	}
	public void setTiendadestino(String tiendadestino) {
		this.tiendadestino = tiendadestino;
	}
	public String getEstadomovimiento() {
		return estadomovimiento;
	}
	public void setEstadomovimiento(String estadomovimiento) {
		this.estadomovimiento = estadomovimiento;
	}
	public Integer getIdmovimiento() {
		return idmovimiento;
	}
	public void setIdmovimiento(Integer idmovimiento) {
		this.idmovimiento = idmovimiento;
	}
	public Integer getIdtabla() {
		return idtabla;
	}
	public void setIdtabla(Integer idtabla) {
		this.idtabla = idtabla;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getReferenciamovimiento() {
		return referenciamovimiento;
	}
	public void setReferenciamovimiento(String referenciamovimiento) {
		this.referenciamovimiento = referenciamovimiento;
	}
	
	
}
