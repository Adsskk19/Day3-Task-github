package com.junittestonstudent.github.JunitTestOnStudent.model;

public class Student {
	
	private String userId;
	private String name;
	private int age;
	private int  salary;
	
	
	
	public Student(String userId,String name, int age, int salary) {
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public Student() {
		
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
