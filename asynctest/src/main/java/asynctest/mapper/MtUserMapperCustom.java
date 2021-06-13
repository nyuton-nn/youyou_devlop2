package asynctest.mapper;

import asynctest.model.MtUserModel;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MtUserMapperCustom {

	int insertBulk(@Param("userList")List<MtUserModel> userList);
}
