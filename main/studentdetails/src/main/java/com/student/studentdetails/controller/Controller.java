package com.student.studentdetails.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.student.studentdetails.model.*;

@RestController
@RequestMapping("/students")
public class Controller {

	Map<String, Student> allStudents = new HashMap<>();

	@GetMapping
	public Collection<Student> getMethod() {
		return allStudents.values();
	}

	@PostMapping
	public String postMethod(@RequestBody Student studentdetails) {
		Student addValue = new Student();
		addValue.setStudentId(studentdetails.getStudentId());
		addValue.setName(studentdetails.getName());
		addValue.setAge(studentdetails.getAge());
		addValue.setSalary(studentdetails.getSalary());
		allStudents.put(studentdetails.getStudentId(), addValue);
		return "Student details added";
	}

	
	/*
	 * @PutMapping(path="/{studentId}") public String putMethod(@PathVariable String
	 * userId,@RequestBody Student userdetails) {
	 * if(allStudents.containsKey(userId)){ Student addValue = new Student();
	 * addValue.setStudentId(userdetails.getStudentId());
	 * addValue.setName(userdetails.getName());
	 * addValue.setAge(userdetails.getAge());
	 * addValue.setSalary(userdetails.getSalary()); allStudents.put(studentId,
	 * addValue); return "Student details updated "; } else { return
	 * "Student details Not found"; } }
	 */
	 

	@DeleteMapping(path = "/{studentId}")
	public String deleteMethod(@PathVariable String userId) {
		if (allStudents.containsKey(userId)) {
			allStudents.remove(userId);
			return "Student details Deleted Successfully";
		} else {
			return "Student details not found";
		}
	}

}
