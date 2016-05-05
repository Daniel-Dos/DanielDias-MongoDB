package br.com.danieldias.mongodb.controller;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

import org.bson.Document;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import br.com.danieldias.mongodb.modelo.Pessoa;

@Controller
public class InserirControllerSpring {
	
	@RequestMapping("InserirSpring")
	public String adiciona(Pessoa pessoa) {
		
		/*Criando a conexao com o MongoDB*/
		MongoClient conexao = new MongoClient(); //host = localhost e porta = 27017
		
		//acessando ou criando uma database
		MongoDatabase dataBase = conexao.getDatabase("OmegaWare"); // caso no exista, sera criado um database chamado OmegaWare
		
		//criando ou recuperando uma coleção 
		//caso no exista, sera criado um Collection chamado Pessoas
		MongoCollection<Document> collectionPessoas = dataBase.getCollection("Pessoas"); 
		
		
		
		
		
		// inserindo 
		collectionPessoas.insertOne(
				new Document("nome",pessoa.getNome())
				.append("Idade", pessoa.getIdade())
				.append("Profissão", pessoa.getProfissao())
				.append("Endereço", pessoa.getEndereco())
				.append("Cidade", pessoa.getCidade())
				.append("Bairro", pessoa.getBairro())
				.append("Estado", pessoa.getEstado())
<<<<<<< HEAD
				.append("Data", pessoa.getDataFinalizacao().getTime()));
=======
				.append("Data de Nascimento", pessoa.getData().getTime())
				);
>>>>>>> 94f9db3238fbb742901ea86f3ee204fb221a244f
		
		return "ok";
	}
	

}