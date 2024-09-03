package com.pe.app.backoffice.repository;

import org.apache.ibatis.annotations.Mapper;

import com.pe.app.backoffice.model.request.ConfiguracionRequest;
import com.pe.app.backoffice.model.response.ProcesaConfiguracionResponse;
import com.pe.app.backoffice.model.response.VerificaConfiguracionResponse;

@Mapper
public interface ConfiguracionMapper {

	VerificaConfiguracionResponse verificarDatos(ConfiguracionRequest request) throws Exception;
	ProcesaConfiguracionResponse procesaConfiguracion01(ConfiguracionRequest request) throws Exception;
	ProcesaConfiguracionResponse procesaConfiguracion02(ConfiguracionRequest request) throws Exception;
}
