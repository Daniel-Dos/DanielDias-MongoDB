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

/**
 * Servlet implementation class ConsultarTodosController
 */
@WebServlet("/ConsultarTodosController")
public class ConsultarTodosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher visao = null;
		
		MongoClient conexao = new MongoClient();
		MongoDatabase dataBase = conexao.getDatabase("OmegaWare");
		MongoCollection<Document> collectionPessoas = dataBase.getCollection("Pessoas"); 
		
		request.setAttribute("listas", collectionPessoas.find().iterator());
		
		visao = request.getRequestDispatcher("Inserir.jsp");
		visao.forward(request, response);
	}

}
