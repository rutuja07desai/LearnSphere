package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentServiceImplementation;

@Controller
public class UsersController {
	@Autowired
	StudentServiceImplementation sserv;
	@GetMapping("/map-register")
	public String register() {
		return "register";
	}
	@GetMapping("/map-login")
	public String login() {
		return "login";
	}
	@PostMapping("/register")
	public String addUser(@ModelAttribute Student student) {
		sserv.addUser(student);
		return  "registersuccess";
	}
}