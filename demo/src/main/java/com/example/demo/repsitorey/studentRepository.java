package com.example.demo.repsitorey;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.bean.student;

public interface studentRepository extends CrudRepository<student,Integer> {

}
