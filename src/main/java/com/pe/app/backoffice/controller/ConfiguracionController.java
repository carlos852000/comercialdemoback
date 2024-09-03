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
import com.pe.app.backoffice.model.request.ConfiguracionRequest;
import com.pe.app.backoffice.service.ConfiguracionService;
import com.pe.app.transversal.model.request.DataRequest;
import com.pe.app.transversal.model.response.DataResponse;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/configuracion")
public class ConfiguracionController extends BaseController{

	@Autowired
	private ConfiguracionService configuracionService;
	
	@Autowired
	ObjectMapper mapper = new ObjectMapper();
	
	@RequestMapping(method = {RequestMethod.POST}, value = {"/verifica-datos"}, produces = {"application/hal+json"})
	public ResponseEntity<Object> verificarDatos(@RequestHeader (name="Authorization") String token, @RequestBody DataRequest param) throws Exception {		
		DataResponse dataResponse = new DataResponse();
		ConfiguracionRequest request = mapper.readValue(param.getDato().toString(), ConfiguracionRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse =   configuracionService.verificarDatos(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = { RequestMethod.POST }, value = { "/procesa-configuracion01" }, produces = {"application/hal+json" })
	public ResponseEntity<Object> procesaConfiguracion01(@RequestHeader(name = "Authorization") String token,
			@RequestBody DataRequest param) throws Exception {
		DataResponse dataResponse = new DataResponse();
		ConfiguracionRequest request = mapper.readValue(param.getDato().toString(), ConfiguracionRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse = configuracionService.procesaConfiguracion01(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = { RequestMethod.POST }, value = { "/procesa-configuracion02" }, produces = {"application/hal+json" })
	public ResponseEntity<Object> procesaConfiguracion02(@RequestHeader(name = "Authorization") String token,
			@RequestBody DataRequest param) throws Exception {
		DataResponse dataResponse = new DataResponse();
		ConfiguracionRequest request = mapper.readValue(param.getDato().toString(), ConfiguracionRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse = configuracionService.procesaConfiguracion02(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}

}
