<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="Agenda.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Agenda</title>
</head>
<body>
<h1>Agenda</h1>
<hr>

		<table border="3">		
		   <tr><td><b>Nome</b></td> <td> <b>Telefone 1</b> </td> <td> <b>Telefone 2 </b></td> </tr>
		   <%Agenda ag = new Agenda();
			ag = (Agenda) request.getAttribute("Agenda"); 
		   for(int i=0;i<ag.getPessoas().size();i++)
		   {%>
				<tr>
				<td><%out.println(ag.getContato(i).getNome()); %> </td>
				<td><%out.println(ag.getContato(i).getFone1()); %> </td> 
				<td><%out.println(ag.getContato(i).getFone2()); %> </td> 
				</tr>
			<%}%>   
		</table>
<hr>
</body>
</html>