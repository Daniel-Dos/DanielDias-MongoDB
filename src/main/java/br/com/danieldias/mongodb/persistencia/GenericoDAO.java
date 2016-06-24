/**
 * 
 */
package br.com.danieldias.mongodb.persistencia;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Daniel.Dias
 *
 */
public interface GenericoDAO<T> {
	
	void incluir(T entidade) throws SQLException;
	List<T>getUsuarios() throws Exception;
	void alterar(T entidade) throws Exception;
	void excluir(T entidade) throws Exception;
	
	

}
