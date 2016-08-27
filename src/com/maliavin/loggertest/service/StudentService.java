package com.maliavin.loggertest.service;

import java.util.List;

import com.maliavin.loggertest.model.Student;

/**
 * Student service interface 
 * 
 * @author Dmitriy
 *
 */
public interface StudentService {

	public void add(Student student);
	
	public void save(Student student);
	
	public void remove(Student student);
	
	public Student find(Integer id);
	
	public List<Student> list();
}
