package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)  //Runwith是JUnit的注解，SpringRunner是spring提更的一个测试运行器
@SpringBootTest  //告诉sprig启动测试时要添加spring boot的功能
class DemoApplicationTests {

	@Test  //这是一个测试方法
	void contextLoads() {
	}

}
