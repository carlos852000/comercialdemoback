package com.pe.app.backoffice.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pe.app.backoffice.model.request.AlertaRequest;

import com.pe.app.backoffice.model.response.EliminarAlertaResponse;
import com.pe.app.backoffice.model.response.ListarAlertaResponse;

import com.pe.app.backoffice.model.response.ProcesaAlertaResponse;
import com.pe.app.backoffice.model.response.ProcesaContadorAlertaResponse;

@Mapper
public interface AlertaMapper {

	List<ListarAlertaResponse> listarAlerta(AlertaRequest request) throws Exception;
	ProcesaAlertaResponse procesaAlerta(AlertaRequest request) throws Exception;
	ProcesaContadorAlertaResponse procesaContadorAlerta(AlertaRequest request) throws Exception;
	EliminarAlertaResponse eliminarAlerta(AlertaRequest request) throws Exception;

}
