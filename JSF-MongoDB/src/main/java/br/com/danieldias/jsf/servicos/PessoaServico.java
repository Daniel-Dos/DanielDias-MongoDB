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
package br.com.danieldias.jsf.servicos;

import java.util.List;

import javax.inject.Inject;

import org.bson.types.ObjectId;

import br.com.danieldias.jsf.model.Pessoa;
import br.com.danieldias.jsf.repositorio.PessoaDAO;
import br.com.danieldias.jsf.uteis.Transacao;

/**
 * @author daniel 
 * github:Daniel-Dos 
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
@Transacao
public class PessoaServico {

	@Inject
	private PessoaDAO pessoaDAO;

	public void insert(Pessoa pessoa) {
		pessoaDAO.adicionar(pessoa);
	}

	public List<Pessoa> listarPessoas() {
		return pessoaDAO.getPessoas();
	}

	public void excluirPessoa(ObjectId id) {
		pessoaDAO.excluir(id);
	}

	public void editarPessoa(Pessoa pessoa) {
		pessoaDAO.atualizar(pessoa);
	}
}