package com.pe.app.backoffice.service;

import com.pe.app.backoffice.model.request.ConfiguracionRequest;
import com.pe.app.transversal.model.response.DataResponse;

public interface ConfiguracionService {

	public DataResponse verificarDatos(ConfiguracionRequest request) throws Exception;
	public DataResponse procesaConfiguracion01(ConfiguracionRequest request) throws Exception;
	public DataResponse procesaConfiguracion02(ConfiguracionRequest request) throws Exception;
}
