package com.pe.app.backoffice.repository;

import org.apache.ibatis.annotations.Mapper;

import com.pe.app.backoffice.model.request.ParametroRequest;
import com.pe.app.backoffice.model.response.VerificaParametroResponse;

@Mapper
public interface ParametroMapper {

	VerificaParametroResponse verificarParametroxAbreviatura(ParametroRequest request) throws Exception;
}
