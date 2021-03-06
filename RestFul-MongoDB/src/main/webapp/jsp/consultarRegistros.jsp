<%--

    Copyright © 2017 Daniel Dias (daniel.dias.analistati@gmail.com)

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html ng-app="consultarRegistrosControllerApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Consultar Registros</title>

<script type="text/javascript" src="../recursos/angular/angular.min.js"></script>
<script type="text/javascript" src="../recursos/scriptView/consultarRegistrosController.js"></script>

</head>
<body>
	<a class="btn btn-primary" href="adicionarRegistros.jsp">Adicionar
		Registros</a>
	<hr />
	<table ng-controller="consultarRegistrosController"
		data-ng-init="init()" id="tableData"
		class="table table-bordered table-hover table-striped">
		<thead>
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
				<td>Cidade: {{ usuario.endereco.cidade }} <br /> 
				Bairro: {{usuario.endereco.bairro }} <br /> 
				Estado: {{usuario.endereco.estado }}
				</td>
				<td>{{ usuario.dataCadastro}}</td>
				<td><a ng-href="editarRegistro.html/{{usuario.id}}"
					class="btn btn-info">Editar</a></td>
				<td><a href="#" ng-click="excluirRegistro(usuario.id)"
					class="btn btn-danger">Excluir</a></td>
			</tr>
		</tbody>
	</table>


	<br />
	<br />
	<jsp:include page="/templates/rodape.jsp"></jsp:include>
</body>
</html>