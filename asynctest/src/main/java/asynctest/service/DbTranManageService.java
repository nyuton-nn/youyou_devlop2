package asynctest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asynctest.dto.DbSelectResponse;
import asynctest.dto.DbtestRequest;
import asynctest.dto.DbtestResponse;
import asynctest.model.MtUserModel;
import asynctest.util.TranManager;

@Service
public class DbTranManageService {
	
	/*Explicit Transaction transaction-manager*/	
	@Autowired
	private TranManager tranManager;
	
	public DbSelectResponse select() {
		
		DbSelectResponse dbSelecttResponse = new DbSelectResponse();
		
		/*Explicit Transaction transaction-manager*/
		List<MtUserModel> result = tranManager.managerSelect();
		
		/*result print*/
		System.out.println(result);
		
		/*set Response*/
		dbSelecttResponse.setResult(result);
		return dbSelecttResponse;
		
	}
	public DbtestResponse insert(DbtestRequest dbtestRequest) {
		
		DbtestResponse dbtestResponse = new DbtestResponse();
		List<asynctest.dto.DbtestRequest.Datalist> inpustList = dbtestRequest.getDatalist();

		/*Explicit Transaction transaction-manager*/
		long result = tranManager.managerInsert(inpustList);
		
		/*result print*/
		System.out.println(result);
		
		/*set Response*/
		dbtestResponse.setResult(result);
		return dbtestResponse;
		
	}
}
