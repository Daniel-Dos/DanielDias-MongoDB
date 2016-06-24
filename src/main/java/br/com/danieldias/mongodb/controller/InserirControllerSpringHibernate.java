package br.com.danieldias.mongodb.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import br.com.danieldias.mongodb.modelo.PessoaHibernate;
import br.com.danieldias.mongodb.persistencia.DAOFactory;
import br.com.danieldias.mongodb.persistencia.GenericoDAO;
import br.com.danieldias.mongodb.persistencia.PessoaDAO;
import br.com.danieldias.mongodb.persistencia.PessoaTeste;

@Controller
@RequestMapping("pessoaHibernateSpring")
public class InserirControllerSpringHibernate {
	
	@Autowired
	PessoaTeste dao;
	
	@RequestMapping(value ="/InserirSpringHibernate.html", method= RequestMethod.GET)
	public ModelAndView Cadastrar() {
		return new ModelAndView("InserirSpringHibernate");
	}
	
	@RequestMapping(value ="/AlterarSpringHibernate.html", method= RequestMethod.GET)
	public ModelAndView Alterar() {
		return new ModelAndView("AlterarSpringHibernate");
	}
	
	@RequestMapping(value="/RemoverSpringHibernate.html",method=RequestMethod.GET)
	public ModelAndView Remover() {
		return new ModelAndView("RemoverSpringHibernate");
	}
	
	@RequestMapping("InserirSpringHibernate")
	public String adiciona(PessoaHibernate pessoa) throws SQLException {
		
		dao.incluir(pessoa);
		/*
		DAOFactory df = null;
		GenericoDAO<PessoaHibernate> daoPessoaHibernate = null;
		
		try {
			df = DAOFactory.getDaoFactory(DAOFactory.HIBERNATEOGM);
			daoPessoaHibernate = (GenericoDAO<PessoaHibernate>) df.getGenerioDAOPessoa();
			
			daoPessoaHibernate.incluir(pessoa);
		} catch(Exception e) {
			e.printStackTrace();
		}*/
		return "ok2";
		
	}
	
	// Listando Tudo
	@RequestMapping(value="listagem",method = RequestMethod.GET)
	public String lista(Model model) throws Exception {
		
		model.addAttribute("listas",dao.getUsuarios());
		
		return "listaHibernateSpring";
	}
	
	// Atualizando
	@RequestMapping(value="alterar",method=RequestMethod.POST)
	public String update(PessoaHibernate pessoa) throws Exception {
		
		dao.alterar(pessoa);
		
		return "okHibernate";
	}
	
	// Removendo
	@RequestMapping(value="remover",method = RequestMethod.GET)
	public String deletar(PessoaHibernate pessoa) throws Exception {
		
		dao.excluir(pessoa);
		
		return "okRemoveHibernate";
	}
	

}
