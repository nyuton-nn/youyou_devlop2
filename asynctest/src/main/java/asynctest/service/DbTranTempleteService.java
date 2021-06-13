package asynctest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asynctest.dto.DbtestResponse;
import asynctest.util.TranTemplate;

@Service
public class DbTranTempleteService {
	
	/*Explicit Transaction template*/
	@Autowired
	private TranTemplate tranTemplate;
	
	public DbtestResponse select() {
		
		DbtestResponse dbtestResponse = new DbtestResponse();
		
		/*Explicit Transaction template*/
		long result = tranTemplate.template();
		
		/*result print*/
		System.out.println(result);
		
		/*set Response*/
		dbtestResponse.setResult(result);
		return dbtestResponse;
		
	}
	public DbtestResponse insert() {
		
		DbtestResponse dbtestResponse = new DbtestResponse();
		
		/*Explicit Transaction template*/
		long result = tranTemplate.template();
		
		/*result print*/
		System.out.println(result);
		
		/*set Response*/
		dbtestResponse.setResult(result);
		return dbtestResponse;
		
	}
}
