package idv.cheng.mapper;

import org.apache.ibatis.annotations.Select;

import idv.cheng.pojo.Users;

public interface UsersMapper {
	@Select("select * from users where username=#{username} and password=#{password}")
	Users selByUsersPwd(Users users);

}
