package com.lagou.springbootdatasourceaccess;

import com.lagou.pojo.User;
import com.lagou.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

//@RunWith(SpringRunner.class)
//@SpringBootTest
class SpringBootDatasourceAccessApplicationTests {

	/*@Autowired
	private DataSource dataSource;
	@Test
	void contextLoads() throws SQLException {
		Connection connection = dataSource.getConnection();
		System.out.println(connection);
	}

	@Autowired
	private UserService userService;

	@Test
	public void test1(){
		List<User> allUser = userService.findAllUser();
	}
*/

}
