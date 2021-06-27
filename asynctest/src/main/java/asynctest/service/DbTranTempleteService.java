package asynctest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asynctest.dto.DbSelectResponse;
import asynctest.dto.DbtestRequest;
import asynctest.dto.DbtestResponse;
import asynctest.model.MtUserModel;
import asynctest.util.TranTemplate;

@Service
public class DbTranTempleteService {
	
	/*Explicit Transaction template*/
	@Autowired
	private TranTemplate tranTemplate;
	
	public DbSelectResponse select() {
		
		DbSelectResponse dbSelecttResponse = new DbSelectResponse();
		
		/*Explicit Transaction template*/
		List<MtUserModel> result = tranTemplate.templateSelect();
		
		/*result print*/
		System.out.println(result);
		
		/*set Response*/
		dbSelecttResponse.setResult(result);
		return dbSelecttResponse;
		
	}
	public DbtestResponse insert(DbtestRequest dbtestRequest) {
		
		DbtestResponse dbtestResponse = new DbtestResponse();
		List<asynctest.dto.DbtestRequest.Datalist> inpustList = dbtestRequest.getDatalist();

		
		/*Explicit Transaction template*/
		long result = tranTemplate.templateInsert(inpustList);
		
		/*result print*/
		System.out.println(result);
		
		/*set Response*/
		dbtestResponse.setResult(result);
		return dbtestResponse;
		
	}
}
