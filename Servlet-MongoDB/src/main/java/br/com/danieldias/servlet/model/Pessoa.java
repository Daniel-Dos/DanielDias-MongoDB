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
package br.com.danieldias.servlet.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.enterprise.context.ApplicationScoped;

import lombok.Data;

/**
 * @author daniel 
 * github:Daniel-Dos 
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
@Data
@ApplicationScoped
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private int idade;
	private String profissao;
	private Endereco endereco;
	private LocalDate dataCadastro;
}