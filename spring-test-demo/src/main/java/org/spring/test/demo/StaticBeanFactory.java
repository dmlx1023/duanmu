package org.spring.test.demo;

public class StaticBeanFactory {
	private StaticBeanFactory(){
		
	}
	public static Student createStudent(){
		Student student=new FemaleStudent();
		return student;
	}
}
