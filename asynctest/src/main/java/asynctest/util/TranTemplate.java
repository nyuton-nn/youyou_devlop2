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
	        // DB����
			long count = kabuAllMapper.countByExample(null);

	        // �����I�Ƀ��[���o�b�N�������Ƃ�
	        // status.setRollbackOnly();

	        // �Q�ƌ��ʓ�������Ƃ���return����
	        return count;
	    });
		return result;
	}
}
