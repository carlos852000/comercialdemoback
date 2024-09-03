package com.pe.app.backoffice.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pe.app.backoffice.model.request.RubroRequest;
import com.pe.app.backoffice.model.response.EliminarRubroCaracteristicaResponse;
import com.pe.app.backoffice.model.response.EliminarRubroResponse;
import com.pe.app.backoffice.model.response.EliminarRubroUnidadMedidaResponse;
import com.pe.app.backoffice.model.response.ListarRubroCaracteristicaDetalleResponse;
import com.pe.app.backoffice.model.response.ListarRubroCaracteristicaResponse;
import com.pe.app.backoffice.model.response.ListarRubroResponse;
import com.pe.app.backoffice.model.response.ListarRubroUnidadMedidaResponse;
import com.pe.app.backoffice.model.response.ProcesaRubroCaracteristicaResponse;
import com.pe.app.backoffice.model.response.ProcesaRubroResponse;
import com.pe.app.backoffice.model.response.ProcesaRubroUnidadMedidaResponse;

@Mapper
public interface RubroMapper {

	List<ListarRubroResponse> listarRubro(RubroRequest request) throws Exception;
	ProcesaRubroResponse procesaRubro(RubroRequest request) throws Exception;
	EliminarRubroResponse eliminarRubro(RubroRequest request) throws Exception;
	List<ListarRubroUnidadMedidaResponse> listarRubroUnidadMedida(RubroRequest request) throws Exception;
	List<ListarRubroUnidadMedidaResponse> listarRubroUnidadMedidaxRubro(RubroRequest request) throws Exception;
	ProcesaRubroUnidadMedidaResponse procesaRubroUnidadMedida(RubroRequest request) throws Exception;
	EliminarRubroUnidadMedidaResponse eliminarRubroUnidadMedida(RubroRequest request) throws Exception;
	List<ListarRubroCaracteristicaResponse> listarRubroCaracteristica(RubroRequest request) throws Exception;
	ProcesaRubroCaracteristicaResponse procesaRubroCaracteristica(RubroRequest request) throws Exception;
	EliminarRubroCaracteristicaResponse eliminarRubroCaracteristica(RubroRequest request) throws Exception;
	List<ListarRubroCaracteristicaDetalleResponse> listarRubroCaracteristicaDetalle(RubroRequest request) throws Exception;
	List<ListarRubroCaracteristicaDetalleResponse> listarRubroCaracteristicaDetalleRubro(RubroRequest request) throws Exception;
	ProcesaRubroCaracteristicaResponse procesaRubroCaracteristicaDetalle(RubroRequest request) throws Exception;
	EliminarRubroCaracteristicaResponse eliminarRubroCaracteristicaDetalle(RubroRequest request) throws Exception;
}
