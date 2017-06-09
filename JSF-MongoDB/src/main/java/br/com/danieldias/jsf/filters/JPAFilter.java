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
package br.com.danieldias.jsf.filters;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/***
 * ESSE FILTER VAI SER CHAMADO TODA VEZ QUE FOR REALIZADO 
 * UMA REQUISIÇÃO PARA O FACES SERVLET.
 * */
@WebFilter(servletNames ={ "Faces Servlet" })
public class JPAFilter implements Filter {

	
	private EntityManagerFactory entityManagerFactory;
	
	private String persistence_unit_name = "jsf-MongoDB";
	
    public JPAFilter() {

    }
    
	public void destroy() {
		
		this.entityManagerFactory.close();
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		/*CRIANDO UM ENTITYMANAGER*/
		EntityManager entityManager =  this.entityManagerFactory.createEntityManager();
		
		/*ADICIONANDO ELE NA REQUISIÇÃO*/
		request.setAttribute("entityManager", entityManager);
		
		/*INICIANDO UMA TRANSAÇÃO*/
		entityManager.getTransaction().begin();
		
		/*INICIANDO FACES SERVLET*/
		chain.doFilter(request, response);
		
		try {
			
			/*SE NÃO TIVER ERRO NA OPERAÇÃO ELE EXECUTA O COMMIT*/
			entityManager.getTransaction().commit();
			
		} catch (Exception e) {
			
			/*SE TIVER ERRO NA OPERAÇÃO É EXECUTADO O rollback*/
			entityManager.getTransaction().rollback();
		}
		finally{
			
			/*DEPOIS DE DAR O COMMIT OU ROLLBACK ELE FINALIZA O entityManager*/
			entityManager.close();
		}
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		
		/*CRIA O entityManagerFactory COM OS PARÂMETROS DEFINIDOS NO persistence.xml*/
		this.entityManagerFactory = Persistence.createEntityManagerFactory(this.persistence_unit_name); 
	}

}
