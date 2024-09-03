package com.pe.app.backoffice.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.pe.app.seguridad.auth.JwtTokenUtil;
import com.pe.app.seguridad.model.request.UsuarioAuditoriaDto;
import com.pe.app.transversal.model.request.BaseBeanRequest;

public class BaseController {
	
	  @Autowired
	  private JwtTokenUtil jwtTokenUtil;
		  
	  public void AsignarCamposAuditoria (String token,BaseBeanRequest request) {
	    UsuarioAuditoriaDto usuarioAuditoria = jwtTokenUtil.getInformationOfToken(token.substring(7, token.length()));
	    request.setUsuarioAuditoria(usuarioAuditoria.getUsuarioauditoria());
	    request.setIdusuario(usuarioAuditoria.getIdusuario());
	    request.setIdpersona(usuarioAuditoria.getIdpersona());
	    request.setIdtipodocumento_usuario(usuarioAuditoria.getIdtipodocumento());
	    request.setNumerodocumento_usuario(usuarioAuditoria.getNumerodocumento());
	    request.setIdusuario(usuarioAuditoria.getIdusuario());
	    request.setTipodocumento_usuario(usuarioAuditoria.getTipodocumento());
	    request.setEmail_usuario(usuarioAuditoria.getEmail());
	    request.setCrubro_usuario(usuarioAuditoria.getCrubro());
	    request.setIdtiendausuario(usuarioAuditoria.getIdtienda());
	    request.setTiendausuario(usuarioAuditoria.getTienda());
	  }

}
