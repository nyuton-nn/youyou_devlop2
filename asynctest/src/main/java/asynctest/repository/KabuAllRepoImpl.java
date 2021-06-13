package asynctest.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import asynctest.mapper.KabuAllMapper;
import asynctest.model.KabuAllModelExample;
import asynctest.model.KabuAllModelExample.Criteria;


@Repository
public class KabuAllRepoImpl {
	
	@Autowired
	KabuAllMapper kabuallMapper;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public long select() {
		
//		KabuAllModelExample example = new KabuAllModelExample();
//		Criteria criteria = example.createCriteria();
//		criteria.andNumCloseBetween(null, null);
		
		//SELECT
		long result = kabuallMapper.countByExample(null);
		
		return result;
	}

	
}
