package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.student;
import com.example.demo.dto.studentdto;
import com.example.demo.repsitorey.studentRepository;

@Service(value = "studentservice")
public class studentserviceimpl implements studentservice {
	@Autowired
	studentRepository repository;

	@Override
	public studentdto registerNewproduct(studentdto dto) {
		System.out.println("in service");

		student stu = new student();
		stu.setsId(dto.getId());
		stu.setStname(dto.getStname());
		stu.setStfname(dto.getStfname());
		stu.setNumber(dto.getNumber());
		stu.setGrade(dto.getGrade());
		stu.setJoiningDate(dto.getJoiningDate());
		stu.setType(dto.getType());

		repository.save(stu);

		return dto;
	}

}
