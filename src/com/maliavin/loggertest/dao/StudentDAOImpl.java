package com.maliavin.loggertest.dao;

import java.util.ArrayList;
import java.util.List;

import com.maliavin.loggertest.model.Student;
import com.maliavin.simplelogger.logger.Logger;
import com.maliavin.simplelogger.logger.Logger.Level;
import com.maliavin.simplelogger.logger.LoggerFactory;

/**
 * Student DAO implementation 
 * 
 * @author Dmitriy
 *
 */
public class StudentDAOImpl implements StudentDAO{
	
	private static Logger log = LoggerFactory.getLogger(StudentDAOImpl.class);

	@Override
	public void add(Student student) {
		String message = String.format("Student %s was added", student);
		log.log(Level.INFO, message);
	}

	@Override
	public void save(Student student) {
		String message = String.format("Student %s was updated", student);
		log.log(Level.INFO, message);
	}

	@Override
	public void remove(Student student) {
		String message = String.format("Student %s was removed", student);
		log.log(Level.INFO, message);
	}

	@Override
	public Student find(Integer id) {
		String message = String.format("Student was found by id %d", id);
		log.log(Level.INFO, message);
		return new Student();
	}

	@Override
	public List<Student> list() {
		log.log(Level.INFO, "Students list");
		return new ArrayList<>();
	}

}
