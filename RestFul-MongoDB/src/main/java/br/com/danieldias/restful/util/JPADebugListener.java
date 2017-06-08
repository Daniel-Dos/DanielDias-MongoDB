/*
 * Copyright © 2017 Daniel Dias (daniel.dias.analistati@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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