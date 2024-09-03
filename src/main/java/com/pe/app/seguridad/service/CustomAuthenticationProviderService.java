package com.pe.app.seguridad.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.pe.app.seguridad.model.request.LoginUsuarioRequest;
import com.pe.app.seguridad.model.response.LoginUsuarioResponse;
import com.pe.app.seguridad.repository.UsuarioMapper;
import com.pe.app.transversal.model.response.DataResponse;

@Service
public class CustomAuthenticationProviderService implements AuthenticationProvider {

	@Autowired
	private UsuarioMapper usuarioMapper;

	@SuppressWarnings("unused")
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		UsernamePasswordAuthenticationToken authenticationToken = null;
		String username = (String) authentication.getName();
		String password = (String) authentication.getCredentials().toString();
		DataResponse dataResponse = new DataResponse(); 
		try {

			dataResponse = this.loginUsuario(username, password);
			if (dataResponse.getResultado() == 1) {
				SimpleGrantedAuthority valor = new SimpleGrantedAuthority("ROLE_USER");
				List<SimpleGrantedAuthority> authorities = new ArrayList<>();
				authorities.add(valor);
				authenticationToken = new UsernamePasswordAuthenticationToken(
						new org.springframework.security.core.userdetails.User(username,
								"$2y$12$f5oqVvB5pKBYLIrjazXg/O0KDfFP4qdlsw1cXakPNSczWALEY5v9O", authorities),
								"$2y$12$f5oqVvB5pKBYLIrjazXg/O0KDfFP4qdlsw1cXakPNSczWALEY5v9O", authorities);
			} else {
				throw new BadCredentialsException("User authentication failed!!!!");
			}
		} catch (BadCredentialsException ex) {
			throw new BadCredentialsException("Usuario y contraseña incorrectos");
		} catch (Exception e) {
			throw new UsernameNotFoundException("Usuario y contraseña incorrectos");
		}
		return authenticationToken;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

	public DataResponse loginUsuario(String usuario, String password) throws Exception {
		Integer resultado;
		String mensaje = "";
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		DataResponse dataResponse = new DataResponse();
		try {
			LoginUsuarioRequest request = new LoginUsuarioRequest();
			request.setUsername(usuario);
			LoginUsuarioResponse response = usuarioMapper.loginUsuario(request);
			response.setResultado(request.getResultado());
			response.setMensaje(request.getMensaje());
			if (response.getResultado() == 1) {
				if (!passwordEncoder.matches(password, response.getClave())) {
					resultado = 0;
					mensaje = "Contraseña incorrecta";
				} else {
					resultado = 1;
					mensaje = "Login Satisfactorio";
				}
			} else {
				resultado = 0;
			}
		} catch (Exception e) {
			resultado = 0;
			mensaje = "Error en el servicio";
			throw new UsernameNotFoundException("Error en el servicio");
		}
		dataResponse.setResultado(resultado);
		dataResponse.setMensaje(mensaje);
		return dataResponse;
	}
}
