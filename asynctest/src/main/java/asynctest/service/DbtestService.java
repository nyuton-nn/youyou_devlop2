package asynctest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asynctest.dto.DbtestResponse;
import asynctest.model.KabuAllModel;
import asynctest.repository.KabuAllRepoImpl;
import asynctest.repository.MtUserRepository;
import asynctest.mapper.KabuAllMapper;
import asynctest.util.TranManager;
import asynctest.util.TranTemplate;

@Service
public class DbtestService {
	
	/*Explicit Transaction template*/
	@Autowired
	private TranTemplate tranTemplate;
	
	/*Explicit Transaction transaction-manager*/	
	@Autowired
	private TranManager tranManager;
	
	/*Suggestion Transaction*/
	@Autowired
	private KabuAllMapper kabuallMapper;
	
	@Autowired
	private KabuAllRepoImpl kabuAllRepoImpl;
	
	@Autowired
	private MtUserRepository mtUserRepository;	
	
	public DbtestResponse dbTran() {
		
		DbtestResponse dbtestResponse = new DbtestResponse();
		
		/*Explicit Transaction template*/
//		long result = tranTemplate.template();

		/*Explicit Transaction transaction-manager*/
//		long result = tranManager.manager();

		/*Suggestion Transaction*/
//		long result = kabuallMapper.countByExample(null);
//		long result = kabuAllRepoImpl.select();
		long result = mtUserRepository.insert(null);
		
		/*result print*/
		System.out.println(result);
		
		/*set Response*/
		dbtestResponse.setResult(result);
		return dbtestResponse;
		
	}

}
