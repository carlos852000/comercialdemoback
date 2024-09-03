package com.pe.app.backoffice.service;

import com.pe.app.backoffice.model.request.RubroRequest;
import com.pe.app.transversal.model.response.DataResponse;

public interface RubroService {

	public DataResponse listarRubro(RubroRequest request) throws Exception;
	public DataResponse procesaRubro(RubroRequest request) throws Exception;
	public DataResponse eliminarRubro(RubroRequest request) throws Exception;
	public DataResponse listarRubroUnidadMedida(RubroRequest request) throws Exception;
	public DataResponse listarRubroUnidadMedidaxRubro(RubroRequest request) throws Exception;
	public DataResponse procesaRubroUnidadMedida(RubroRequest request) throws Exception;
	public DataResponse eliminarRubroUnidadMedida(RubroRequest request) throws Exception;
	public DataResponse listarRubroCaracteristica(RubroRequest request) throws Exception;
	public DataResponse procesaRubroCaracteristica(RubroRequest request) throws Exception;
	public DataResponse eliminarRubroCaracteristica(RubroRequest request) throws Exception;
	public DataResponse listarRubroCaracteristicaDetalle(RubroRequest request) throws Exception;
	public DataResponse listarRubroCaracteristicaDetalleRubro(RubroRequest request) throws Exception;
	public DataResponse procesaRubroCaracteristicaDetalle(RubroRequest request) throws Exception;
	public DataResponse eliminarRubroCaracteristicaDetalle(RubroRequest request) throws Exception;

}
