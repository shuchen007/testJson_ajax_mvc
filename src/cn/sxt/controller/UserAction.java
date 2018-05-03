package cn.sxt.controller;

import java.util.List;

import cn.sxt.service.UserService;
import cn.sxt.vo.User;

public class UserAction {
	private List<User> list;
	private UserService userService;
	
	public String list(){
		list = userService.getAll();
		return "success";
	}
	
	public List<User> getList() {
		return list;
	}
	public void setList(List<User> list) {
		this.list = list;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
