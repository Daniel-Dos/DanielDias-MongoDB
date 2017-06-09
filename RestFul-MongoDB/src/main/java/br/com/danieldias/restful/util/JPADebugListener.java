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

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author daniel 
 * github:Daniel-Dos 
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
public class JPADebugListener {

	private Logger logger = LogManager.getLogger(this.getClass().getName());

	@PrePersist
	private void pretPersist(Object object) {
		logger.debug("### DebugListener.prePersist({})", object);
	}

	@PostPersist
	private void postPersist(Object object) {
		logger.debug("### DebugListener.postPersist({})", object);
	}

	@PreUpdate
	private void preUpdate(Object object) {
		logger.debug("### DebugListener.preUpdate({})", object);
	}

	@PostUpdate
	private void postUpdate(Object object) {
		logger.debug("### DebugListener.postUpdate({})", object);
	}

	@PreRemove
	private void preRemove(Object object) {
		logger.debug("### DebugListener.preRemove({})", object);
	}

	@PostRemove
	private void postRemove(Object object) {
		logger.debug("### DebugListener.postRemove({})", object);
	}

	@PostLoad
	private void postLoad(Object object) {
		logger.debug("### DebugListener.postLoad({})", object);
	}
}