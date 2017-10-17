package system.wang.dao;

import system.wang.domain.User;

public interface UserDao {

	boolean addUser(User user);

	boolean findUser(String userName);
	
	User findUser(String userName, String password);

	void updateLastLoginTime(User user);

}