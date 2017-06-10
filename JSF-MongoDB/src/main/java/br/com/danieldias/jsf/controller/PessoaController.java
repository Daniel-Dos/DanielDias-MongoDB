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
package br.com.danieldias.jsf.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.bson.types.ObjectId;
import org.primefaces.event.RowEditEvent;

import br.com.danieldias.jsf.model.Endereco;
import br.com.danieldias.jsf.model.Pessoa;
import br.com.danieldias.jsf.servicos.PessoaServico;


/**
 * @author daniel 
 * github:Daniel-Dos 
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
@Named("pessoaController")
@RequestScoped
public class PessoaController {

	@Inject
	private PessoaServico pessoaServico ;
	
	private Pessoa pessoa;
	private Endereco endereco;
	private List<Pessoa> pessoas;

	@PostConstruct
	public void init() {
		pessoas = pessoaServico.listarPessoas();
		pessoa = new Pessoa();
		pessoa.setEndereco(new Endereco());
	}

	public void cadastrar() {
		pessoaServico.insert(pessoa);
		init();
		addMessage("Cliente Adicionado!");
	}

	public String atualizar() {
		try {
			pessoaServico.editarPessoa(pessoa);;
			init();
		} catch (Exception e) {
			addMessage(e.getMessage());
		}
		return "";
	}

	public void excluir() {
		try {
			ObjectId id = new ObjectId(pessoa.getId());
			pessoaServico.excluirPessoa(id);
		} catch (Exception e) {
			addMessage(e.getMessage());
		}
	}

	public void onEdit(RowEditEvent event) {
		pessoa = (Pessoa) event.getObject();
		atualizar();
		addMessage("Cliente " + pessoa.getNome() + " atualizado!");
	}
	
	private void addMessage(String message) {
		FacesMessage msg = new FacesMessage(message);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
}