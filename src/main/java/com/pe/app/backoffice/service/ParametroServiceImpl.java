package com.pe.app.backoffice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.app.backoffice.model.request.ParametroRequest;
import com.pe.app.backoffice.model.response.VerificaParametroResponse;
import com.pe.app.backoffice.repository.ParametroMapper;
import com.pe.app.transversal.model.response.DataResponse;
import com.pe.app.transversal.utils.Funciones;

@Service
public class ParametroServiceImpl implements ParametroService {

	@Autowired
	public ParametroMapper mapper;

	@Override
	public DataResponse verificarParametroxAbreviatura(ParametroRequest request) throws Exception {
		VerificaParametroResponse dataDB = mapper.verificarParametroxAbreviatura(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
	
}
