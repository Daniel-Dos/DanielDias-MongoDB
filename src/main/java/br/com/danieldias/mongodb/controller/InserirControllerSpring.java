package br.com.danieldias.mongodb.controller;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mongodb.Block;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
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
				.append("Nascimento", pessoa.getData().getTime())
				);
		
		return "ok";
	}
	
	// Listando Tudo
	@RequestMapping("listagem")
	public String lista(Model model) {
		
		MongoClient conexao = new MongoClient();
		MongoDatabase dataBase = conexao.getDatabase("OmegaWare");
		MongoCollection<Document> collectionPessoas = dataBase.getCollection("Pessoas"); 
		
		model.addAttribute("listas", collectionPessoas.find().iterator());
		
		return "lista";
	}

}