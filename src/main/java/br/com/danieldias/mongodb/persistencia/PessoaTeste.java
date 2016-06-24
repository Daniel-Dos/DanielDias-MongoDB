package br.com.danieldias.mongodb.persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
	@Override
	public List<PessoaHibernate> getUsuarios() throws Exception {
		
		List<PessoaHibernate> usuarios = manager.createQuery("FROM PessoaHibernate",PessoaHibernate.class).getResultList();
		
		return usuarios;
	}
	@Override
	public void alterar(PessoaHibernate entidade) throws Exception {
		// TODO Auto-generated method stub
		Query query = manager.createQuery("FROM PessoaHibernate where nome=:nome",PessoaHibernate.class);
		query.setParameter("nome",entidade.getNome());
		
		PessoaHibernate id = (PessoaHibernate) query.getSingleResult();
		
		entidade.setId(id.getId());
		entidade.setNome(id.getNome());
		entidade.setData(id.getData());
		
		manager.merge(entidade);
		
	}
	@Override
	public void excluir(PessoaHibernate entidade) throws Exception {
		
		//Query query = manager.createQuery("FROM PessoaHibernate where nome=:nome",PessoaHibernate.class);
		//query.setParameter("nome",entidade.getNome());
		
		//PessoaHibernate id = (PessoaHibernate) query.getSingleResult();
		
		//manager.remove(id);
		
     //String query1 = ;
		
		// remove todos dos dados, onde o nome for igual.
		Query query =  manager.createNativeQuery("db.PessoaHibernate.remove({'nome':'"+entidade.getNome()+"'})",PessoaHibernate.class);
		
		query.executeUpdate();
		
		
		
		
	}

}
