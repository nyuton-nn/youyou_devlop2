package asynctest.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.support.TransactionTemplate;

import asynctest.mapper.KabuAllMapper;
import asynctest.mapper.MtUserMapper;
import asynctest.mapper.MtUserMapperCustom;
import asynctest.model.MtUserModel;


/*Reference URL*/
/*https://qiita.com/koashi/items/e4d428618f787f6d2d98*/
@Repository
public class TranTemplate {

	@Autowired
	private TransactionTemplate transactionTemplate;
	@Autowired
	KabuAllMapper kabuAllMapper;
	
	@Autowired
	MtUserMapper mtUserMapper;
	
	@Autowired
	MtUserMapperCustom mtUserMapperCustom;

	public List<MtUserModel>  templateSelect() {
		List<MtUserModel> result = null;
		result = transactionTemplate.execute( status -> {
	        // DB����
			List<MtUserModel> count = mtUserMapper.selectByExample(null);

	        // �����I�Ƀ��[���o�b�N�������Ƃ�
	        // status.setRollbackOnly();

	        // �Q�ƌ��ʓ�������Ƃ���return����
			return count;
	    });
		return result;
	}
	
	public long templateInsert(List<asynctest.dto.DbtestRequest.Datalist> inpustList) {
		long result = transactionTemplate.execute( status -> {
			List<MtUserModel> userList = new ArrayList<MtUserModel>();
			MtUserModel mtUserModer = null;
			long resultCount=0;
			int count=0;
			// DB����
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
			// �J��Ԃ������Ŏc�������X�g��o�^����
			if (userList.size() > 0) {
				resultCount = resultCount + mtUserMapperCustom.insertBulk(userList);
			}
	        // �����I�Ƀ��[���o�b�N�������Ƃ�
	        // status.setRollbackOnly();

	        // �Q�ƌ��ʓ�������Ƃ���return����
	        return resultCount;
	    });
		return result;
	}
}
