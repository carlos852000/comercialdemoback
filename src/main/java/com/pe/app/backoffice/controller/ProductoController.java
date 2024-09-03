package com.pe.app.backoffice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pe.app.backoffice.model.request.ProductoCaracteristicaRequest;
import com.pe.app.backoffice.model.request.ProductoDetalleRequest;
import com.pe.app.backoffice.model.request.ProductoGrupoPrecioRequest;
import com.pe.app.backoffice.model.request.ProductoRequest;
import com.pe.app.backoffice.service.ProductoService;
import com.pe.app.transversal.model.request.DataRequest;
import com.pe.app.transversal.model.response.DataResponse;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/producto")
public class ProductoController extends BaseController{

	@Autowired
	private ProductoService productoService;
	
	@Autowired
	ObjectMapper mapper = new ObjectMapper();
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/listar-producto"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> listarProducto(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ProductoRequest request = mapper.readValue(param.getDato().toString(), ProductoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   productoService.listarProducto(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/eliminar-producto"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> eliminarProducto(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ProductoRequest request = mapper.readValue(param.getDato().toString(), ProductoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   productoService.eliminarProducto(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-producto"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> procesaProducto(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ProductoRequest request = mapper.readValue(param.getDato().toString(), ProductoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   productoService.procesaProducto(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-producto-precio"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> procesaProductoPrecio(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ProductoRequest request = mapper.readValue(param.getDato().toString(), ProductoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   productoService.procesaProductoPrecio(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/listar-producto-grupo-precio"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> listarProductoGrupoPrecio(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ProductoGrupoPrecioRequest request = mapper.readValue(param.getDato().toString(), ProductoGrupoPrecioRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   productoService.listarProductoGrupoPrecio(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	 
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-producto-grupo-precio"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> procesaProductoGrupoPrecio(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ProductoGrupoPrecioRequest request = mapper.readValue(param.getDato().toString(), ProductoGrupoPrecioRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   productoService.procesaProductoGrupoPrecio(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/eliminar-producto-grupo-precio"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> eliminarProductoGrupoPrecio(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ProductoGrupoPrecioRequest request = mapper.readValue(param.getDato().toString(), ProductoGrupoPrecioRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   productoService.eliminarProductoGrupoPrecio(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/listar-producto-caracteristica"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> listarProductoCaracteristica(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ProductoCaracteristicaRequest request = mapper.readValue(param.getDato().toString(), ProductoCaracteristicaRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   productoService.listarProductoCaracteristica(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-producto-detalle"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> procesaProductoDetalle(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ProductoDetalleRequest request = mapper.readValue(param.getDato().toString(), ProductoDetalleRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   productoService.procesaProductoDetalle(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/eliminar-producto-detalle"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> eliminarProductoDetalle(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ProductoDetalleRequest request = mapper.readValue(param.getDato().toString(), ProductoDetalleRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   productoService.eliminarProductoDetalle(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/listar-producto-detalle"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> listarProductoDetalle(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ProductoDetalleRequest request = mapper.readValue(param.getDato().toString(), ProductoDetalleRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   productoService.listarProductoDetalle(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/listar-producto-historial-precio"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> listarProductoHistorialPrecio(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ProductoRequest request = mapper.readValue(param.getDato().toString(), ProductoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   productoService.listarProductoHistorialPrecio(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
}
