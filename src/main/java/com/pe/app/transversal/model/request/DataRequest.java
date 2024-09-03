package com.pe.app.transversal.model.request;

import com.fasterxml.jackson.databind.JsonNode;

public class DataRequest {

  private String token;
  private JsonNode dato;
  private String ip;
  private JsonNode rol;
  private String user;

  public JsonNode getDato(){
  return dato;
  }
  public void setDato(JsonNode dato){
  this.dato = dato;
  }

  public String getToken() {
    return token;
  }
  public void setToken(String token) {
        this.token = token;
    }
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public JsonNode getRol() {
	return rol;
}
public void setRol(JsonNode rol) {
	this.rol = rol;
}
public String getIp() {
	return ip;
}
public void setIp(String ip) {
	this.ip = ip;
}
}