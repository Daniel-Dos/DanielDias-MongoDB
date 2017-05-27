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
package br.com.danieldias.restful.servicos;

import java.util.List;

import javax.inject.Inject;

import br.com.danieldias.restful.model.Pessoa;
import br.com.danieldias.restful.repositorio.PessoaDAO;

/**
 * @author daniel 
 * github:Daniel-Dos 
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
public class PessoaServico {

	@Inject
	private PessoaDAO pessoaDAO;

	public List<Pessoa> listarPessoas() {
		return pessoaDAO.getPessoas();
	}

	public void inserirPessoa(Pessoa pessoa) {
		pessoaDAO.adicionar(pessoa);
	}
}