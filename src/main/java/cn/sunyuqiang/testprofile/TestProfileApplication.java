package cn.sunyuqiang.testprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"cn.sunyuqiang.*"})
public class TestProfileApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(TestProfileApplication.class, args);
		applicationContext.getEnvironment().setActiveProfiles("test");
	}

}
