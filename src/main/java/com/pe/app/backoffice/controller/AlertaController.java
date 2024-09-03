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
import com.pe.app.backoffice.model.request.AlertaRequest;
import com.pe.app.backoffice.service.AlertaService;
import com.pe.app.transversal.model.request.DataRequest;
import com.pe.app.transversal.model.response.DataResponse;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/alerta")
public class AlertaController extends BaseController{

	@Autowired
	private AlertaService alertaService;
	
	@Autowired
	ObjectMapper mapper = new ObjectMapper();
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/listar-alerta"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> listarAlerta(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		AlertaRequest request = mapper.readValue(param.getDato().toString(), AlertaRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   alertaService.listarAlerta(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-alerta"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> procesaAlerta(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		AlertaRequest request = mapper.readValue(param.getDato().toString(), AlertaRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   alertaService.procesaAlerta(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/procesa-contador-alerta"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> procesaContadorAlerta(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		AlertaRequest request = mapper.readValue(param.getDato().toString(), AlertaRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   alertaService.procesaContadorAlerta(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/eliminar-alerta"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> eliminarAlerta(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		AlertaRequest request = mapper.readValue(param.getDato().toString(), AlertaRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   alertaService.eliminarAlerta(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	 
}
