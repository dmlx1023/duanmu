package org.spring.test.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath*:*.xml");
//	ApplicationContext ctx2=new FileSystemXmlApplicationContext("");
//	App app=(App)ctx.getBean("app");
	App app=ctx.getBean("appName2",App.class);
	app.run();
	((ConfigurableApplicationContext)ctx).close();
}
}
