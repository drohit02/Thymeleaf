package com.thymeleaf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thymeleaf.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

	public List<Student> findByStudId(int id);
}
