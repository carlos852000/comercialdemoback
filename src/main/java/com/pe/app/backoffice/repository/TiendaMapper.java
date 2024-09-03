package com.pe.app.backoffice.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pe.app.backoffice.model.request.TiendaRequest;
import com.pe.app.backoffice.model.response.EliminarTiendaResponse;
import com.pe.app.backoffice.model.response.ListarTiendaResponse;
import com.pe.app.backoffice.model.response.ProcesaTiendaResponse;

@Mapper
public interface TiendaMapper {

	List<ListarTiendaResponse> listarTienda(TiendaRequest request) throws Exception;
	ProcesaTiendaResponse procesaTienda(TiendaRequest request) throws Exception;
	EliminarTiendaResponse eliminarTienda(TiendaRequest request) throws Exception;
}
