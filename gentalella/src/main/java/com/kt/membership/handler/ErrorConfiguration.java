package com.kt.membership.handler;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class ErrorConfiguration extends ServerProperties{
	
	
	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		super.customize(container);

		container.addErrorPages(new ErrorPage(HttpStatus.BAD_REQUEST, "/html/error/error.html")); //400
		container.addErrorPages(new ErrorPage(HttpStatus.FORBIDDEN, "/html/error/error.html")); //403
		container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/html/error/error.html")); //404
		container.addErrorPages(new ErrorPage(HttpStatus.NOT_ACCEPTABLE, "/html/error/error.html")); //406
		
		container.addErrorPages(new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/html/error/error.html")); //500
		
	}
}
