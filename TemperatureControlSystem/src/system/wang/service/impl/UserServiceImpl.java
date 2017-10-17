package system.wang.service.impl;

import java.sql.Timestamp;

import system.wang.dao.UserDao;
import system.wang.dao.impl.UserDaoImpl;
import system.wang.domain.User;
import system.wang.exception.UserExistException;
import system.wang.service.UserService;
import system.wang.utils.Md5AndBase64AlgorithmUtil;

public class UserServiceImpl implements UserService {
	
	private UserDao dao = new UserDaoImpl();
	
	public boolean register(User user) throws UserExistException{
		//判断用户是否存在
		boolean isExist = dao.findUser(user.getUsername());
		if(isExist){
			throw new UserExistException();
		}
		user.setPassword(Md5AndBase64AlgorithmUtil.genEncryptMessage(user.getPassword()));
		Timestamp create_time = new Timestamp(System.currentTimeMillis());
		user.setCreate_time(create_time);
		return dao.addUser(user);
	}
	
	//处理上次登录时间的程序应在此之前调用，并将上次登陆时间放置在cookie缓存或者内存中。此处暂不做实现
	public User login(String username ,String password){
		String confirmPassword = Md5AndBase64AlgorithmUtil.genEncryptMessage(password);
		User user = dao.findUser(username,confirmPassword);
		if(null != user)
			updateLastLoginTime(user);
		return user;
	}
	
	private void updateLastLoginTime(User user){
		Timestamp last_login_time = new Timestamp(System.currentTimeMillis());
		user.setLast_login_time(last_login_time);
		dao.updateLastLoginTime(user);
	}

}
