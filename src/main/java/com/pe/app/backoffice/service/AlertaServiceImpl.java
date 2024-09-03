package com.pe.app.backoffice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pe.app.backoffice.model.request.AlertaRequest;
import com.pe.app.backoffice.model.response.EliminarAlertaResponse;
import com.pe.app.backoffice.model.response.ListarAlertaResponse;
import com.pe.app.backoffice.model.response.ProcesaAlertaResponse;
import com.pe.app.backoffice.model.response.ProcesaContadorAlertaResponse;
import com.pe.app.backoffice.repository.AlertaMapper;
import com.pe.app.transversal.model.response.DataResponse;
import com.pe.app.transversal.utils.Funciones;

@Service
public class AlertaServiceImpl implements AlertaService {

	@Autowired
	public AlertaMapper mapper;

	@Override
	public DataResponse listarAlerta(AlertaRequest request) throws Exception {
		List<ListarAlertaResponse> dataDB = mapper.listarAlerta(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}

	@Override
	public DataResponse procesaAlerta(AlertaRequest request) throws Exception {
		ProcesaAlertaResponse dataDB = mapper.procesaAlerta(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	@Override
	public DataResponse procesaContadorAlerta(AlertaRequest request) throws Exception {
		ProcesaContadorAlertaResponse dataDB = mapper.procesaContadorAlerta(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse eliminarAlerta(AlertaRequest request) throws Exception {
		EliminarAlertaResponse dataDB = mapper.eliminarAlerta(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
}
