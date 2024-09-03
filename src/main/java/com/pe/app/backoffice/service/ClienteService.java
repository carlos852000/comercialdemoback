package com.pe.app.backoffice.service;

import com.pe.app.backoffice.model.request.ClienteGrupoDetalleRequest;
import com.pe.app.backoffice.model.request.ClienteGrupoRequest;
import com.pe.app.backoffice.model.request.ClienteRequest;
import com.pe.app.transversal.model.response.DataResponse;

public interface ClienteService {
	
	public DataResponse listarCliente(ClienteRequest request) throws Exception;
	public DataResponse buscarCliente(ClienteRequest request) throws Exception;
	public DataResponse buscarCliente02(ClienteRequest request) throws Exception;
	public DataResponse eliminarCliente(ClienteRequest request) throws Exception;
	public DataResponse procesaCliente(ClienteRequest request) throws Exception;
	public DataResponse listarClienteGrupo(ClienteGrupoRequest request) throws Exception;
	public DataResponse eliminarClienteGrupo(ClienteGrupoRequest request) throws Exception;
	public DataResponse procesaClienteGrupo(ClienteGrupoRequest request) throws Exception;
	public DataResponse listarClienteGrupoDetalle(ClienteGrupoDetalleRequest request) throws Exception;
	public DataResponse eliminarClienteGrupoDetalle(ClienteGrupoDetalleRequest request) throws Exception;
	public DataResponse procesaClienteGrupoDetalle(ClienteGrupoDetalleRequest request) throws Exception;
	
}
