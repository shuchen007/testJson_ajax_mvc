package cn.sxt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import cn.sxt.dao.UserDao;
import cn.sxt.service.UserService;
import cn.sxt.vo.User;
//@Component
public class UserServiceImpl implements UserService{
	public UserServiceImpl() {
		System.out.println("service001 input");
	}
	@Resource
	private UserDao userDao;
//	public void setUserDao(UserDao userDao) {
//		this.userDao = userDao;
//	}
	@Override
	public List<User> getAll() {
		System.out.println("userserviceimpl");
		User user = new User();
//		user.setName("pppp");
//		user.setAge(12);
//		userDao.add(user);
//		userDao.remove(40);
		return userDao.getAll();
	}
}
