package br.com.danieldias.restful.util;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.*;

/**
 * @author daniel 
 * github:Daniel-Dos 
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
public class JPADebugListener {

	private Logger logger = Logger.getLogger(this.getClass().getName());

	@PrePersist
	private void pretPersist(Object object) {
		logger.log(Level.WARNING, "### DebugListener.prePersist({})", object);
	}

	@PostPersist
	private void postPersist(Object object) {
		logger.log(Level.WARNING, "### DebugListener.postPersist({})", object);
	}

	@PreUpdate
	private void preUpdate(Object object) {
		logger.log(Level.WARNING, "### DebugListener.preUpdate({})", object);
	}

	@PostUpdate
	private void postUpdate(Object object) {
		logger.log(Level.WARNING, "### DebugListener.postUpdate({})", object);
	}

	@PreRemove
	private void preRemove(Object object) {
		logger.log(Level.WARNING, "### DebugListener.preRemove({})", object);
	}

	@PostRemove
	private void postRemove(Object object) {
		logger.log(Level.WARNING, "### DebugListener.postRemove({})", object);
	}

	@PostLoad
	private void postLoad(Object object) {
		logger.log(Level.WARNING, "### DebugListener.postLoad({})", object);
	}
}