package com.pe.app.backoffice.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pe.app.backoffice.model.request.CatalogoDetalleRequest;
import com.pe.app.backoffice.model.request.CatalogoRequest;
import com.pe.app.backoffice.model.response.EliminarCatalogoDetalleResponse;
import com.pe.app.backoffice.model.response.EliminarCatalogoResponse;
import com.pe.app.backoffice.model.response.ListarCatalogoResponse;
import com.pe.app.backoffice.model.response.ProcesaCatalogoDetalleResponse;
import com.pe.app.backoffice.model.response.ProcesaCatalogoResponse;
import com.pe.app.backoffice.model.response.VerificaCatalogoResponse;

@Mapper
public interface CatalogoMapper {

	VerificaCatalogoResponse verificarCatalogo(CatalogoRequest request) throws Exception;
	VerificaCatalogoResponse verificarCatalogoDetalle(CatalogoRequest request) throws Exception;
	List<ListarCatalogoResponse> listarCatalogo(CatalogoRequest request) throws Exception;
	List<ListarCatalogoResponse> listarCatalogoDetalle(CatalogoDetalleRequest request) throws Exception;
	EliminarCatalogoResponse eliminarCatalogo(CatalogoRequest request) throws Exception;
	ProcesaCatalogoResponse procesaCatalogo(CatalogoRequest request) throws Exception;
	EliminarCatalogoDetalleResponse eliminarCatalogoDetalle(CatalogoRequest request) throws Exception;
	ProcesaCatalogoDetalleResponse procesaCatalogoDetalle(CatalogoRequest request) throws Exception;
}
