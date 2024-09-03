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
import com.pe.app.backoffice.model.request.CatalogoDetalleRequest;
import com.pe.app.backoffice.model.request.CatalogoRequest;
import com.pe.app.backoffice.service.CatalogoService;
import com.pe.app.transversal.model.request.DataRequest;
import com.pe.app.transversal.model.response.DataResponse;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/catalogo")
public class CatalogoController extends BaseController{

	@Autowired
	private CatalogoService catalogoService;
	
	@Autowired
	ObjectMapper mapper = new ObjectMapper();
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/verifica-catalogo"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> verificarCatalogo(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		CatalogoRequest request = mapper.readValue(param.getDato().toString(), CatalogoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   catalogoService.verificarCatalogo(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/verifica-catalogo-detalle"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> verificarCatalogoDetalle(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		CatalogoRequest request = mapper.readValue(param.getDato().toString(), CatalogoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   catalogoService.verificarCatalogoDetalle(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/listar-catalogo"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> listarCatalogo(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		CatalogoRequest request = mapper.readValue(param.getDato().toString(), CatalogoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   catalogoService.listarCatalogo(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/listar-catalogo-detalle"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> listarCatalogoDetalle(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		CatalogoDetalleRequest request = mapper.readValue(param.getDato().toString(), CatalogoDetalleRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   catalogoService.listarCatalogoDetalle(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/eliminar-catalogo"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> eliminarCatalogo(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		CatalogoRequest request = mapper.readValue(param.getDato().toString(), CatalogoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   catalogoService.eliminarCatalogo(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-catalogo"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> procesaCatalogo(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		CatalogoRequest request = mapper.readValue(param.getDato().toString(), CatalogoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   catalogoService.procesaCatalogo(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/eliminar-catalogo-detalle"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> eliminarCatalogoDetalle(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		CatalogoRequest request = mapper.readValue(param.getDato().toString(), CatalogoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   catalogoService.eliminarCatalogoDetalle(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-catalogo-detalle"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> procesaCatalogoDetalle(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		CatalogoRequest request = mapper.readValue(param.getDato().toString(), CatalogoRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   catalogoService.procesaCatalogoDetalle(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	 
}
