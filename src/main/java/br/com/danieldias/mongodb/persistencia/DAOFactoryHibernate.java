package br.com.danieldias.mongodb.persistencia;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAOFactoryHibernate extends DAOFactory {

	private static EntityManagerFactory emf;
	
	
	public static EntityManagerFactory getEntityManagerFactory() {
		if(emf == null) {
			emf = Persistence.createEntityManagerFactory("mongo-og");
		}
		return emf;
	}
	
	public static void closeEntityManagerFactory() {
		if(emf != null && emf.isOpen()) emf.close();
	
	}
	
	
	@Override
	public GenericoDAO<?> getGenerioDAOPessoa() throws ClassNotFoundException, Exception {
		// TODO Auto-generated method stub
		return new PessoaDAO();
	}

	

}
