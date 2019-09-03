package com.beiming.consumer;

import com.beiming.consumer.domain.User;
import com.beiming.consumer.service.UserService;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConsumerApplication.class)
public class ConsumerApplicationTests {

	@Resource
	UserService userService;

	@Test
	public void contextLoads() {
		userService.addUser(new User(1,"j","gh"));
	}

}
