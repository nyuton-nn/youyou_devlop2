package asynctest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asynctest.dto.DbtestResponse;
import asynctest.util.TranManager;

@Service
public class DbTranManageService {
	
	/*Explicit Transaction transaction-manager*/	
	@Autowired
	private TranManager tranManager;
	
	public DbtestResponse select() {
		
		DbtestResponse dbtestResponse = new DbtestResponse();
		
		/*Explicit Transaction transaction-manager*/
		long result = tranManager.manager();
		
		/*result print*/
		System.out.println(result);
		
		/*set Response*/
		dbtestResponse.setResult(result);
		return dbtestResponse;
		
	}
	public DbtestResponse insert() {
		
		DbtestResponse dbtestResponse = new DbtestResponse();
		
		/*Explicit Transaction transaction-manager*/
		long result = tranManager.manager();
		
		/*result print*/
		System.out.println(result);
		
		/*set Response*/
		dbtestResponse.setResult(result);
		return dbtestResponse;
		
	}
}
