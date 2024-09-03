package com.pe.app.backoffice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
import com.pe.app.backoffice.repository.ClienteMapper;
import com.pe.app.transversal.model.response.DataResponse;
import com.pe.app.transversal.utils.Funciones;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	public ClienteMapper mapper;

	@Override
	public DataResponse buscarCliente(ClienteRequest request) throws Exception {
		ListarClienteResponse dataDB = mapper.buscarCliente(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse buscarCliente02(ClienteRequest request) throws Exception {
		List<ListarClienteResponse> dataDB = mapper.buscarCliente02(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse listarCliente(ClienteRequest request) throws Exception {
		List<ListarClienteResponse> dataDB = mapper.listarCliente(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		dataResponse.setTotalFilas(request.getTotalFilas());
		dataResponse.setTotalPages(request.getTotalPages());
		return dataResponse;
	}

	@Override
	public DataResponse eliminarCliente(ClienteRequest request) throws Exception {
		EliminarClienteResponse dataDB = mapper.eliminarCliente(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}

	@Override
	public DataResponse procesaCliente(ClienteRequest request) throws Exception {
		ProcesaClienteResponse dataDB = mapper.procesaCliente(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}

	@Override
	public DataResponse listarClienteGrupo(ClienteGrupoRequest request) throws Exception {
		List<ListarClienteGrupoResponse> dataDB = mapper.listarClienteGrupo(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		dataResponse.setTotalFilas(request.getTotalFilas());
		dataResponse.setTotalPages(request.getTotalPages());
		return dataResponse;
	}

	@Override
	public DataResponse eliminarClienteGrupo(ClienteGrupoRequest request) throws Exception {
		EliminarClienteGrupoResponse dataDB = mapper.eliminarClienteGrupo(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}

	@Override
	public DataResponse procesaClienteGrupo(ClienteGrupoRequest request) throws Exception {
		ProcesaClienteGrupoResponse dataDB = mapper.procesaClienteGrupo(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse listarClienteGrupoDetalle(ClienteGrupoDetalleRequest request) throws Exception {
		List<ListarClienteGrupoDetalleResponse> dataDB = mapper.listarClienteGrupoDetalle(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		dataResponse.setTotalFilas(request.getTotalFilas());
		dataResponse.setTotalPages(request.getTotalPages());
		return dataResponse;
	}

	@Override
	public DataResponse eliminarClienteGrupoDetalle(ClienteGrupoDetalleRequest request) throws Exception {
		EliminarClienteGrupoDetalleResponse dataDB = mapper.eliminarClienteGrupoDetalle(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}

	@Override
	public DataResponse procesaClienteGrupoDetalle(ClienteGrupoDetalleRequest request) throws Exception {
		ProcesaClienteGrupoDetalleResponse dataDB = mapper.procesaClienteGrupoDetalle(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
}
