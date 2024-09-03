package com.pe.app.backoffice.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pe.app.backoffice.model.request.ProveedorRequest;
import com.pe.app.backoffice.model.response.EliminarProveedorResponse;
import com.pe.app.backoffice.model.response.ListarProveedorResponse;
import com.pe.app.backoffice.model.response.ProcesaProveedorResponse;

@Mapper
public interface ProveedorMapper {

	List<ListarProveedorResponse> listarProveedor(ProveedorRequest request) throws Exception;
	ProcesaProveedorResponse 	procesaProveedor(ProveedorRequest request) throws Exception;
	EliminarProveedorResponse 	eliminarProveedor(ProveedorRequest request) throws Exception;
}
