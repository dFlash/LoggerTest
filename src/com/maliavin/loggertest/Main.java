package com.maliavin.loggertest;

import java.util.ArrayList;
import java.util.List;

import com.maliavin.loggertest.model.Student;
import com.maliavin.loggertest.service.StudentService;
import com.maliavin.loggertest.service.StudentServiceImpl;
import com.maliavin.simplelogger.LoggerInitializer;
import com.maliavin.simplelogger.appender.Appender;
import com.maliavin.simplelogger.appender.ConsoleAppender;
import com.maliavin.simplelogger.appender.FileAppender;

public class Main {

	public static void main(String[] args) {
		Appender app = new ConsoleAppender();
		Appender app2 = new FileAppender("e:/test.log");
		List<Appender> a = new ArrayList<>();
		a.add(app2);a.add(app);
		LoggerInitializer.registerAppenders(a);
		
		StudentService studentService = new StudentServiceImpl();
		
		studentService.add(new Student());
	}

}
