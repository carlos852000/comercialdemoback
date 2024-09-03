package com.pe.app.seguridad.auth;

import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

import com.pe.app.seguridad.model.request.UsuarioAuditoriaDto;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class JwtTokenUtil {
    
	private final static Logger log = Logger.getLogger("JwtTokenUtil");

	private Claims getAllClaimsFromToken(String token) {
		return Jwts.parser().setSigningKey(JwtConfig.KEY_SECRET.getBytes(StandardCharsets.UTF_8) ).parseClaimsJws(token).getBody();
	}
	
	public UsuarioAuditoriaDto getInformationOfToken(String token) {
		Claims  claims= getAllClaimsFromToken(token);
		LinkedHashMap usuarioAuditoria 			=  claims.get("usuario",LinkedHashMap.class);
		UsuarioAuditoriaDto auditoria = new UsuarioAuditoriaDto();

		auditoria.setIdusuario((Integer) usuarioAuditoria.get("idusuario"));
		auditoria.setIdpersona((Integer) usuarioAuditoria.get("idpersona"));
		//auditoria.setNickname(usuarioAuditoria.get("nickname").toString());
		//auditoria.setIdtipodocumento((Integer) usuarioAuditoria.get("idtipodocumento"));
		//auditoria.setNumerodocumento(usuarioAuditoria.get("numerodocumento").toString());
		//auditoria.setDatospersona(usuarioAuditoria.get("datospersona").toString());
		auditoria.setApellidopaterno(usuarioAuditoria.get("apellidopaterno").toString());
		auditoria.setApellidomaterno(usuarioAuditoria.get("apellidomaterno").toString());
		auditoria.setNombres(usuarioAuditoria.get("nombres").toString());
		auditoria.setUsuarioauditoria(usuarioAuditoria.get("usuarioauditoria").toString());
		auditoria.setCrubro((Integer) usuarioAuditoria.get("crubro"));
		auditoria.setIdtienda((Integer) usuarioAuditoria.get("idtienda"));
		auditoria.setTienda(usuarioAuditoria.get("tienda").toString());
		return auditoria;
	}
	
}
