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
package br.com.danieldias.jsf.repositorio;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.bson.types.ObjectId;

import br.com.danieldias.jsf.model.Pessoa;

/**
 * @author daniel 
 * github:Daniel-Dos 
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
public class PessoaDAOImpl implements PessoaDAO {

	@Inject
	private EntityManager em;

	@Override
	public void adicionar(Pessoa entidade) {
		em.persist(entidade);
	}

	@Override
	public void atualizar(Pessoa entidade) {
		em.merge(entidade);
	}

	@Override
	public void excluir(ObjectId id) {
		em.remove(getPorId(id));
	}

	@Override
	public Pessoa getPorId(ObjectId id) {
		return em.createQuery("select e from Pessoa e where e.id =:id", Pessoa.class)
				.setParameter("id", id.toString())
				.getSingleResult();
	}

	@Override
	public List<Pessoa> getPessoas() {
		return em.createQuery("FROM Pessoa", Pessoa.class).getResultList();
	}
}