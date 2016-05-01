package br.com.danieldias.mongodb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import br.com.danieldias.mongodb.modelo.Pessoa;

/**
 * Servlet implementation class InserirController
 */
@WebServlet(description = "Controle para inserir um documento do mongodb", urlPatterns = { "/InserirController" })
public class InserirController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Pessoa pessoa  = new Pessoa();
		
		/*Recuperando dados do JSP*/
		pessoa.setNome(request.getParameter("nome"));
		pessoa.setIdade(Integer.parseInt(request.getParameter("idade")));
		pessoa.setProfissao(request.getParameter("profissao"));
		pessoa.setEndereco(request.getParameter("endereco"));
		pessoa.setCidade(request.getParameter("cidade"));
		pessoa.setBairro(request.getParameter("bairro"));
		pessoa.setEstado(request.getParameter("estado"));
		
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
				.append("Estado", pessoa.getEstado()) );
		
		PrintWriter saida  = response.getWriter();
		
		/*
		 * dataBase.getName() = recupera o nome do Banco
		 * collectionPessoas.getNamespace().getCollectionName() = recupera o nome da coleção
		 */
		saida.println("<h1>Os Dados Foram Inseridos com Sucesso no MongoDB na <br />DataBASE "+ dataBase.getName() +"<br /> e na Coleção " 
		+ collectionPessoas.getNamespace().getCollectionName() +" !</h1>");
		
		;
		
	}

}
