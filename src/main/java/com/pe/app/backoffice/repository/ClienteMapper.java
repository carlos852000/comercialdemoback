package com.pe.app.backoffice.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pe.app.backoffice.model.request.ClienteGrupoDetalleRequest;
import com.pe.app.backoffice.model.request.ClienteGrupoRequest;
import com.pe.app.backoffice.model.request.ClienteRequest;
import com.pe.app.backoffice.model.response.EliminarClienteGrupoDetalleResponse;
import com.pe.app.backoffice.model.response.EliminarClienteGrupoResponse;
import com.pe.app.backoffice.model.response.EliminarClienteResponse;
import com.pe.app.backoffice.model.response.ListarClienteGrupoDetalleResponse;
import com.pe.app.backoffice.model.response.ListarClienteGrupoResponse;
import com.pe.app.backoffice.model.response.ListarClienteResponse;
import com.pe.app.backoffice.model.response.ProcesaClienteGrupoDetalleResponse;
import com.pe.app.backoffice.model.response.ProcesaClienteGrupoResponse;
import com.pe.app.backoffice.model.response.ProcesaClienteResponse;

@Mapper
public interface ClienteMapper {

	ListarClienteResponse buscarCliente(ClienteRequest request) throws Exception;
	List<ListarClienteResponse> buscarCliente02(ClienteRequest request) throws Exception;
	List<ListarClienteResponse> listarCliente(ClienteRequest request) throws Exception;
	EliminarClienteResponse eliminarCliente(ClienteRequest request) throws Exception;
	ProcesaClienteResponse procesaCliente(ClienteRequest request) throws Exception;
	List<ListarClienteGrupoResponse> listarClienteGrupo(ClienteGrupoRequest request) throws Exception;
	EliminarClienteGrupoResponse eliminarClienteGrupo(ClienteGrupoRequest request) throws Exception;
	ProcesaClienteGrupoResponse procesaClienteGrupo(ClienteGrupoRequest request) throws Exception;
	List<ListarClienteGrupoDetalleResponse> listarClienteGrupoDetalle(ClienteGrupoDetalleRequest request) throws Exception;
	EliminarClienteGrupoDetalleResponse eliminarClienteGrupoDetalle(ClienteGrupoDetalleRequest request) throws Exception;
	ProcesaClienteGrupoDetalleResponse procesaClienteGrupoDetalle(ClienteGrupoDetalleRequest request) throws Exception;
}
