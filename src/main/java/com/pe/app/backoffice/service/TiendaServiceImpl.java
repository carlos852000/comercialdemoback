package com.pe.app.backoffice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pe.app.backoffice.model.request.TiendaRequest;
import com.pe.app.backoffice.model.response.EliminarTiendaResponse;
import com.pe.app.backoffice.model.response.ListarTiendaResponse;
import com.pe.app.backoffice.model.response.ProcesaTiendaResponse;
import com.pe.app.backoffice.repository.TiendaMapper;
import com.pe.app.transversal.model.response.DataResponse;
import com.pe.app.transversal.utils.Funciones;

@Service
public class TiendaServiceImpl implements TiendaService {

	@Autowired
	public TiendaMapper mapper;

	@Override
	public DataResponse listarTienda(TiendaRequest request) throws Exception {
		List<ListarTiendaResponse> dataDB = mapper.listarTienda(request);
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
	public DataResponse procesaTienda(TiendaRequest request) throws Exception {
		ProcesaTiendaResponse dataDB = mapper.procesaTienda(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse eliminarTienda(TiendaRequest request) throws Exception {
		EliminarTiendaResponse dataDB = mapper.eliminarTienda(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}

}
