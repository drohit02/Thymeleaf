package com.thymeleaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.thymeleaf.entity.Student;
import com.thymeleaf.service.DataService;

@Controller
public class DataController {

	@Autowired
	DataService dtService;
	
	@GetMapping("/student/find/{id}")
	public String getStudent(@PathVariable int id,Model model) {
		List<Student> studData = dtService.getStudent(id);
		model.addAttribute("data",studData);
		return "student.html";
	}
	@GetMapping("/student/all")
	public String getAllStudent(Model model) {
		List<Student> allData = dtService.getAllStudent();
		model.addAttribute("mydata",allData);
		return "student.html";
	}
}
