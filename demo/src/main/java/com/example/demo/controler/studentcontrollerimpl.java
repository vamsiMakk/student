package com.example.demo.controler;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.bean.admisiontype;
import com.example.demo.dto.studentdto;
import com.example.demo.service.studentservice;

@Controller(value = "studentcontroller")
public class studentcontrollerimpl implements studentcontroller {

	@Autowired
	studentservice service;

	@Override
	public void registerNewproduct() {
		System.out.println("is controller");
		studentdto dto = new studentdto();
		dto.setId(4);
		dto.setStname("VAMSIMAKKENA");
		dto.setStfname("ravanai");
		dto.setNumber("9346024791");
		dto.setGrade('x');
		dto.setJoiningDate(LocalDate.now());
		dto.setType(admisiontype.IIT);
		studentdto dtos = service.registerNewproduct(dto);
		System.out.println(dtos);

	}

}
