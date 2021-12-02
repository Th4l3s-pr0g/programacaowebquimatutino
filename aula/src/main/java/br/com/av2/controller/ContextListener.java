package br.com.av2.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import br.com.av2.model.SistemaCadastroDisciplina;

@WebListener
public class ContextListener implements ServletContextListener {

	public static final String SISTEMA_CADASTRO_DISCIPLINA = "sistemaCadastroDisciplina";

	@Override
	public void contextInitialized(ServletContextEvent event) {
		ServletContext context = event.getServletContext();
		context.setAttribute(SISTEMA_CADASTRO_DISCIPLINA, new SistemaCadastroDisciplina());
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		ServletContext context = event.getServletContext();
		context.removeAttribute(SISTEMA_CADASTRO_DISCIPLINA);
	}

}
