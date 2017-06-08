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
<!DOCTYPE html>
<html ng-app="cadastrarControllerApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Adicionar Registros</title>
<script type="text/javascript" src="../recursos/angular/angular.min.js"></script>
<script type="text/javascript"
	src="../recursos/scriptView/cadastrarRegistrosController.js"></script>
<script type="text/javascript" src="../recursos/scriptView/funcoes.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="container">
				<div class="col-md-8" style="margin-left: 200px;">
					<br />
					<form ng-controller="cadastrarController" role="form">

						<h2 align="center">Novo Cadastro de Usuário</h2>
						<br />

						<div class="form-group">

							<label for="input-nome" class="col-sm-3 control-label">Nome:</label>
							<div class="col-sm-6">
								<input type="text" class=" form-control" id="input-nome"
									style="width: 220px;" ng-model="nome" />
							</div>

							<br /> <br />
						</div>

						<div class="form-group">
							<label for="input-idade" class="col-sm-3 control-label">Idade:</label>
							<div class="col-sm-6">
								<input type="text" class=" form-control" id="input-idade"
									style="width: 120px;" ng-model="idade" />
							</div>
							<br /> <br />
						</div>

						<div class="form-group">
							<label for="input-profissao" class="col-sm-3 control-label">Profissão:</label>
							<div class="col-sm-6">
								<input type="text" class=" form-control" id="input-profissao"
									style="width: 120px;" ng-model="profissao" />
							</div>
							<br /> <br />
						</div>

						<div class="form-group">
							<label for="input-dataCadasdro" class="col-sm-3 control-label">Data
								de Cadastro:</label>
							<div class="col-sm-6">
								<input type="text" class=" form-control" id="input-dataCadastro"
									style="width: 120px;" ng-model="dataCadastro"
									placeholder="dd/MM/yyyy" maxlength="10"
									onkeypress="formata_mascara(this,'##/##/####');" />
							</div>
							<br /> <br />
						</div>

						<div class="form-group">
							<label for="input-endereco.cidade" class="col-sm-3 control-label">Cidade:</label>
							<div class="col-sm-6">
								<input type="text" class=" form-control"
									id="input-endereco.cidade" style="width: 120px;"
									ng-model="endereco.cidade" />
							</div>
							<br /> <br />
						</div>
						<div class="form-group">
							<label for="input-endereco.bairro" class="col-sm-3 control-label">Bairro:</label>
							<div class="col-sm-6">
								<input type="text" class=" form-control"
									id="input-endereco.bairro" style="width: 120px;"
									ng-model="endereco.bairro" />
							</div>
							<br /> <br />
						</div>
						<div class="form-group">
							<label for="input-endereco.estado" class="col-sm-3 control-label">Estado:</label>
							<div class="col-sm-6">
								<input type="text" class=" form-control"
									id="input-endereco.estado" style="width: 120px;"
									ng-model="endereco.estado" />
							</div>
							<br /> <br />
						</div>

						<p>
							<input type="button" class="btn btn-success" value="Salvar"
								ng-click="salvarUsuario()" />
						</p>

						<hr />

						<a href="javascript:history.back(1);" class="btn btn-primary">Voltar</a>

					</form>
				</div>
			</div>
		</div>
	</div>
	<br />
	<br />
	<jsp:include page="/templates/rodape.jsp"></jsp:include>
</body>
</html>