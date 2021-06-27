package asynctest.util;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import asynctest.mapper.KabuAllMapper;
import asynctest.mapper.MtUserMapper;
import asynctest.mapper.MtUserMapperCustom;
import asynctest.model.MtUserModel;

@Repository
public class TranManager {

	@Autowired
	private PlatformTransactionManager transactionManager;
	
	@Autowired
	KabuAllMapper kabuAllMapper;
	
	@Autowired
	MtUserMapper mtUserMapper;
	
	@Autowired
	MtUserMapperCustom mtUserMapperCustom;
	
	//ReferenceURL
	//https://qiita.com/suema0331/items/20dfb63bef0a39ef79a2
	//https://qiita.com/NagaokaKenichi/items/a279857cc2d22a35d0dd
	public List<MtUserModel> managerSelect()  throws DataAccessException {

		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status = this.transactionManager.getTransaction(def);
		List<MtUserModel> result = null;
		try {
			// DB操作
			result = mtUserMapper.selectByExample(null);

			// OKならコミット
			transactionManager.commit(status);
		} catch (Exception e) {		
			// NGならロールバック
			transactionManager.rollback(status);
		}
		return result;
	}
	
	public long managerInsert(List<asynctest.dto.DbtestRequest.Datalist> inpustList)  throws DataAccessException {

		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status = this.transactionManager.getTransaction(def);

		List<MtUserModel> userList = new ArrayList<MtUserModel>();
		MtUserModel mtUserModer = null;

		long resultCount=0;
		int count=0;
		try {
			// DB操作
			for (asynctest.dto.DbtestRequest.Datalist input : inpustList) {
				if (input.getID() != null && input.getID() != "") {
					mtUserModer = new MtUserModel();
					mtUserModer.setId(input.getID());
					mtUserModer.setName(input.getNAME());
					mtUserModer.setNameKana(input.getNAME_KANA());
					mtUserModer.setPass(input.getPASS());
					mtUserModer.setMail(input.getMAIL());
					mtUserModer.setPermission(input.getPERMISSION());
					mtUserModer.setValidflag(input.getValidFlag());
					mtUserModer.setCreatedate(null);
					mtUserModer.setUpdatedate(null);
					userList.add(mtUserModer);
				}
				count++;
				if (count > 200) {
					resultCount = resultCount + mtUserMapperCustom.insertBulk(userList);
					count = 0;
					userList = new ArrayList<MtUserModel>();
				}
			}
			// 繰り返し処理で残ったリストを登録する
			if (userList.size() > 0) {
				resultCount = resultCount + mtUserMapperCustom.insertBulk(userList);
			}

			// OKならコミット
			transactionManager.commit(status);
		} catch (Exception e) {
			// NGならロールバック
			transactionManager.rollback(status);
		}
		return resultCount;
	}

}
