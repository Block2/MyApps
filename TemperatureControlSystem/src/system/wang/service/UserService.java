package system.wang.service;

import system.wang.domain.User;
import system.wang.exception.UserExistException;

public interface UserService {

	boolean register(User user) throws UserExistException;

	User login(String username, String password);

}