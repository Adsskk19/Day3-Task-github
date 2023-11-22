package com.junittestonstudent.github.JunitTestOnStudent.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junittestonstudent.github.JunitTestOnStudent.model.*;

@RestController
@RequestMapping("/users")
public class Controller {
	
	Map<String,Student> allUsers = new HashMap<>();
	 
	@GetMapping
	public Collection<Student> getMethod() {
		return allUsers.values();
	}
			
	@PostMapping
	public String postMethod(@RequestBody Student userdetails) {
		Student addValue = new Student();
		addValue.setUserId(userdetails.getUserId());
		addValue.setName(userdetails.getName());
		addValue.setAge(userdetails.getAge());
		addValue.setSalary(userdetails.getSalary());
		allUsers.put(userdetails.getUserId(), addValue);
		return "Student details added";
	}
	
	@PutMapping(path="/{userId}")
	public String putMethod(@PathVariable String userId,@RequestBody Student userdetails) {
		if(allUsers.containsKey(userId)){
			Student addValue = new Student();
			addValue.setUserId(userdetails.getUserId());
			addValue.setName(userdetails.getName());
			addValue.setAge(userdetails.getAge());
			addValue.setSalary(userdetails.getSalary());
			allUsers.put(userId, addValue);
			return "update added";
		}
		else {
			return "User Id Not found";	
		}
	}
	
	
	@DeleteMapping(path="/{userId}")
	public String deleteMethod(@PathVariable String userId) {
		if(allUsers.containsKey(userId)) {
			allUsers.remove(userId);
			return "User Deleted Successfully";
		}
		else {
			return"UserId not found";
		}
	}
	
}




