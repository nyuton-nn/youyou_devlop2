package asynctest.util;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import asynctest.mapper.KabuAllMapper;

@Repository
public class TranManager {

	@Autowired
	private PlatformTransactionManager transactionManager;
	
	@Autowired
	KabuAllMapper kabuAllMapper;
	
	//ReferenceURL
	//https://qiita.com/suema0331/items/20dfb63bef0a39ef79a2
	//https://qiita.com/NagaokaKenichi/items/a279857cc2d22a35d0dd
	public long manager()  throws DataAccessException {

		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status = this.transactionManager.getTransaction(def);

		long kabuAllModel = 0;
		try {
			// DB操作
			kabuAllModel = kabuAllMapper.countByExample(null);
			System.out.println(kabuAllModel);
			// OKならコミット
			transactionManager.commit(status);
		} catch (Exception e) {		
			// NGならロールバック
			transactionManager.rollback(status);
		}
		return kabuAllModel;
	}
}
