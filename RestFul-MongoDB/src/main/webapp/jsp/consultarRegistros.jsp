<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html ng-app="consultarRegistrosControllerApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consultar Registros</title>

<script type="text/javascript"
	src="../recursos/angular/angular.min.js"></script>
<script type="text/javascript"
	src="../recursos/scriptView/consultarRegistrosController.js"></script>

</head>
<body>

	<table ng-controller="consultarRegistrosController" data-ng-init="init()" id="tableData" class="table table-bordered table-hover table-striped">
		<thead >
			<tr>
			    <th>ID</th>
				<th>Nome</th>
				<th>Idade</th>
				<th>Profissão</th>
				<th>Endereço</th>
				<th>Data de Nascimento</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<tr ng-repeat="usuario in usuarios">
			    <td>{{ usuario.id }}</td>
				<td>{{ usuario.nome }}</td>
				<td>{{ usuario.idade }}</td>
				<td>{{ usuario.profissao }}</td>
				<td>
				Cidade: {{ usuario.endereco.cidade }} <br />
				Bairro: {{ usuario.endereco.bairro }} <br />
				Estado: {{ usuario.endereco.estado }}
				</td>
				<td>{{ usuario.dataCadastro}}</td>
			</tr>
		</tbody>
	</table>


	<br />
	<br />
	<jsp:include page="/templates/rodape.jsp"></jsp:include>
</body>
</html>