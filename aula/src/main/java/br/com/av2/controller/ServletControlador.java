package br.com.av2.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.av2.model.Disciplina;
import br.com.av2.model.SistemaCadastroDisciplina;

/**
 * Servlet implementation class ServletControlador
 */

// Servlet que exerce a funcionalidade de cadastro da disciplina no sistema.

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		
		SistemaCadastroDisciplina sistema = (SistemaCadastroDisciplina) getServletContext().getAttribute(ContextListener.SISTEMA_CADASTRO_DISCIPLINA);
		
		String resposta = "disciplinas.jsp";
		
		if ("cadastrar".equals(acao)) {
			resposta = "registro.jsp";
		} else if ("confirmarCadastro".equals(acao)) {
			Disciplina e = new Disciplina();
			e.setDisciplina(request.getParameter("nomeDisciplina"));
			e.setNota(request.getParameter("nota"));
			
			sistema.adicionar(e);
			
			request.setAttribute("lista", sistema.listarDisciplinas());
			
			resposta = "listar.jsp";
		} else if ("listar".equals(acao)) {
			
			request.setAttribute("lista", sistema.listarDisciplinas());
			resposta = "listar.jsp";
		}
		
		request.getRequestDispatcher(resposta).forward(request, response);
		
	}

}
