package org.spring.test.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration({ "classpath*:/beans.xml", "classpath*:/beans2.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class BeanJunitTest {
	@Autowired
	@Qualifier("mathTeacher")
	private Teacher mathTeacher;
	@Autowired
	@Qualifier("chTeacher")
	private Teacher chTeacher;
	@Autowired
	private SetBeanTest setBeanTest;

	@Test
	public void testTeacher() {
		mathTeacher.teach();
		chTeacher.teach();
	}

	@Test
	public void TestSet(){
		setBeanTest.print();
	}
}
