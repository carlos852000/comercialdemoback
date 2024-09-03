package com.pe.app.backoffice.model.request;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class CompraDetalleRequest extends BaseBeanRequest {
	private Integer tipoAccion;
	private Integer idcompradetalle;
	private Integer idcompra;
	private Integer idproducto;
	private Integer idproductodetalle;
	private Integer idproveedor;
	private Integer cantidad;
	private Float preciocosto;
	private Float total;
	private Integer idunidadmedida;
	public Integer getTipoAccion() {
		return tipoAccion;
	}
	public void setTipoAccion(Integer tipoAccion) {
		this.tipoAccion = tipoAccion;
	}
	public Integer getIdcompradetalle() {
		return idcompradetalle;
	}
	public void setIdcompradetalle(Integer idcompradetalle) {
		this.idcompradetalle = idcompradetalle;
	}
	public Integer getIdcompra() {
		return idcompra;
	}
	public void setIdcompra(Integer idcompra) {
		this.idcompra = idcompra;
	}
	public Integer getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}
	public Integer getIdproductodetalle() {
		return idproductodetalle;
	}
	public void setIdproductodetalle(Integer idproductodetalle) {
		this.idproductodetalle = idproductodetalle;
	}
	public Integer getIdproveedor() {
		return idproveedor;
	}
	public void setIdproveedor(Integer idproveedor) {
		this.idproveedor = idproveedor;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Float getPreciocosto() {
		return preciocosto;
	}
	public void setPreciocosto(Float preciocosto) {
		this.preciocosto = preciocosto;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	public Integer getIdunidadmedida() {
		return idunidadmedida;
	}
	public void setIdunidadmedida(Integer idunidadmedida) {
		this.idunidadmedida = idunidadmedida;
	}
	
	
}
