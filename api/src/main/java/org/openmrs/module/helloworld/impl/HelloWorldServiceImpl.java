package org.openmrs.module.helloworld.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.APIException;
import org.openmrs.module.helloworld.HelloWorldResponse;
import org.openmrs.module.helloworld.HelloWorldService;
import org.openmrs.module.helloworld.db.HelloWorldDAO;

/**
 * HelloWorldResponse-related services
 * 
 * @author Ben Wolfe
 * @vesrion 1.0
 */
public class HelloWorldServiceImpl implements HelloWorldService {

	private Log log = LogFactory.getLog(this.getClass());
	
	private HelloWorldDAO dao;
	
	public HelloWorldServiceImpl() {	}
	
	private HelloWorldDAO getHelloWorldDAO() {
		return dao;
	}
	
	public void setHelloWorldDAO(HelloWorldDAO dao) {
		this.dao = dao;
	}
	
	/**
	 * Creates a new helloWorldResponse record
	 * 
	 * @param helloWorldResponse to be created
	 * @throws APIException
	 */
	public void createHelloWorldResponse(HelloWorldResponse helloWorldResponse) throws APIException {
		getHelloWorldDAO().createHelloWorldResponse(helloWorldResponse);
	}

	/**
	 * Get helloWorldResponse by internal identifier
	 * 
	 * @param helloWorldResponseId internal helloWorldResponse identifier
	 * @return helloWorldResponse with given internal identifier
	 * @throws APIException
	 */
	public HelloWorldResponse getHelloWorldResponse(Integer helloWorldResponseId) throws APIException {
		return getHelloWorldDAO().getHelloWorldResponse(helloWorldResponseId);
	}

	/**
	 * Update helloWorldResponse 
	 * 
	 * @param helloWorldResponse to be updated
	 * @throws APIException
	 */
	public void updateHelloWorldResponse(HelloWorldResponse helloWorldResponse) throws APIException {
		getHelloWorldDAO().updateHelloWorldResponse(helloWorldResponse);
	}
	
	/**
	 * Get helloWorldResponses
	 * 
	 * @return helloWorldResponse list
	 * @throws APIException
	 */
	public List<HelloWorldResponse> getResponses() throws APIException {
		return getHelloWorldDAO().getResponses();
	}
	
}
