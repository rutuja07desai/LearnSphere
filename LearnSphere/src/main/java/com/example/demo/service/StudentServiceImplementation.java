package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService {
	@Autowired
	StudentRepository strepo;
	@Override
	public String addUser(Student user) {
		// TODO Auto-generated method stub
		strepo.save(user);
		return "user is stored";
	}

}
