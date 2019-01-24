package idv.cheng.service.impl;

import idv.cheng.mapper.UsersMapper;
import idv.cheng.pojo.Users;
import idv.cheng.service.UsersService;

public class UsersServiceImpl implements UsersService {
	private UsersMapper usersMapper;

	@Override
	public Users login(Users users) {
		// TODO Auto-generated method stub
		return usersMapper.selByUsersPwd(users);
	}

	public UsersMapper getUsersMapper() {
		return usersMapper;
	}

	public void setUsersMapper(UsersMapper usersMapper) {
		this.usersMapper = usersMapper;
	}

}
