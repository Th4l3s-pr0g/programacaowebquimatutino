<%@page import="java.text.SimpleDateFormat"%>
<%@page import="br.com.av2.model.Disciplina"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Disciplinas</title>
</head>
<body>
<h3>Lista de Disciplinas</h3>

<table border="1">
	<tr>
		<td>Disciplina</td>
		<td>Nota</td>
	</tr>
	<%
		List<Disciplina> lista = (List<Disciplina>) request.getAttribute("lista");
		for(Disciplina disciplina : lista){
			
	%>
	<tr>
		<td><%= disciplina.getDisciplina() %></td>
		<td><%= disciplina.getNota() %></td>
	</tr>
	<% 
		}
	%>
	<br><br>
	<a href="ServletControlador">Voltar para o menu principal</a>
</table>
<br><br>
<% SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss"); %>
<%= sdf.format(new java.util.Date()) %>

<%-- Página que lista as disciplinas cadastradas. --%>
</body>
</html>