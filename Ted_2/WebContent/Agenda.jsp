<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Agenda</title>
</head>
<body>
<h1>Agenda</h1>
<hr>
<form action="AgendaServlet" method="post">
Nome: <input type="text" name="1nome"><br>
Fone1: <input type="text" name="1fone1"><br>
Fone2: <input type="text" name="1fone2"><br>
<br>
Nome: <input type="text" name="2nome"><br>
Fone1: <input type="text" name="2fone1"><br>
Fone2: <input type="text" name="2fone2"><br>
<br>
Nome: <input type="text" name="3nome"><br>
Fone1: <input type="text" name="3fone1"><br>
Fone2: <input type="text" name="3fone2"><br>
<input type="submit" value="Salvar">
</form>
</body>
</html>