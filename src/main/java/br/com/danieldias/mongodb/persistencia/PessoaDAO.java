package br.com.danieldias.mongodb.persistencia;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.danieldias.mongodb.modelo.Pessoa;
import br.com.danieldias.mongodb.modelo.PessoaHibernate;
import br.com.danieldias.mongodb.modelo.Pessoa;

public class PessoaDAO  implements GenericoDAO<PessoaHibernate> {

	private EntityManagerFactory emf;
	private EntityManager em;
	
	public PessoaDAO() {
		this.emf = DAOFactoryHibernate.getEntityManagerFactory();
	}
	@Override
	public void incluir(PessoaHibernate entidade) throws SQLException {
		
		try {
			em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(entidade);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
		
	}

}
