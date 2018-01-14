package org.spring.test.demo;

import java.io.File;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class BeanFactoryTest {
public static void main(String[] args) {
	Resource is = new FileSystemResource(new File("src/main/resources/beans.xml"));
	XmlBeanFactory factory = new XmlBeanFactory(is);
	App app=factory.getBean("app",App.class);
	String[] aliases=factory.getAliases("app");
	ClassLoader  clzz=factory.getBeanClassLoader();
	System.out.println(clzz);
	for (String string : aliases) {
		System.out.println(string);
	}
	app.run();
}
}
