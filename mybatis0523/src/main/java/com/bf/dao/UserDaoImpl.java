package com.bf.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.bf.pojo.User;

public class UserDaoImpl implements UserDao {
	
	private SqlSessionFactory sqlSessionFactory;
	public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	@Override
	public User findUserById(Integer id) {
		SqlSession session = sqlSessionFactory.openSession();

		return session.selectOne("test.findUserById", id);
	}
	
	@Override
	public List<User> findUserByUserName(String username) {
		SqlSession session = sqlSessionFactory.openSession();
		return session.selectList("test.findUserByUserName", username);
	}

	@Override
	public int insertUser(User user) {
		SqlSession session = sqlSessionFactory.openSession();
		int insert = session.insert("test.insertUser", user);

		return insert;
	}


}
