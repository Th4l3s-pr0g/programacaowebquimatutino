package atividade;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletTela1Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTela1Cadastro() {
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
        resp.write("<title>Dados Profissionais</title>");
        resp.write("</head>");
        resp.write("<body>");
        resp.write("Preencha seus dados profissionais:");
        resp.write("<form action=\"ServletTela2Cadastro\">");
        
        resp.write("<input type=\"hidden\" name=\"nome\" value=\"");
        resp.write(request.getParameter("nome") + "\">");
        resp.write("<input type=\"hidden\" name=\"sobrenome\" value=\"");
        resp.write(request.getParameter("sobrenome") + "\">");
        resp.write("<input type=\"hidden\" name=\"rua\" value=\"");
        resp.write(request.getParameter("rua") + "\">");
        resp.write("<input type=\"hidden\" name=\"complemento\" value=\"");
        resp.write(request.getParameter("complemento") + "\">");
        resp.write("<input type=\"hidden\" name=\"cidade\" value=\"");
        resp.write(request.getParameter("cidade") + "\">");
        resp.write("<input type=\"hidden\" name=\"cep\" value=\"");
        resp.write(request.getParameter("cep") + "\">");
        resp.write("<input type=\"hidden\" name=\"estado\" value=\"");
        resp.write(request.getParameter("estado") + "\">");
        
        resp.write("Empresa:<input type=\"text\" name=\"empresa\"> <BR>");
        resp.write("Endereço profissional:<BR>");
        resp.write("Rua: <input type=\"text\" name=\"ruaEmpresa\">");
        resp.write("Complemento:<input type=\"text\" name=\"complementoEmpresa\"><BR>");
        resp.write("Cidade:<input type=\"text\" name=\"cidadeEmpresa\">");
        resp.write("CEP:<input type=\"text\" name=\"cepEmpresa\">");
        resp.write("Estado:<input type=\"text\" name=\"estadoEmpresa\"><BR>");
        resp.write("<input type=\"submit\" value=\"Confirmar\"><BR>");
        resp.write("</form>");
        resp.write("</body></html>");
    	
	}
	
}
