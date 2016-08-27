package com.maliavin.loggertest.service;

import java.util.List;

import com.maliavin.loggertest.dao.StudentDAO;
import com.maliavin.loggertest.dao.StudentDAOImpl;
import com.maliavin.loggertest.model.Student;

/**
 * Student service implementation 
 * 
 * @author Dmitriy
 *
 */
public class StudentServiceImpl implements StudentService{
	
	private StudentDAO studentDAO = new StudentDAOImpl();

	@Override
	public void add(Student student) {
		studentDAO.add(student);
	}

	@Override
	public void save(Student student) {
		studentDAO.save(student);
	}

	@Override
	public void remove(Student student) {
		studentDAO.remove(student);
	}

	@Override
	public Student find(Integer id) {
		return studentDAO.find(id);
	}

	@Override
	public List<Student> list() {
		return studentDAO.list();
	}

}
