package com.pe.app.siscomercialback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@ServletComponentScan
@SpringBootApplication
@EnableAsync
@ComponentScan(basePackages = {"com.pe.app","com.pe.app.backoffice.controller","com.pe.app.transversal.controller"})
@MapperScan({ "com.pe.app.backoffice.repository","com.pe.app.transversal.repository", "com.pe.app.seguridad.repository"})
public class SiscomercialbackApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SiscomercialbackApplication.class, args);
	} 
}
