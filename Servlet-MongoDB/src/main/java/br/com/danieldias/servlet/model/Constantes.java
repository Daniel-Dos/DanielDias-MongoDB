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
package br.com.danieldias.servlet.model;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author daniel 
 * github:Daniel-Dos 
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
@ApplicationScoped
public class Constantes {

	/* Nome do Banco e das Collections */
	public static final String BANCO_NOME = "javaMongo";
	public static final String COLLECTION_NOME = "Usuarios";

	/* Nomes das Colunas para o MongoDB */
	public static final String NOME = "nome";
	public static final String IDADE = "idade";
	public static final String PROFISSAO = "profissao";
	public static final String ENDERECO = "endereco";
	public static final String CIDADE = "cidade";
	public static final String BAIRRO = "bairro";
	public static final String ESTADO = "estado";
	public static final String DATA_CADASTRO = "data";
}