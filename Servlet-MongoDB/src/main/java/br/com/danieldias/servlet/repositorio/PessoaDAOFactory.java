package br.com.danieldias.servlet.repositorio;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;

import com.mongodb.MongoClient;

/**
 * @author daniel 
 * github:Daniel-Dos 
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
@ApplicationScoped
public class PessoaDAOFactory {

    private static MongoClient conexao = null;

    @Produces
    public static MongoClient createConnection() {

	if (conexao == null) {
	    conexao = new MongoClient();
	    System.out.println("Conexão ativada ");
	}
	return conexao;
    }

    @Produces
    public PessoaDAO createDAO() {
	return new PessoaDAOImpl(conexao);
    }
}
