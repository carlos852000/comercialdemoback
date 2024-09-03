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
import com.pe.app.backoffice.model.request.RubroRequest;
import com.pe.app.backoffice.service.RubroService;
import com.pe.app.transversal.model.request.DataRequest;
import com.pe.app.transversal.model.response.DataResponse;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/rubro")
public class RubroController extends BaseController {

	@Autowired
	private RubroService rubroService;

	@Autowired
	ObjectMapper mapper = new ObjectMapper();

	@RequestMapping(method = { RequestMethod.POST }, value = { "/listar-rubro" }, produces = { "application/hal+json" })
	public ResponseEntity<Object> listarRubro(@RequestHeader(name = "Authorization") String token,
			@RequestBody DataRequest param) throws Exception {
		DataResponse dataResponse = new DataResponse();
		RubroRequest request = mapper.readValue(param.getDato().toString(), RubroRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse = rubroService.listarRubro(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}

	@RequestMapping(method = { RequestMethod.POST }, value = { "/eliminar-rubro" }, produces = {"application/hal+json" })
	public ResponseEntity<Object> eliminarRubro(@RequestHeader(name = "Authorization") String token,
			@RequestBody DataRequest param) throws Exception {
		DataResponse dataResponse = new DataResponse();
		RubroRequest request = mapper.readValue(param.getDato().toString(), RubroRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse = rubroService.eliminarRubro(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}

	@RequestMapping(method = { RequestMethod.POST }, value = { "/procesa-rubro" }, produces = {"application/hal+json" })
	public ResponseEntity<Object> procesaRubro(@RequestHeader(name = "Authorization") String token,
			@RequestBody DataRequest param) throws Exception {
		DataResponse dataResponse = new DataResponse();
		RubroRequest request = mapper.readValue(param.getDato().toString(), RubroRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse = rubroService.procesaRubro(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = { RequestMethod.POST }, value = { "/listar-rubro-unidad-medida" }, produces = {"application/hal+json" })
	public ResponseEntity<Object> listarRubroUnidadMedida(@RequestHeader(name = "Authorization") String token,
			@RequestBody DataRequest param) throws Exception {
		DataResponse dataResponse = new DataResponse();
		RubroRequest request = mapper.readValue(param.getDato().toString(), RubroRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse = rubroService.listarRubroUnidadMedida(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = { RequestMethod.POST }, value = { "/listar-rubro-unidad-medidaxrubro" }, produces = {"application/hal+json" })
	public ResponseEntity<Object> listarRubroUnidadMedidaxRubro(@RequestHeader(name = "Authorization") String token,
			@RequestBody DataRequest param) throws Exception {
		DataResponse dataResponse = new DataResponse();
		RubroRequest request = mapper.readValue(param.getDato().toString(), RubroRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse = rubroService.listarRubroUnidadMedidaxRubro(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}

	@RequestMapping(method = { RequestMethod.POST }, value = { "/eliminar-rubro-unidad-medida" }, produces = {"application/hal+json" })
	public ResponseEntity<Object> eliminarRubroUnidadMedida(@RequestHeader(name = "Authorization") String token,
			@RequestBody DataRequest param) throws Exception {
		DataResponse dataResponse = new DataResponse();
		RubroRequest request = mapper.readValue(param.getDato().toString(), RubroRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse = rubroService.eliminarRubroUnidadMedida(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}

	@RequestMapping(method = { RequestMethod.POST }, value = { "/procesa-rubro-unidad-medida" }, produces = {"application/hal+json" })
	public ResponseEntity<Object> procesaRubroUnidadMedida(@RequestHeader(name = "Authorization") String token,
			@RequestBody DataRequest param) throws Exception {
		DataResponse dataResponse = new DataResponse();
		RubroRequest request = mapper.readValue(param.getDato().toString(), RubroRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse = rubroService.procesaRubroUnidadMedida(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}

	@RequestMapping(method = { RequestMethod.POST }, value = { "/listar-rubro-caracteristica" }, produces = {"application/hal+json" })
	public ResponseEntity<Object> listarRubroCaracteristica(@RequestHeader(name = "Authorization") String token,
			@RequestBody DataRequest param) throws Exception {
		DataResponse dataResponse = new DataResponse();
		RubroRequest request = mapper.readValue(param.getDato().toString(), RubroRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse = rubroService.listarRubroCaracteristica(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}

	@RequestMapping(method = { RequestMethod.POST }, value = { "/eliminar-rubro-caracteristica" }, produces = {"application/hal+json" })
	public ResponseEntity<Object> eliminarRubroCaracteristica(@RequestHeader(name = "Authorization") String token,
			@RequestBody DataRequest param) throws Exception {
		DataResponse dataResponse = new DataResponse();
		RubroRequest request = mapper.readValue(param.getDato().toString(), RubroRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse = rubroService.eliminarRubroCaracteristica(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}

	@RequestMapping(method = { RequestMethod.POST }, value = { "/procesa-rubro-caracteristica" }, produces = {"application/hal+json" })
	public ResponseEntity<Object> procesaRubroCaracteristica(@RequestHeader(name = "Authorization") String token,
			@RequestBody DataRequest param) throws Exception {
		DataResponse dataResponse = new DataResponse();
		RubroRequest request = mapper.readValue(param.getDato().toString(), RubroRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse = rubroService.procesaRubroCaracteristica(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = { RequestMethod.POST }, value = { "/listar-rubro-caracteristica-detalle" }, produces = {"application/hal+json" })
	public ResponseEntity<Object> listarRubroCaracteristicaDetalle(@RequestHeader(name = "Authorization") String token,
			@RequestBody DataRequest param) throws Exception {
		DataResponse dataResponse = new DataResponse();
		RubroRequest request = mapper.readValue(param.getDato().toString(), RubroRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse = rubroService.listarRubroCaracteristicaDetalle(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
	
	@RequestMapping(method = { RequestMethod.POST }, value = { "/listar-rubro-caracteristica-detalle-rubro" }, produces = {"application/hal+json" })
	public ResponseEntity<Object> listarRubroCaracteristicaDetalleRubro(@RequestHeader(name = "Authorization") String token,
			@RequestBody DataRequest param) throws Exception {
		DataResponse dataResponse = new DataResponse();
		RubroRequest request = mapper.readValue(param.getDato().toString(), RubroRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse = rubroService.listarRubroCaracteristicaDetalleRubro(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}

	@RequestMapping(method = { RequestMethod.POST }, value = { "/eliminar-rubro-caracteristica-detalle" }, produces = {"application/hal+json" })
	public ResponseEntity<Object> eliminarRubroCaracteristicaDetalle(@RequestHeader(name = "Authorization") String token,
			@RequestBody DataRequest param) throws Exception {
		DataResponse dataResponse = new DataResponse();
		RubroRequest request = mapper.readValue(param.getDato().toString(), RubroRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse = rubroService.eliminarRubroCaracteristicaDetalle(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}

	@RequestMapping(method = { RequestMethod.POST }, value = { "/procesa-rubro-caracteristica-detalle" }, produces = {"application/hal+json" })
	public ResponseEntity<Object> procesaRubroCaracteristicaDetalle(@RequestHeader(name = "Authorization") String token,
			@RequestBody DataRequest param) throws Exception {
		DataResponse dataResponse = new DataResponse();
		RubroRequest request = mapper.readValue(param.getDato().toString(), RubroRequest.class);
		AsignarCamposAuditoria(token, request);
		dataResponse = rubroService.procesaRubroCaracteristicaDetalle(request);
		return (new ResponseEntity<Object>(dataResponse, HttpStatus.OK));
	}
}
