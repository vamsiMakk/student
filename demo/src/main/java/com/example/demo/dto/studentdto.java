package com.example.demo.dto;

import java.time.LocalDate;

import com.example.demo.bean.admisiontype;

public class studentdto {

	private int id;
	private String stname;
	private String stfname;
	private String number;
	private LocalDate joiningDate;

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public admisiontype getType() {
		return type;
	}

	public void setType(admisiontype type) {
		this.type = type;
	}

	private admisiontype type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public String getStfname() {
		return stfname;
	}

	public void setStfname(String stfname) {
		this.stfname = stfname;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Character getGrade() {
		return grade;
	}

	public void setGrade(Character grade) {
		this.grade = grade;
	}

	private Character grade;

}
