package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.StudentDTO;

@RestController
@RequestMapping(path="/git")
public class StudentController {

	@GetMapping(path="/students")
	public StudentDTO getStudents()
	{
		StudentDTO studentDto = new StudentDTO();
		studentDto.setId("844418");
		studentDto.setName("Renuka");
		studentDto.setCollege("SVEC");
		return studentDto;
	}
}
