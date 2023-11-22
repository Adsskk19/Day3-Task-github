package com.student.studentdetails.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.student.studentdetails.model.Student;

public class StudentTest {
	@Test
	public void testStudentDetails() {
		Student student = new Student("1","Shiva",24,27000);
		assertEquals("1",student.getStudentId());
		assertEquals("Shiva",student.getName());
		assertEquals(24,student.getAge());
		assertEquals(27000,student.getSalary());		
	}
	

}
