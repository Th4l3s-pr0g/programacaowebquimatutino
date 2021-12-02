<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema de Cadastro de Disciplinas</title>
</head>
<body>
Seja bem vindo a esse sistema de cadastro! Selecione a opção desejada:
<br>
1. <a href="ServletControlador?acao=cadastrar">Registrar a disciplina</a><br>
2. <a href="ServletControlador?acao=listar">Listar minhas notas</a><br><br>

<% SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss"); %>
<%= sdf.format(new java.util.Date()) %>

<%-- Página de menu do sistema. --%>
</body>
</html>