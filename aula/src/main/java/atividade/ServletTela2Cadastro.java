package atividade;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletTela2Cadastro
 */
@WebServlet("/ServletTela2Cadastro")
public class ServletTela2Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTela2Cadastro() {
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
		PrintWriter resp = response.getWriter();
    	
    	resp.write("<html>");
        resp.write("<head>");
        resp.write("<title>Confirmação de registro</title>");
        resp.write("</head>");
        resp.write("<body>");
        resp.write("<h3>Registro realizado com sucesso!</h3><br/><br/>");
        resp.write("<b>Seus dados pessoais:</b><br/>");
        resp.write(request.getParameter("nome") + " " + request.getParameter("sobrenome"));
        resp.write("<br/>");
        resp.write(request.getParameter("rua"));
        resp.write("<br/>");
        resp.write(request.getParameter("complemento"));
        resp.write("<br/>");
        resp.write(request.getParameter("cidade"));
        resp.write(", ");
        resp.write(request.getParameter("cep"));
        resp.write(", ");
        resp.write(request.getParameter("estado"));
        resp.write("<br/>");
        resp.write("<b>Seus dados profissionais:</b><br/>");
        resp.write(request.getParameter("empresa"));
        resp.write("<br/>");
        resp.write(request.getParameter("ruaEmpresa"));
        resp.write("<br/>");
        resp.write(request.getParameter("complementoEmpresa"));
        resp.write("<br/>");
        resp.write(request.getParameter("cidadeEmpresa"));
        resp.write(", ");
        resp.write(request.getParameter("cepEmpresa"));
        resp.write(", ");
        resp.write(request.getParameter("estadoEmpresa"));
        resp.write("</body></html>");
	
        HttpSession sessao = request.getSession();
        
        String nome = (String) sessao.getAttribute("nome");
        String sobrenome = (String) sessao.getAttribute("sobrenome");
        String rua = (String) sessao.getAttribute("rua");
        String complemento = (String) sessao.getAttribute("complemento");
        String cidade = (String) sessao.getAttribute("cidade");
        String cep = (String) sessao.getAttribute("cep");
        String estado = (String) sessao.getAttribute("estado");
        
        PrintWriter out = response.getWriter();
        out.write("<html><body>");
        out.write("Nome: "+ nome);
        out.write("Sobrenome: "+ sobrenome);
        out.write("Rua: "+ rua);
        out.write("Complemento: "+ complemento);
        out.write("Cidade: "+ cidade);
        out.write("CEP: "+ cep);
        out.write("Estado: "+ estado);
        out.write("<html><body>");
        out.close();
	}

}
