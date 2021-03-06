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
package br.com.danieldias.restful.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EntityListeners;

import br.com.danieldias.restful.util.JPADebugListener;
import lombok.Data;

/**
 * @author daniel 
 * github:Daniel-Dos 
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
@Embeddable
@Data
@EntityListeners(JPADebugListener.class)
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cidade;
	private String bairro;
	private String estado;
}