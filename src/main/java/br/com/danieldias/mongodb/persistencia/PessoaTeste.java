package br.com.danieldias.mongodb.persistencia;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.danieldias.mongodb.modelo.PessoaHibernate;

@Repository
@Transactional
public class PessoaTeste implements GenericoDAO<PessoaHibernate> {

	@PersistenceContext
	EntityManager manager;
	@Override
	public void incluir(PessoaHibernate entidade) throws SQLException {
		
		manager.persist(entidade);
		
	}

}
