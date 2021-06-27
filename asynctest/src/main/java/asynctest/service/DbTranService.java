package asynctest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asynctest.dto.DbSelectResponse;
import asynctest.dto.DbtestRequest;
import asynctest.dto.DbtestResponse;
import asynctest.model.MtUserModel;
import asynctest.repository.MtUserRepository;

@Service
public class DbTranService {
	
	/*Suggestion Transaction*/
	@Autowired
	private MtUserRepository mtUserRepository;	
	
	public DbSelectResponse select(DbtestRequest dbtestRequest) {
		System.out.println(dbtestRequest.getTest());
		
		DbSelectResponse dbSelecttResponse = new DbSelectResponse();
		/*Suggestion Transaction*/
		List<MtUserModel> result = mtUserRepository.select();
		
		/*result print*/
		System.out.println(result);
		
		/*set Response*/
		dbSelecttResponse.setResult(result);
		return dbSelecttResponse;
		
	}
	
	public DbtestResponse insert(DbtestRequest dbtestRequest) {
		System.out.println(dbtestRequest.getTest());
		
		List<asynctest.dto.DbtestRequest.Datalist> inpustList = dbtestRequest.getDatalist();
		
		DbtestResponse dbtestResponse = new DbtestResponse();
		
		/*Suggestion Transaction*/
		long result = mtUserRepository.insert(inpustList);
		
		/*result print*/
		System.out.println(result);
		
		/*set Response*/
		dbtestResponse.setResult(result);
		return dbtestResponse;
		
	}
}
