package com.pe.app.backoffice.service;

import com.pe.app.backoffice.model.request.ParametroRequest;
import com.pe.app.transversal.model.response.DataResponse;

public interface ParametroService {

	public DataResponse verificarParametroxAbreviatura(ParametroRequest request) throws Exception;
	
}
