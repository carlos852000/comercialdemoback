package com.pe.app.backoffice.model.request;

import com.pe.app.transversal.model.request.BaseBeanRequest;

public class MovimientoDetalleRequest extends BaseBeanRequest {
	private Integer tipoAccion;
	private Integer idmovimientodetalle;
	private Integer idmovimiento;
	private Integer idtipomovimiento;
	private Integer idproducto;
	private Integer idproductodetalle;
	private Integer idproveedor;
	private Integer idunidadmedida;
	private Integer cantidad;
	private Float preciocosto;
	private Float total;
	private Integer vistobueno;
	private Integer totalFilasPorPage;
	private Integer nroPage;
	private Integer totalFilas;
	private Integer totalPages;
	public Integer getTipoAccion() {
		return tipoAccion;
	}
	public void setTipoAccion(Integer tipoAccion) {
		this.tipoAccion = tipoAccion;
	}
	public Integer getIdmovimientodetalle() {
		return idmovimientodetalle;
	}
	public void setIdmovimientodetalle(Integer idmovimientodetalle) {
		this.idmovimientodetalle = idmovimientodetalle;
	}
	public Integer getIdmovimiento() {
		return idmovimiento;
	}
	public void setIdmovimiento(Integer idmovimiento) {
		this.idmovimiento = idmovimiento;
	}
	public Integer getIdtipomovimiento() {
		return idtipomovimiento;
	}
	public void setIdtipomovimiento(Integer idtipomovimiento) {
		this.idtipomovimiento = idtipomovimiento;
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
	public Integer getIdunidadmedida() {
		return idunidadmedida;
	}
	public void setIdunidadmedida(Integer idunidadmedida) {
		this.idunidadmedida = idunidadmedida;
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
	public Integer getVistobueno() {
		return vistobueno;
	}
	public void setVistobueno(Integer vistobueno) {
		this.vistobueno = vistobueno;
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
	
}
