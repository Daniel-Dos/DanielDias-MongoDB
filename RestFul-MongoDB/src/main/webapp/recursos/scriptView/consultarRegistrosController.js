var consultarRegistrosControllerApp = angular.module("consultarRegistrosControllerApp",[]);

consultarRegistrosControllerApp.controller("consultarRegistrosController",function($scope, $window, $http){

	/*CRIANDO UM ARRAY PARA OS REGISTROS QUE VÃO SER RETORNADOS PELO SPRING*/
	 $scope.usuarios = new Array();

	 $scope.init = function(){

		 /*CHAMA O MÉTODO consultarTodos DO CONTROLLER GERENCIADO PELO SPRING*/
		 var response = $http.get("/RestFul-MongoDB/api/pessoa");

		 response.success(function(data, status, headers, config) {

			 /*SETA OS REGISTROS QUE FORAM RETORNADOS DO CONTROLLER DO SPRING,
			  ESSE REGISTROS VÃO PREENCHER OS CAMPOS DA TABELA DA PÁGINA consultarRegistros.jsp
			  ATAVÉS DO ng-repeat do AngularJS*/
			 $scope.usuarios = data;

		 });

		 response.error(function(data, status, headers, config) {
			 /*SE OCORRER ERRO NÃO TRATADO IREMOS MOSTRA EM MENSAGEM*/
			 $window.alert(data);

		 });
	 }

	 /*FUNÇÃO PARA EXCLUIR UM REGISTRO*/	 
	 $scope.excluirRegistro = function(codigo){

		 if($window.confirm("Deseja realmente excluir esse registro?")){

			 /*CHAMA O MÉTODO DO SPRING PARA EXCLUIR UM REGISTRO*/
			 var response = $http.delete("/RestFul-MongoDB/api/pessoa/deletar/" + codigo);

			 response.success(function(data, status, headers, config) {

				 $window.alert(data.mensagem);
				 /*RECARREGANDO OS REGISTROS CADASTRADOS*/
				 $scope.init();
			 });

			 response.error(function(data, status, headers, config) {
				 /*SE OCORRER ERRO NÃO TRATADO IREMOS MOSTRA EM MENSAGEM*/
				 $window.alert(data);
			 });
		 }
	 }
});s