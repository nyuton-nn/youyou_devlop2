package asynctest.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.support.TransactionTemplate;

import asynctest.mapper.KabuAllMapper;


/*Reference URL*/
/*https://qiita.com/koashi/items/e4d428618f787f6d2d98*/
@Repository
public class TranTemplate {

	@Autowired
	private TransactionTemplate transactionTemplate;
	@Autowired
	KabuAllMapper kabuAllMapper;

	public long template() {
		long result = transactionTemplate.execute( status -> {
	        // DB操作
			long count = kabuAllMapper.countByExample(null);

	        // 明示的にロールバックしたいとき
	        // status.setRollbackOnly();

	        // 参照結果等があるときはreturnする
	        return count;
	    });
		return result;
	}
}
