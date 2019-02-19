package idv.cheng.service;

import idv.cheng.pojo.Users;

public interface UsersService {

	int insert(Users users);

	int insUsers(Users users);
	
	int updUsers(Users users);

	/**
	 * Description:Login
	 *
	 * @author chengmark Jan 23, 2019 4:28:30 PM
	 * @param users
	 * @return
	 */
	Users login(Users users);

}
