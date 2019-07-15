package com.bf.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bf.mapper.UserMapper;
import com.bf.pojo.User;
import com.bf.pojo.UserExample;
import com.bf.pojo.UserExample.Criteria;

public class UserMapperTest {
	private ApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
		String configLocation = "classpath:ApplicationContext.xml";
		applicationContext = new ClassPathXmlApplicationContext(configLocation);
	}
	
//	@Test
//	public void findUserById() {
//		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
//		User user = userMapper.findUserById(22);
//		System.out.println(user);
//	}
	
	@Test
	public void findUserById() {
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		User user = userMapper.selectByPrimaryKey(22);
		System.out.println(user);
	}
	
	@Test
	public void findUserByNameAndSex() {
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameLike("%王%");
		criteria.andSexEqualTo("1");
		List<User> list = userMapper.selectByExample(example);
		System.out.println(list);
	}
}
