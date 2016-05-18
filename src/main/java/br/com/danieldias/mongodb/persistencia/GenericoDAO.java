/**
 * 
 */
package br.com.danieldias.mongodb.persistencia;

import java.sql.SQLException;

/**
 * @author Daniel.Dias
 *
 */
public interface GenericoDAO<T> {
	
	void incluir(T entidade) throws SQLException;

}
