package com.vamsi.setup;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration.Dynamic;

public class MyDispatcherServlet implements WebApplicationInitializer {

	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		
		AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
		context.register(AppConfig.class);
		
		DispatcherServlet servlet = new DispatcherServlet(context);
		Dynamic register = servletContext.addServlet("app", servlet);
		register.addMapping("/app/*");
		register.setLoadOnStartup(1);
		
		
	}
	

}
