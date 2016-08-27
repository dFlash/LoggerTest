package com.maliavin.loggertest.dao;

import java.util.List;

import com.maliavin.loggertest.model.Student;

/**
 * Student DAO interface 
 * 
 * @author Dmitriy
 *
 */
public interface StudentDAO {
	
	public void add(Student student);
	
	public void save(Student student);
	
	public void remove(Student student);
	
	public Student find(Integer id);
	
	public List<Student> list();

}
