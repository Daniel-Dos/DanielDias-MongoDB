/*
 * Copyright © 2017 Daniel Dias (daniel.dias.analistati@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
		this.collectionPessoas = mongoClient
				.getDatabase(Constantes.BANCO_NOME)
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