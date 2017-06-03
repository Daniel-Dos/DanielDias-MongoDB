var cadastrarControllerApp = angular.module("cadastrarControllerApp",[]);

cadastrarControllerApp.controller("cadastrarController",function($scope, $window, $http){

	/*DEFININDO O MODELO PARA O NOSSO FORMULÁRIO*/
	$scope.nome  = null;
	$scope.idade = null;
	$scope.profissao = null;
	$scope.dataCadastro = null;
	$scope.endereco = null;
	
	$scope.salvarUsuario = function(){

		/*DEFINI O OBJETO QUE VAI SER ENVIADO VIA AJAX PELO ANGULARJS*/
		var usuarioModel =  new Object();
		usuarioModel.nome  = $scope.nome,
		usuarioModel.idade = $scope.idade,
		usuarioModel.profissao = $scope.profissao,
		usuarioModel.dataCadastro = $scope.dataCadastro,
		usuarioModel.endereco = $scope.endereco
		usuarioModel.endereco = $scope.endereco
		usuarioModel.endereco = $scope.endereco;	

		/*EXECUTA O POST PARA SALVAR O REGISTRO*/
		var response = $http.post("/RestFul-MongoDB/api/pessoa/cadastrar", usuarioModel);

		response.success(function(data, status, headers, config) {

			 $window.alert(data.mensagem);
			 $scope.init();
	 });

	 response.error(function(data, status, headers, config) {
		 /*SE OCORRER ERRO NÃO TRATADO IREMOS MOSTRA EM MENSAGEM*/
		 $window.alert(data);

	 });		

	};

	$scope.init = function(){
		 /*CHAMA O MÉTODO consultarTodos DO CONTROLLER GERENCIADO PELO SPRING*/
		 var response = $http.get("/RestFul-MongoDB/api/pessoa"); 
	 }
});