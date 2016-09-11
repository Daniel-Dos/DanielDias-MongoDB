<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserir no MongoDB</title>
<!-- bootstrap -->
	<link rel="stylesheet" href="recursos/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="recursos/bootstrap/css/bootstrap-theme.min.css">
	<script src="recursos/bootstrap/js/bootstrap.min.js"></script>
	<script src="recursos/bootstrap/js/jquery-3.1.0.min.js"></script>
<!-- bootstrap -->
<link rel="stylesheet" href="recursos/css/style.css">

</head>
<body>
<div class="navbar navbar-inverse navbar-fixed-top">
		<div>
			<ul class="nav navbar-nav">
				<li>
					<div class="navbar-header">
						<a href="index.html" class="navbar-brand">Home</a>
					</div>
				</li>
	
			</ul>
		</div>
	</div>

<img src="recursos/imagens/mongoDB.png" style="padding-top: 2cm"/>
<br /><br />

<form action="InserirController" method="post">

   Nome: <input type="text" name="nome"/><br /><br />
   Idade: <input type="number" name="idade"/><br /> <br />
   Profissão: <input type="text" name="profissao"/><br /><br />
   Endereço: <input type="text" name="endereco"/><br /><br />
   Cidade: <input type="text" name="cidade"/><br /><br />
   Bairro: <input type="text" name="bairro"/><br /><br />
   Estado: <input type="text" name="estado"/><br /><br/>
   Data de Nascimento:<input type="date" name="data"/>
   
   <input type="submit" value="Cadastrar Dados no MongoDB"/>


</form>

<h1>Lista dos Dados</h1>

<form action="ConsultarTodosController" method="post">
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
<input type="submit" value="consultar"/>
</form>

<h1>Deletar Dados</h1>

<form action="RemoverController"method="post">
Nome:<input type="text" name="nome"/>
<input type="submit" value="deletar"/>
</form>

</body>
</html>