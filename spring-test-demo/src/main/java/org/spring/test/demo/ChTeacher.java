package org.spring.test.demo;

import org.springframework.beans.factory.annotation.Qualifier;

public class ChTeacher implements Teacher {
	@Qualifier("femaleStudent")
	private Student student;

	public void teach() {
		student.study();

	}

	public ChTeacher(Student student) {
		this.student = student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
