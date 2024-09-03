package com.pe.app.backoffice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.app.backoffice.model.request.ProductoCaracteristicaRequest;
import com.pe.app.backoffice.model.request.ProductoDetalleRequest;
import com.pe.app.backoffice.model.request.ProductoGrupoPrecioRequest;
import com.pe.app.backoffice.model.request.ProductoRequest;
import com.pe.app.backoffice.model.response.EliminarProductoDetalleResponse;
import com.pe.app.backoffice.model.response.EliminarProductoGrupoPrecioResponse;
import com.pe.app.backoffice.model.response.EliminarProductoResponse;
import com.pe.app.backoffice.model.response.ListarProductosCaracteristicaResponse;
import com.pe.app.backoffice.model.response.ListarProductosDetalleResponse;
import com.pe.app.backoffice.model.response.ListarProductosGrupoPrecioResponse;
import com.pe.app.backoffice.model.response.ListarProductosHistorialPrecioResponse;
import com.pe.app.backoffice.model.response.ListarProductosResponse;
import com.pe.app.backoffice.model.response.ProcesaProductoDetalleResponse;
import com.pe.app.backoffice.model.response.VerificarProductoxIdResponse;
import com.pe.app.backoffice.model.response.ProcesaProductoGrupoPrecioResponse;
import com.pe.app.backoffice.model.response.ProcesaProductoResponse;
import com.pe.app.backoffice.repository.ProductoMapper;
import com.pe.app.transversal.model.response.DataResponse;
import com.pe.app.transversal.utils.Funciones;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	public ProductoMapper mapper;

	@Override
	public DataResponse listarProducto(ProductoRequest request) throws Exception {
		List<ListarProductosResponse> dataDB = mapper.listarProducto(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		dataResponse.setTotalFilas(request.getTotalFilas());
		dataResponse.setTotalPages(request.getTotalPages());
		return dataResponse;
	}

	@Override
	public DataResponse eliminarProducto(ProductoRequest request) throws Exception {
		EliminarProductoResponse dataDB = mapper.eliminarProducto(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}

	@Override
	public DataResponse procesaProducto(ProductoRequest request) throws Exception {
		ProcesaProductoResponse dataDB = mapper.procesaProducto(request);
		Integer idCodigo = request.getCodigo();
		Integer idResultado = request.getResultado();
		String msj = request.getMensaje();
		// System.out.println("####1"+idCodigo);
		// System.out.println("####2"+idResultado);
		// System.out.println("####3"+msj);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		if (request.getResultado() == 1) {
			ProductoRequest requestNew = new ProductoRequest();
			requestNew.setIdproducto(idCodigo);
			VerificarProductoxIdResponse dataDBOK = mapper.verificarProductoxId(requestNew);
			dataResponse.setDato(dataDBOK);
			dataResponse.setCregistro(idCodigo);
			dataResponse.setResultado(idResultado);
			dataResponse.setMensaje(msj);
		} else {
			dataResponse.setDato(dataDB);
			dataResponse.setCregistro(request.getCodigo());
			dataResponse.setResultado(request.getResultado());
			dataResponse.setMensaje(request.getMensaje());
		}

		return dataResponse;
	}

	@Override
	public DataResponse procesaProductoPrecio(ProductoRequest request) throws Exception {
		ProcesaProductoResponse dataDB = mapper.procesaProductoPrecio(request);
		Integer idCodigo = request.getCodigo();
		Integer idResultado = request.getResultado();
		String msj = request.getMensaje();
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);
		if (request.getResultado() == 1) {
			ProductoRequest requestNew = new ProductoRequest();
			requestNew.setIdproducto(idCodigo);
			VerificarProductoxIdResponse dataDBOK = mapper.verificarProductoxId(requestNew);
			dataResponse.setDato(dataDBOK);
			dataResponse.setCregistro(idCodigo);
			dataResponse.setResultado(idResultado);
			dataResponse.setMensaje(msj);
		} else {
			dataResponse.setDato(dataDB);
			dataResponse.setCregistro(request.getCodigo());
			dataResponse.setResultado(request.getResultado());
			dataResponse.setMensaje(request.getMensaje());
		}

		return dataResponse;
	}

	@Override
	public DataResponse listarProductoGrupoPrecio(ProductoGrupoPrecioRequest request) throws Exception {
		List<ListarProductosGrupoPrecioResponse> dataDB = mapper.listarProductoGrupoPrecio(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		dataResponse.setTotalFilas(request.getTotalFilas());
		dataResponse.setTotalPages(request.getTotalPages());
		return dataResponse;
	}

	@Override
	public DataResponse procesaProductoGrupoPrecio(ProductoGrupoPrecioRequest request) throws Exception {
		ProcesaProductoGrupoPrecioResponse dataDB = mapper.procesaProductoGrupoPrecio(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setCregistro(request.getCodigo());
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());

		return dataResponse;
	}

	@Override
	public DataResponse eliminarProductoGrupoPrecio(ProductoGrupoPrecioRequest request) throws Exception {
		EliminarProductoGrupoPrecioResponse dataDB = mapper.eliminarProductoGrupoPrecio(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}

	@Override
	public DataResponse listarProductoCaracteristica(ProductoCaracteristicaRequest request) throws Exception {
		List<ListarProductosCaracteristicaResponse> dataDB = mapper.listarProductoCaracteristica(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}

	@Override
	public DataResponse procesaProductoDetalle(ProductoDetalleRequest request) throws Exception {
		ProcesaProductoDetalleResponse dataDB = mapper.procesaProductoDetalle(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setCregistro(request.getCodigo());
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());

		return dataResponse;
	}

	@Override
	public DataResponse eliminarProductoDetalle(ProductoDetalleRequest request) throws Exception {
		EliminarProductoDetalleResponse dataDB = mapper.eliminarProductoDetalle(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}

	@Override
	public DataResponse listarProductoDetalle(ProductoDetalleRequest request) throws Exception {
		List<ListarProductosDetalleResponse> dataDB = mapper.listarProductoDetalle(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}

	@Override
	public DataResponse listarProductoHistorialPrecio(ProductoRequest request) throws Exception {
		List<ListarProductosHistorialPrecioResponse> dataDB = mapper.listarProductoHistorialPrecio(request);
		DataResponse dataResponse = new DataResponse();
		Funciones.validar(request);

		dataResponse.setDato(dataDB);
		dataResponse.setResultado(request.getResultado());
		dataResponse.setMensaje(request.getMensaje());
		return dataResponse;
	}
}
