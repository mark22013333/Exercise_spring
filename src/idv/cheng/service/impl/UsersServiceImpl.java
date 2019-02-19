package idv.cheng.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import idv.cheng.mapper.UsersMapper;
import idv.cheng.pojo.Users;
import idv.cheng.service.UsersService;

public class UsersServiceImpl implements UsersService {

	@Value("${my.demo}")
	private String test;
	
	@Resource
	@Autowired
	private UsersMapper usersMapper;

	@Override
	public Users login(Users users) {
		// TODO Auto-generated method stub
		System.out.println("輸出：" + test);
		return usersMapper.selByUsers(users);

	}

	public UsersMapper getUsersMapper() {
		return usersMapper;
	}

	public void setUsersMapper(UsersMapper usersMapper) {
		this.usersMapper = usersMapper;
	}

	@Override
	public int insert(Users users) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insUsers(Users users) {
		// TODO Auto-generated method stub
		System.out.println("ASD");
		insert(users);
		System.out.println("ASD2");
		return 0;
	}

	@Override
	public int updUsers(Users users) {
		// TODO Auto-generated method stub
		insert(users);
		return 0;
	}

}
