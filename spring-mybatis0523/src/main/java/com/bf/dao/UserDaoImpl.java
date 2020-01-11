package com.bf.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.bf.pojo.User;
import org.springframework.transaction.annotation.Transactional;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
	
	@Override
	@Transactional
	public User findUserById(Integer id) {
		SqlSession session = this.getSqlSession();
		session.selectOne("test.findUserById", id);
		return session.selectOne("test.findUserById", id);
	}
	
	@Override
	public List<User> findUserByUserName(String username) {
		SqlSession session = this.getSqlSession();
		return session.selectList("test.findUserByUserName", username);
	}
	
}
