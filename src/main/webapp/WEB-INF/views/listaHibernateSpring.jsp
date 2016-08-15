<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listagem do MongoDB com Hibernate OGM + Spring 4</title>
<!-- bootstrap -->
	<link rel="stylesheet" href="../recursos/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="../recursos/bootstrap/css/bootstrap-theme.min.css">
	<script src="../recursos/bootstrap/js/bootstrap.min.js"></script>
	<script src="../recursos/bootstrap/js/jquery-3.1.0.min.js"></script>
<!-- bootstrap -->
<link rel="stylesheet" href="../recursos/css/style.css">

</head>
<body>
<div class="navbar navbar-inverse navbar-fixed-top">
		<div>
			<ul class="nav navbar-nav">
				<li>
					<div class="navbar-header">
						<a href="../index.html" class="navbar-brand">Home</a>
					</div>
				</li>
	
			</ul>
		</div>
	</div>

<div align="center" style="padding-top: 2cm"><img src="../recursos/imagens/monodb.jpg" height="250" align="middle"/>
<br /><br />

<h1><a href="https://github.com/Daniel-Dos/DanielDias-MongoDB">GitHub - DanielDias-Mongo</a></h1>

 <h1 align="center">Listagem dos Dados com Hiberante OGM 5 + Spring 4</h1>

	<table align="center" border="4">
		<tr bgcolor="gray">
			<th>Nome</th>
			<th>Idade</th>
			<th>Profiss�o</th>
			<th>Endere�o</th>
			<th>Cidade</th>
			<th>Bairro</th>
			<th>Estado</th>
			<th>Data de Nascimento</th>
		</tr>
		<c:forEach items="${listas}" var="tarefa">
			<tr>
				<td>${tarefa.nome}</td>
				<td>${tarefa.idade}</td>
				<td>${tarefa.profissao}</td>
				<td>${tarefa.endereco}</td>
				<td>${tarefa.cidade}</td>
				<td>${tarefa.bairro}</td>
				<td>${tarefa.estado}</td>
				<td>
				<fmt:formatDate value="${tarefa.data}" pattern="dd/MM/yyyy"/>
				</td>
				
				
			</tr>
		</c:forEach>
	</table>
</div>
<br /><br />
<footer id="footer">
            <ul style="list-style: none;" align="center">
            <li>Copyright &copy; Daniel Dias dos Santos 2016</li>
           </ul>
        </footer>

</body>
</html>