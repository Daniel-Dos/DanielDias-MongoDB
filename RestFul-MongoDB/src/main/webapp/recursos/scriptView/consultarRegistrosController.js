var consultarRegistrosControllerApp = angular.module(
		"consultarRegistrosControllerApp", []);

consultarRegistrosControllerApp
		.controller(
				"consultarRegistrosController",
				function($scope, $window, $http) {

					/*
					 * CRIANDO UM ARRAY PARA OS REGISTROS QUE VÃO SER RETORNADOS
					 * PELO REST
					 */
					$scope.usuarios = new Array();

					$scope.init = function() {

						/*
						 * CHAMA O MÉTODO consultarTodos DO CONTROLLER
						 * GERENCIADO PELO REST
						 */
						var response = $http
								.get("http://localhost:8083/RestFul-MongoDB/api/pessoa");

						response
								.success(function(data, status, headers, config) {

									/*
									 * SETA OS REGISTROS QUE FORAM RETORNADOS DO
									 * CONTROLLER DO Rest, ESSE REGISTROS VÃO
									 * PREENCHER OS CAMPOS DA TABELA DA PÁGINA
									 * consultarRegistros.jsp ATAVÉS DO
									 * ng-repeat do AngularJS
									 */
									$scope.usuarios = data;

								});

						response.error(function(data, status, headers, config) {
							/*
							 * SE OCORRER ERRO NÃO TRATADO IREMOS MOSTRA EM
							 * MENSAGEM
							 */
							$window.alert(data);

						});
					}
				});