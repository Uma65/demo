package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.College;
import com.example.demo.bean.DataDemo;
import com.example.demo.bean.Employee;
import com.example.demo.bean.Student;
import com.example.demo.service.DemoService;

@RestController
public class DemoController {
	// http://localhost:8081/getStudent?id=10&name=srinu
	// what is MVC
	// autowiring, db connection spring ,connection pool,data source,logging(log4j
	// theroy)

	@Autowired
	DemoService demoService;

	@GetMapping("getStudent")
	public Student getStudent(@RequestParam String name, @RequestParam int id) {
		Student student = new Student();
		student.setId(id);
		student.setName(name);
		return student;
	}

	@PostMapping("getStudentPost")
	public Student getStudentPost(@RequestBody Student student) {

		return student;
	}

	@GetMapping("getEmployee")
	public Employee getEmployee(@RequestParam Integer id) {
		
		return demoService.getEmployee(id);
	}
	
	@GetMapping("getCollege")
	public College getCollege(@RequestParam Integer id) {
		
		return demoService.getCollege(id);
	}
	@PostMapping("getData")
	public DataDemo getDataDemoPost(@RequestBody DataDemo details) {
		return details;
		
	}
}
