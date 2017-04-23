package br.com.danieldias.servlet.repositorio;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import br.com.danieldias.servlet.model.Constantes;
import br.com.danieldias.servlet.model.Pessoa;

/**
 * @author daniel 
 * github:Daniel-Dos 
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
public class PessoaDAOImpl implements PessoaDAO {

    MongoClient mongoClient;
    MongoCollection<Document> collectionPessoas;

    public PessoaDAOImpl(MongoClient conexao) {
	this.mongoClient = conexao;
	this.mongoClient = PessoaDAOFactory.createConnection();
	this.collectionPessoas = mongoClient.getDatabase(Constantes.BANCO_NOME)
		.getCollection(Constantes.COLLECTION_NOME);
    }

    @Override
    public void adicionar(Pessoa entidade) {
    }

    @Override
    public void atualizar(Pessoa entidade) {
    }

    @Override
    public void excluir(ObjectId id) {
    }

    @Override
    public Document getPorId(ObjectId id) {
	return null;
    }

    @Override
    public MongoCursor<Document> getPessoas() {
	return null;
    }
}