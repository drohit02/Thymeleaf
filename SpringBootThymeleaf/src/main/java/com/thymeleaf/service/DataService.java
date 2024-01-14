package com.thymeleaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thymeleaf.entity.Student;
import com.thymeleaf.repository.StudentRepository;

@Service
public class DataService {

	@Autowired
	StudentRepository studRepo;
	
	public List<Student> getStudent(int id) {
		List<Student> data = studRepo.findByStudId(id);
		return data;
	}
	
	public List<Student> getAllStudent(){
		List<Student> allData = studRepo.findAll();
		return allData;
	}
}

