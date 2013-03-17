package hx.service.imp;

import hx.dao.imp.UserDaoImpl;
import hx.dto.UserDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("UserService01")
public class UserServiceImpl {
	
	
	private UserDaoImpl userDao;
	
	
	
	public void addUser(UserDto user){
		userDao.addUser(user);
	}
	
	

	public UserDaoImpl getUserDao() {
		return userDao;
	}
	
	@Autowired
	@Qualifier("UserDao01")
	public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}

}
