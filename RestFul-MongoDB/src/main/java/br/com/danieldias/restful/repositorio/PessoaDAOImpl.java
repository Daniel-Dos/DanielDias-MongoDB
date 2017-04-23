/*
 * Copyright 2017 daniel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.danieldias.restful.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.bson.types.ObjectId;

import br.com.danieldias.restful.model.Pessoa;

/**
 * @author daniel 
 * github:Daniel-Dos 
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
public class PessoaDAOImpl implements PessoaDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("RestFul-MongoDB");
	EntityManager em = emf.createEntityManager();

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
	public Pessoa getPorId(ObjectId id) {
		return null;
	}

	@Override
	public List<Pessoa> getPessoas() {
		return em.createQuery("FROM Pessoa", Pessoa.class).getResultList();
	}
}