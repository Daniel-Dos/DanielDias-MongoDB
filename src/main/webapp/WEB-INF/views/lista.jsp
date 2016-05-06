<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listagem do MongoDB</title>
</head>
<body>
 
 <h1><a href="https://github.com/Daniel-Dos/DanielDias-MongoDB">GitHub - DanielDias-Mongo</a></h1>
 
 <h1 align="center">Listagem dos Dados</h1>

	<table align="center" border="4">
		<tr bgcolor="gray">
			<th>Nome</th>
			<th>Idade</th>
			<th>Profissão</th>
			<th>Endereço</th>
			<th>Cidade</th>
			<th>Bairro</th>
			<th>Estado</th>
			<th>Data</th>
		</tr>
		<c:forEach items="${listas}" var="tarefa">
			<tr>
				<td>${tarefa.nome}</td>
				<td>${tarefa.Idade}</td>
				<td>${tarefa.Profissão}</td>
				<td>${tarefa.Endereço}</td>
				<td>${tarefa.Cidade}</td>
				<td>${tarefa.Bairro}</td>
				<td>${tarefa.Estado}</td>
				<td>
				<fmt:formatDate value="${tarefa.Nascimento}" pattern="dd/MM/yyyy"/>
				</td>
				
				
			</tr>
		</c:forEach>
	</table>

<br /><br />
<footer id="footer">
            <ul style="list-style: none;" align="center">
            <li>Copyright &copy; Daniel Dias dos Santos 2016</li>
           </ul>
        </footer>

</body>
</html>