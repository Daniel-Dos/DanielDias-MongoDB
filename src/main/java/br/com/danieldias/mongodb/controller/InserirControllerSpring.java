package br.com.danieldias.mongodb.controller;

import static com.mongodb.client.model.Filters.eq;

import org.bson.Document;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;

import br.com.danieldias.mongodb.modelo.Pessoa;

@Controller
@RequestMapping("pessoa")
public class InserirControllerSpring {
	
	
	@RequestMapping(value ="/InserirSpring.html", method= RequestMethod.GET)
	public ModelAndView Cadastrar(){
		
		return new ModelAndView("InserirSpring");
	}
	
	@RequestMapping(value ="/AlterarSpring.html", method= RequestMethod.GET)
	public ModelAndView Alterar() {
		return new ModelAndView("AlterarSpring");
	}
	
	@RequestMapping(value="/RemoverSpring.html",method=RequestMethod.GET)
	public ModelAndView Remover() {
		return new ModelAndView("RemoverSpring");
	}
	
	@RequestMapping(value="InserirSpring",method= RequestMethod.POST)
	public String adiciona(Pessoa pessoa) {
		
		/*
		/*Criando a conexao com o MongoDB*/
		MongoClient conexao = new MongoClient(); //host = localhost e porta = 27017
		
		//acessando ou criando uma database
		MongoDatabase dataBase = conexao.getDatabase("OmegaWare"); // caso no exista, sera criado um database chamado OmegaWare
		
		//criando ou recuperando uma cole��o 
		//caso no exista, sera criado um Collection chamado Pessoas
		MongoCollection<Document> collectionPessoas = dataBase.getCollection("Pessoas"); 
		
		// inserindo 
		collectionPessoas.insertOne(
				new Document("nome",pessoa.getNome())
				.append("Idade", pessoa.getIdade())
				.append("Profiss�o", pessoa.getProfissao())
				.append("Endere�o", pessoa.getEndereco())
				.append("Cidade", pessoa.getCidade())
				.append("Bairro", pessoa.getBairro())
				.append("Estado", pessoa.getEstado())
				.append("Nascimento", pessoa.getData().getTime())
				);
		
		return "ok";
	}
	
	// Listando Tudo
	@RequestMapping(value="listagem",method= RequestMethod.GET)
	public String lista(Model model) {
		
		MongoClient conexao = new MongoClient();
		MongoDatabase dataBase = conexao.getDatabase("OmegaWare");
		MongoCollection<Document> collectionPessoas = dataBase.getCollection("Pessoas"); 
		
		model.addAttribute("listas", collectionPessoas.find().iterator());
		
		return "lista";
	}
	
	// Atualizando
	@RequestMapping(value="alterar",method=RequestMethod.POST)
	public String update(Pessoa pessoa) {
		
		MongoClient conexao = new MongoClient();
		MongoDatabase dataBase = conexao.getDatabase("OmegaWare");
		MongoCollection<Document> collectionPessoas = dataBase.getCollection("Pessoas");
		
		UpdateResult update = collectionPessoas.updateOne(eq("nome",pessoa.getNome()), 
				new Document("$set",
						new Document("Idade",pessoa.getIdade())
						.append("Profiss�o", pessoa.getProfissao())
						.append("Endere�o", pessoa.getEndereco())
						.append("Cidade", pessoa.getCidade())
						.append("Bairro", pessoa.getBairro())
						.append("Estado", pessoa.getEstado())
						)
				);
		return "ok3";
	}
	// Removendo
	@RequestMapping(value="remover",method=RequestMethod.GET)
	public String deletar(Pessoa pessoa) {
		
		MongoClient conexao = new MongoClient();
		MongoDatabase dataBase = conexao.getDatabase("OmegaWare");
		MongoCollection<Document> collectionPessoas = dataBase.getCollection("Pessoas");
		
		DeleteResult deletar = collectionPessoas.deleteOne(eq("nome",pessoa.getNome()));
		
		return "ok4";
	}

}