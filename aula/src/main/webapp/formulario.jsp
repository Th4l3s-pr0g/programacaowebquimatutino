<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
	<form method = "post"  action = "ServletPaginaAgenda">
        Name: <input type = "text" name = "name"/>
        <br>
        Telefone: <input type = "number" name = "telefone"/>
        <br>
        Data de Nascimento: <input type = "date" name = "dta_nascimento">
        <input type = "submit" value = "Login"/>
    </form>
</body>
</html>