package br.com.danieldias.mongodb.persistencia;

public abstract class DAOFactory {
	public final static int HIBERNATEOGM = 1;
	
	public static DAOFactory getDaoFactory(int x) throws ClassNotFoundException {
		if(x == HIBERNATEOGM) 
			return new DAOFactoryHibernate();
		else 
			return null;
	}

	public abstract GenericoDAO<?>getGenerioDAOPessoa() throws ClassNotFoundException,Exception;
}
