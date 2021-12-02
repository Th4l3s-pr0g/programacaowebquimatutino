<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar nova disciplina</title>

</head>
<body>
<h3>Cadastrar nova disciplina</h3>
<form action="ServletControlador" method="post">
	<input type="hidden" name="acao" value="confirmarCadastro">
	Disciplina: <input type="text" name="nomeDisciplina" value=""><br>
	Nota: <input type="number" name="nota" value=""><br>
	<input type="submit" value="Registrar disciplina"><br>
</form>
<a href="ServletControlador">Voltar para o menu principal</a><br><br>

<% SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss"); %>
<%= sdf.format(new java.util.Date()) %>

<%-- Página em que efetivamente as disciplinas são cadastradas. --%>
</body>
</html>