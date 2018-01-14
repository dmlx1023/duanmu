package org.spring.test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MathTeacher implements Teacher {
	@Autowired
	@Qualifier("maleStudent")
	private Student student;

	public void teach() {
		student.study();

	}
//	public void setStudent(Student student) {
//		this.student = student;
//	}
}
