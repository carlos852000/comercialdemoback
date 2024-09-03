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
import com.pe.app.backoffice.model.request.TiendaRequest;
import com.pe.app.backoffice.service.TiendaService;
import com.pe.app.transversal.model.request.DataRequest;
import com.pe.app.transversal.model.response.DataResponse;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/tienda")
public class TiendaController extends BaseController{

	@Autowired
	private TiendaService tiendaService;
	
	@Autowired
	ObjectMapper mapper = new ObjectMapper();
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/listar-tienda"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> listarTienda(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		TiendaRequest request = mapper.readValue(param.getDato().toString(), TiendaRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   tiendaService.listarTienda(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/eliminar-tienda"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> eliminarTienda(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		TiendaRequest request = mapper.readValue(param.getDato().toString(), TiendaRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   tiendaService.eliminarTienda(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-tienda"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> procesaTienda(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		TiendaRequest request = mapper.readValue(param.getDato().toString(), TiendaRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   tiendaService.procesaTienda(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	 
}
