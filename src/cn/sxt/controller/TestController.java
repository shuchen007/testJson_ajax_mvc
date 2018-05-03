package cn.sxt.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.sym.Name;

import cn.sxt.dao.UserDao;
import cn.sxt.service.UserService;
import cn.sxt.vo.User;

@Controller
public class TestController {
	public TestController() {
		System.out.println("controller input");
	}
	@RequestMapping("/ajax.do")
	public void ajax(HttpServletRequest req,String name1,HttpServletResponse resp) throws IOException{
		if("sunhao".equals(name1)){
		resp.getWriter().print("ajax data");
		}
		else{resp.getWriter().print("false");}
	}
	
	@RequestMapping("/json.do")
	@ResponseBody
	//灏嗕細鎶婅繑鍥炲� 杞崲涓簀son瀵硅薄
	public List<User> json(){
		List<User> list = new ArrayList<User>();
		list.add(new User(1,"zhansan","22"));
		list.add(new User(2,"wangwu","21"));
		list.add(new User(3,"zhaosi","33"));
		list.add(new User(4,"wangdana","14ds"));
		System.out.println("list="+list);
		return list;
	}
	@Resource(name = "userServiceImpl2")
	private UserService userService;
//	public void setUserService(UserService userService) {
//		this.userService = userService;
//	}
	@RequestMapping("/json2.do")
	@ResponseBody
	//灏嗕細鎶婅繑鍥炲� 杞崲涓簀son瀵硅薄
	public List<User> json2(){
		List<User>list = userService.getAll();
		System.out.println("list="+list);
//		mm.addAttribute("list", list);
		return list;
	}
}
