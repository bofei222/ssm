package mybatis0523;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.bf.dao.UserDao;
import com.bf.dao.UserDaoImpl;
import com.bf.pojo.User;

public class UserDaoTest {
	private SqlSessionFactory sqlSessionFactory;
	
	@Before
	public void setUp() throws IOException {
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	@Test
	public void testFindUserById() throws IOException {
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		User user = userDao.findUserById(22);
		System.out.println(user);
	}
	
	@Test
	public void testFindUserByUserName() throws IOException {
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		List<User> users = userDao.findUserByUserName("无量光");
		System.out.println(users);
	}
}
