package com.student.studentdetails.model;

public class Student {

	
	
	private String studentId;
	private String name;
	private int age;
	private int  salary;
	
	
	
	 public Student(String studentId,String name, int age, int salary)
	 { 
		 this.studentId= studentId; this.name = name; this.age = age; this.salary = salary; }
	 
	public Student() {
	}
	
		

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
