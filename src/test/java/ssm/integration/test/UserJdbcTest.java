package ssm.integration.test;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ssm.integration.entity.User;
import ssm.integration.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:ssm/integration/spring/spring-mybatis.xml","classpath:ssm/integration/spring/spring-service.xml"})
public class UserJdbcTest {

	@Autowired
	private UserService userSerivce;
	//@Autowired
	//private UserDao userDao;
	
	@Test
	public void addUser() {
		User user = new User();
		user.setSurname("Kong");
		user.setForename("Kevin");
		user.setGender("Female");
		user.setCountry("China");
		user.setBirthday(LocalDate.parse("1995-08-01"));
		
		userSerivce.add(user);
		System.out.println(user);
	}
	
	@Test
	public void selectById() {
		User user = userSerivce.selectById(1);
		System.out.println(user);
	}
	
	@Test
	public void updateUser() {
		User user = userSerivce.selectById(1);
		user.setBirthday(LocalDate.parse("1995-08-02"));
		
		userSerivce.update(user);
		System.out.println(user);
	}
	
	@Test
	public void deleteById() {
		System.out.println("Delete success " + userSerivce.deleteById(14));
	}
}
