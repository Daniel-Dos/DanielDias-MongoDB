package br.com.danieldias.servlet.repositorio;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.client.MongoCursor;

import br.com.danieldias.servlet.model.Pessoa;

/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
public interface PessoaDAO {

    void adicionar(Pessoa entidade);
    void atualizar(Pessoa entidade);
    void excluir(ObjectId id);
    Document getPorId(ObjectId id);
    MongoCursor<Document> getPessoas();
}