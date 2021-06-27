package asynctest.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import asynctest.mapper.MtUserMapper;
import asynctest.mapper.MtUserMapperCustom;
import asynctest.model.MtUserModel;
import asynctest.model.MtUserModelExample;
import asynctest.model.MtUserModelExample.Criteria;

@Repository
public class MtUserRepository {
	
	@Autowired
	MtUserMapper mtUserMapper;
	
	@Autowired
	MtUserMapperCustom mtUserMapperCustom;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public List<MtUserModel> select() {
		
//		KabuAllModelExample example = new KabuAllModelExample();
//		Criteria criteria = example.createCriteria();
//		criteria.andNumCloseBetween(null, null);
		
		System.out.println("ƒŠƒ|ƒWƒgƒŠ“’B");
		//SELECT
		List<MtUserModel> result = mtUserMapper.selectByExample(null);
//		try {
//			 Thread.sleep(10000); // 10•b(1–œƒ~ƒŠ•b)ŠÔ‚¾‚¯ˆ—‚ğ~‚ß‚é
//			} catch (InterruptedException e) {
//			}
		return result;
	}

	//insertBulk
	//https://qiita.com/tamorieeeen/items/a4375f1500634d5ad1c6
	@SuppressWarnings("null")
	@Transactional(propagation=Propagation.REQUIRED)
	public long insert(List<asynctest.dto.DbtestRequest.Datalist> inpustList) {

		List<MtUserModel> userList = new ArrayList<MtUserModel>();
		MtUserModel mtUserModer = null;

		long resultCount=0;
		int count=0;
		for(asynctest.dto.DbtestRequest.Datalist input: inpustList) {
			if(input.getID() != null && input.getID() != "") {
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
				System.out.println(mtUserModer.getId());
				System.out.println(mtUserModer.getName());
				System.out.println(mtUserModer.getNameKana());
				System.out.println(mtUserModer.getMail());
				userList.add(mtUserModer);	
			}
			count++;
			if(count>200) {
				System.out.println("Œ‹‰Ê:"+resultCount);
				resultCount = resultCount + mtUserMapperCustom.insertBulk(userList);
				count=0;
				userList = new ArrayList<MtUserModel>();
			}
		}
		//ŒJ‚è•Ô‚µˆ—‚Åc‚Á‚½ƒŠƒXƒg‚ğ“o˜^‚·‚é
		if(userList.size() > 0) {
			resultCount = resultCount + mtUserMapperCustom.insertBulk(userList);
		}
//		try {
//			 Thread.sleep(10000); // 10•b(1–œƒ~ƒŠ•b)ŠÔ‚¾‚¯ˆ—‚ğ~‚ß‚é
//			} catch (InterruptedException e) {
//			}
		
		return resultCount;
	}
}
