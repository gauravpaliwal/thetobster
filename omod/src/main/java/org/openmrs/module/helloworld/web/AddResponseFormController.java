package org.openmrs.module.helloworld.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.context.Context;
import org.openmrs.module.helloworld.HelloWorldService;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class AddResponseFormController extends SimpleFormController {
	
    /** Logger for this class and subclasses */
    protected final Log log = LogFactory.getLog(getClass());

	@Override
	protected String formBackingObject(HttpServletRequest request) throws Exception {
		
		//String text = Context.getService(HelloWorldService.class);
		
		String text = "Not used";
		
		log.debug("Returning hello world text: " + text);
		
		return text;
		
	}

	@Override
	protected Map referenceData(HttpServletRequest req) throws Exception {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		HelloWorldService hService = (HelloWorldService)Context.getService(HelloWorldService.class);
		
		map.put("responses", hService.getResponses());
		
		return map;
		
	}
	
}
