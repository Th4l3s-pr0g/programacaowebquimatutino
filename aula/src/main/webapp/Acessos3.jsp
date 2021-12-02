<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apresenta a quantidade de acessoas a esta página</title>
</head>
<body>
<%!
int cont=0;

int calculaContagem(){
	int valor = 1;
	int hora = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
	
	if (hora >= 22 || hora <= 6){
		valor = 2;
	}
	
	return valor;
}
%>

<% cont += calculaContagem(); %>

<br>

Este é o acesso de número: <%= cont %>*
<br>
<br>
Considerando que os acessos noturnos valem por 2.
</body>
</html>