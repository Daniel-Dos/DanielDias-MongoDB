package br.com.danieldias.mongodb.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;

import static com.mongodb.client.model.Filters.eq;

import br.com.danieldias.mongodb.modelo.Pessoa;

/**
 * Servlet implementation class RemoverController
 * @author daniel
 */
@WebServlet("/RemoverController")
public class RemoverController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher visao = null;
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(request.getParameter("nome"));
		
		MongoClient conexao = new MongoClient();
		MongoDatabase dataBase = conexao.getDatabase("OmegaWare");
		MongoCollection<Document> collectionPessoas = dataBase.getCollection("Pessoas");
		
		DeleteResult deletar = collectionPessoas.deleteOne(eq("nome",pessoa.getNome()));
		
		visao = request.getRequestDispatcher("Inserir.jsp");
		visao.forward(request, response);
	}

}
