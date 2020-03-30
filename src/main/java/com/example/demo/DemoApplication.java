package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/*SpringBootApplication是一个组合注解，包含三个注解
@SpringBootConfignation()将该类声明为配置类,
@EnableAutoConfignation（自动配置spring boot认为我们会用到的组件）,
@ComponetScan（启动组件扫描，这样spring会通过扫描自动将@Service。@Controller注册为Spring上下文的组件）*/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
