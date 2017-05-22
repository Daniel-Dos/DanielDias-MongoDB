/*
 * Copyright © 2017 Daniel Dias
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

import javax.enterprise.context.ApplicationScoped;
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