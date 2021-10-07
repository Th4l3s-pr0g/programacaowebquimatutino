<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostra a quantidade de acessos a esta pagina</title>
</head>
<body>
<% aula08.Contador.novoAcesso(); %>

Quantidade de acessos a esta página:
<b><%= aula08.Contador.getQuantidadeAcessos() %></b><br>

Data do primeiro acesso:
<b><%= aula08.Contador.getDataInicio() %></b><br>

Data do último acesso:
<b><%= aula08.Contador.getDateTime() %></b>
</body>
</html>