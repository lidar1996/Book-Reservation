package twins.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import twins.boundaries.OperationBoundary;
import twins.logic.OperationsService;


@RestController
public class OperationController {
	private OperationsService operationService;
	
	
	@Autowired
	public OperationController(OperationsService operationService) {
		super();
		this.operationService = operationService;
	}

	@RequestMapping(
			path="/twins/operations", 
			method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin(origins = "http://localhost:3000")
	public Object invokeOperationOnItem(@RequestBody OperationBoundary operation){
		//input.setOperationId(null);
		return operationService.invokeOperation(operation);	}
	
	@RequestMapping(
			path="/twins/operations/async", 
			method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin(origins = "http://localhost:3000")
	public OperationBoundary asyncOperation(@RequestBody OperationBoundary operation){
		//input.setOperationId(null);
		return operationService.invokeAsynchronousOperation(operation);		
	}
	
	

}
