package com.pe.app.backoffice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.app.backoffice.model.request.CatalogoDetalleRequest;
import com.pe.app.backoffice.model.request.CatalogoRequest;
import com.pe.app.backoffice.model.response.EliminarCatalogoDetalleResponse;
import com.pe.app.backoffice.model.response.EliminarCatalogoResponse;
import com.pe.app.backoffice.model.response.ListarCatalogoResponse;
import com.pe.app.backoffice.model.response.ProcesaCatalogoDetalleResponse;
import com.pe.app.backoffice.model.response.ProcesaCatalogoResponse;
import com.pe.app.backoffice.model.response.VerificaCatalogoResponse;
import com.pe.app.backoffice.repository.CatalogoMapper;
import com.pe.app.transversal.model.response.DataResponse;
import com.pe.app.transversal.utils.Funciones;

@Service
public class CatalogoServiceImpl implements CatalogoService {

	@Autowired
	public CatalogoMapper mapper;

	@Override
	public DataResponse verificarCatalogo(CatalogoRequest request) throws Exception {
		VerificaCatalogoResponse dataDB = mapper.verificarCatalogo(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse verificarCatalogoDetalle(CatalogoRequest request) throws Exception {
		VerificaCatalogoResponse dataDB = mapper.verificarCatalogoDetalle(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse listarCatalogo(CatalogoRequest request) throws Exception {
		List<ListarCatalogoResponse> dataDB = mapper.listarCatalogo(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse listarCatalogoDetalle(CatalogoDetalleRequest request) throws Exception {
		List<ListarCatalogoResponse> dataDB = mapper.listarCatalogoDetalle(request);
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
	public DataResponse eliminarCatalogo(CatalogoRequest request) throws Exception {
		EliminarCatalogoResponse dataDB = mapper.eliminarCatalogo(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}

	@Override
	public DataResponse procesaCatalogo(CatalogoRequest request) throws Exception {
		ProcesaCatalogoResponse dataDB = mapper.procesaCatalogo(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}

	
	@Override
	public DataResponse eliminarCatalogoDetalle(CatalogoRequest request) throws Exception {
		EliminarCatalogoDetalleResponse dataDB = mapper.eliminarCatalogoDetalle(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}

	@Override
	public DataResponse procesaCatalogoDetalle(CatalogoRequest request) throws Exception {
		ProcesaCatalogoDetalleResponse dataDB = mapper.procesaCatalogoDetalle(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	
}
