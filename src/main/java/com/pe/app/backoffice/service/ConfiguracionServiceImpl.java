package com.pe.app.backoffice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.app.backoffice.model.request.ConfiguracionRequest;
import com.pe.app.backoffice.model.response.ProcesaConfiguracionResponse;
import com.pe.app.backoffice.model.response.VerificaConfiguracionResponse;
import com.pe.app.backoffice.repository.ConfiguracionMapper;
import com.pe.app.transversal.model.response.DataResponse;
import com.pe.app.transversal.utils.Funciones;

@Service
public class ConfiguracionServiceImpl implements ConfiguracionService {

	@Autowired
	public ConfiguracionMapper mapper;

	@Override
	public DataResponse verificarDatos(ConfiguracionRequest request) throws Exception {
		VerificaConfiguracionResponse dataDB = mapper.verificarDatos(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse procesaConfiguracion01(ConfiguracionRequest request) throws Exception {
		ProcesaConfiguracionResponse dataDB = mapper.procesaConfiguracion01(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
	@Override
	public DataResponse procesaConfiguracion02(ConfiguracionRequest request) throws Exception {
		ProcesaConfiguracionResponse dataDB = mapper.procesaConfiguracion02(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
}
