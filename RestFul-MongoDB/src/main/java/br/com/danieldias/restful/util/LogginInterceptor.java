package br.com.danieldias.restful.util;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;


/**
 * @author daniel 
 * github:Daniel-Dos 
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
@Loggable
@Interceptor
public class LogginInterceptor {

	@Inject
	private Logger logger;

	@AroundInvoke
	private Object intercept(InvocationContext ic) throws Exception {
		logger.info("> {}");
		logger.log(Level.INFO, "> {}", ic.getMethod());
		try {
			return ic.proceed();
		} finally {
			logger.log(Level.INFO,"< {}", ic.getMethod());
		}
	}
}