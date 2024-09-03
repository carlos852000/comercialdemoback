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
import com.pe.app.backoffice.model.request.CompraDetalleRequest;
import com.pe.app.backoffice.model.request.CompraRequest;
import com.pe.app.backoffice.service.CompraService;
import com.pe.app.transversal.model.request.DataRequest;
import com.pe.app.transversal.model.response.DataResponse;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/compra")
public class CompraController extends BaseController{

	@Autowired
	private CompraService compraService;
	
	@Autowired
	ObjectMapper mapper = new ObjectMapper();
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/listar-compra"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> listarCompra(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		CompraRequest request = mapper.readValue(param.getDato().toString(), CompraRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   compraService.listarCompra(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/eliminar-compra"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> eliminarCompra(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		CompraRequest request = mapper.readValue(param.getDato().toString(), CompraRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   compraService.eliminarCompra(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/verificar-compra-usuario"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> verificarCompraxIdUsuario(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		CompraRequest request = mapper.readValue(param.getDato().toString(), CompraRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   compraService.verificarCompraxIdUsuario(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-precompra"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> procesaPreCompra(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		CompraRequest request = mapper.readValue(param.getDato().toString(), CompraRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   compraService.procesaPreCompra(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-compra"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> procesaCompra(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		CompraRequest request = mapper.readValue(param.getDato().toString(), CompraRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   compraService.procesaCompra(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/eliminar-compra-detalle"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> eliminarCompraDetalle(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		CompraDetalleRequest request = mapper.readValue(param.getDato().toString(), CompraDetalleRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   compraService.eliminarCompraDetalle(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	 
	@RequestMapping(method = {RequestMethod.POST}, value = {"/verificar-compra-detalle"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> listarCompraDetallexId(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		CompraDetalleRequest request = mapper.readValue(param.getDato().toString(), CompraDetalleRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   compraService.listarCompraDetallexId(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-compra-detalle"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> procesaCompraDetalle(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		CompraDetalleRequest request = mapper.readValue(param.getDato().toString(), CompraDetalleRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   compraService.procesaCompraDetalle(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
}
