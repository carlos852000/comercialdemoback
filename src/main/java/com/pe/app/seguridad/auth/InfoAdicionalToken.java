package com.pe.app.seguridad.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.pe.app.seguridad.model.request.UsuarioAuditoriaDto;
import com.pe.app.seguridad.model.response.LoginUsuarioResponse;
import com.pe.app.seguridad.model.response.ObtieneInfoUsuarioResponse;
import com.pe.app.seguridad.repository.UsuarioMapper;
import com.pe.app.transversal.model.response.DataResponse;
import com.pe.app.transversal.utils.Funciones;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;


@Component
public class InfoAdicionalToken implements TokenEnhancer {

	@Autowired
	private UsuarioMapper usuarioMapper;
	
	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		UsuarioAuditoriaDto  request = new UsuarioAuditoriaDto();
		request.setUsuarioauditoria(authentication.getName());
		Map<String,Object> info = new HashMap<>();
		try {
			ObtieneInfoUsuarioResponse response = usuarioMapper.obtieneInfoUsuario(request);
			Map<String,Object> usuario = new HashMap<>();
			usuario.put("idusuario", response.getIdusuario());
			usuario.put("idpersona", response.getIdpersona());
			usuario.put("datospersona", response.getDatospersona());
			usuario.put("apellidopaterno", response.getApellidopaterno());
			usuario.put("apellidomaterno", response.getApellidomaterno());
			usuario.put("nombres", response.getNombre());
			usuario.put("tipodocumento", response.getTipodocumento());
			usuario.put("numerodocumento", response.getNumerodocumento());
			usuario.put("email", response.getEmail());
			usuario.put("crubro", response.getCrubro());
			usuario.put("idtienda", response.getIdtienda());
			usuario.put("tienda", response.getTienda());
			usuario.put("usuarioauditoria", authentication.getName());
			info.put("usuario", usuario);
		} catch (Exception e) {
			e.printStackTrace();
			//throw new BadCredentialsException("El usuario no ha sido encontrado");
		}
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		return accessToken;
	}
	
}
