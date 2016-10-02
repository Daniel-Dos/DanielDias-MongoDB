package br.com.danieldias.mongodb.controller;

import static com.mongodb.client.model.Filters.eq;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.UpdateResult;

import br.com.danieldias.mongodb.modelo.Pessoa;

/**
 * Servlet implementation class AlterarController
 */
@WebServlet("/AlterarController")
public class AlterarController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher visao = null;
		Pessoa pessoa = new Pessoa();
		Logger log =
		        Logger.getLogger(AlterarController.class);
		
		 log.debug("Validando anexos obrigatorios...");
		
		MongoClient conexao = new MongoClient();
		MongoDatabase dataBase = conexao.getDatabase("OmegaWare");
		MongoCollection<Document> collectionPessoas = dataBase.getCollection("Pessoas");
		
		log.debug("Coletando Dados");
		
		pessoa.setNome(request.getParameter("nome"));
		pessoa.setIdade(Integer.parseInt(request.getParameter("idade")));
		pessoa.setProfissao(request.getParameter("profissao"));
		pessoa.setEndereco(request.getParameter("endereco"));
		pessoa.setCidade(request.getParameter("cidade"));
		pessoa.setBairro(request.getParameter("bairro"));
		pessoa.setEstado(request.getParameter("estado"));
		
		
		UpdateResult update = collectionPessoas.updateOne(eq("nome",pessoa.getNome()),
				new Document("$set",
						new Document("Idade",pessoa.getIdade())
						.append("Profissão",pessoa.getProfissao())
						.append("Endereo", pessoa.getEndereco())
						.append("Cidade", pessoa.getCidade())
						.append("Bairro", pessoa.getBairro())
						.append("Estado", pessoa.getEstado())));
		
		visao = request.getRequestDispatcher("Inserir.jsp");
		visao.forward(request, response);
	}

}