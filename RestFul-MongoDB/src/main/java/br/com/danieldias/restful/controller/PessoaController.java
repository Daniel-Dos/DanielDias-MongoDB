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
package br.com.danieldias.restful.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.danieldias.restful.model.Mensagem;
import br.com.danieldias.restful.model.Pessoa;
import br.com.danieldias.restful.servicos.PessoaServico;

/**
 * @author daniel github:Daniel-Dos daniel.dias.analistati@gmail.com
 *         twitter:@danieldiasjava
 */
@Path("/pessoa")
public class PessoaController {

	@Inject
	private PessoaServico pessoaServico;

	@Inject
	Logger logger;

	@POST
	@Path("/cadastrar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response cadastrarPessoa(Pessoa pessoa) {
		pessoaServico.inserirPessoa(pessoa);
		logger.info("Salvo com Sucesso!");
		return Response.ok().entity(new Mensagem("Pessoa Adicionada Com Sucesso!")).build();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Pessoa> getPessoas() {
		logger.info("Listando as Pessoas.");
		return pessoaServico.listarPessoas();
	}
}