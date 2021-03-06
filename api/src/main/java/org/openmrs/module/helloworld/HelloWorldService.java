package org.openmrs.module.helloworld;

import java.util.List;

import org.openmrs.annotation.Authorized;
import org.openmrs.api.APIException;
import org.openmrs.module.helloworld.db.HelloWorldDAO;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface HelloWorldService {

	public void setHelloWorldDAO(HelloWorldDAO dao);

	/**
	 * Saves (creates) a new hello world response
	 * 
	 * @param saying to be created
	 * @throws APIException
	 */
	@Authorized({"Add Hello World Response"})
	public void createHelloWorldResponse(HelloWorldResponse saying) throws APIException;

	/**
	 * Get response by internal identifier
	 * 
	 * @param responseId internal saying identifier
	 * @return response with given internal identifier
	 * @throws APIException
	 */
	@Authorized({"View Hello World Response"})
	@Transactional(readOnly=true)
	public HelloWorldResponse getHelloWorldResponse(Integer sayingId) throws APIException;

	/**
	 * Save response
	 * 
	 * @param response to be updated
	 * @throws APIException
	 */
	@Authorized({"Edit Hello World Response"})
	public void updateHelloWorldResponse(HelloWorldResponse response) throws APIException;

	@Authorized({"View Hello World Response"})
	public List<HelloWorldResponse> getResponses() throws APIException;
}