package com.example.demo.bean;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="student")
public class student {
	@Id
	@Column(name="sid",nullable=false)
	private int id;
	@Column(name="stname")
	private String stname;
	
	@Column(name="stfname")
	private String stfname;
	
	@Column(name="number",nullable=false,unique=true)
	private String number;
	
	@Column(name="grade")
	private Character grade;
	@Enumerated(EnumType.STRING)
	//@Enumerated(EnumType.ORDINAL)
	private  admisiontype type;
//	@Temporal(TemporalType.DATE)
	//private Date joiningdate;
	private LocalDate joiningDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public admisiontype getType() {
		return type;
	}
	public void setType(admisiontype type) {
		this.type = type;
	}
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	public student() {

	}
	public int getSId() {
	 return id;
	}

	public void setsId(int sid) {
		this.id = sid;
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
		this.number = number ;
	}
	public Character getGrade() {
		return grade;
	}
	public void setGrade(Character grade) {
		this.grade = grade;
	}
}