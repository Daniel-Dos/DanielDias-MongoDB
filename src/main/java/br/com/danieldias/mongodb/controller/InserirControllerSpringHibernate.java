package br.com.danieldias.mongodb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import br.com.danieldias.mongodb.modelo.PessoaHibernate;
import br.com.danieldias.mongodb.persistencia.DAOFactory;
import br.com.danieldias.mongodb.persistencia.GenericoDAO;

@Controller
@RequestMapping("pessoaHibernateSpring")
public class InserirControllerSpringHibernate {
	
	@RequestMapping(value ="/InserirSpringHibernate.html", method= RequestMethod.GET)
	public ModelAndView Cadastrar() {
		return new ModelAndView("InserirSpringHibernate");
	}
	
	@RequestMapping("InserirSpringHibernate")
	public String adiciona(PessoaHibernate pessoa) {
		
		DAOFactory df = null;
		GenericoDAO<PessoaHibernate> daoPessoaHibernate = null;
		
		try {
			df = DAOFactory.getDaoFactory(DAOFactory.HIBERNATEOGM);
			daoPessoaHibernate = (GenericoDAO<PessoaHibernate>) df.getGenerioDAOPessoa();
			
			daoPessoaHibernate.incluir(pessoa);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return "ok2";
		
	}

}
