package com.pe.app.backoffice.model.response;

public class ListarTiendaResponse {
	private Integer idtienda;
	private Integer idtipo;
	private String nombre;
	private String telefono;
	private String direccion;
	private String email;
	private String tipotienda;
	private Integer indicadorcentral;

	public Integer getIdtienda() {
		return idtienda;
	}

	public void setIdtienda(Integer idtienda) {
		this.idtienda = idtienda;
	}

	public Integer getIdtipo() {
		return idtipo;
	}

	public void setIdtipo(Integer idtipo) {
		this.idtipo = idtipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getIndicadorcentral() {
		return indicadorcentral;
	}

	public void setIndicadorcentral(Integer indicadorcentral) {
		this.indicadorcentral = indicadorcentral;
	}

	public String getTipotienda() {
		return tipotienda;
	}

	public void setTipotienda(String tipotienda) {
		this.tipotienda = tipotienda;
	}

	
}
