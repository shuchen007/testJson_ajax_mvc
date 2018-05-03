package cn.sxt.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.sxt.dao.UserDao;
import cn.sxt.vo.User;
@Repository("userDao")
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{
	
	public UserDaoImpl() {
		System.out.println("dao input");
	}
	@Autowired
	  public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory)
	  {
	    super.setSqlSessionFactory(sqlSessionFactory);
	  }

	public List<User> getAll() {
		System.out.println("userdaoimpl");
		return this.getSqlSession().selectList("cn.sxt.vo.UserDao.getAll");
	}
//	public int add(User user){
//		return this.getSqlSession().insert("cn.sxt.vo.user.mapper.add", user);
//	}
//	public int remove(int id){
//		return this.getSqlSession().delete("cn.sxt.vo.user.mapper.remove", id);
//	}
}
