package com.jsp.Controler;


import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentController {

	public static void main(String[] args) {
		
		Student student=new Student();
		
		
		student.setId(500);
		
		
		student.setName("Pruth");
		
		
		student.setEmail("pruth@gmail.com");
		
		
		student.setGender("male");
		
		student.setCon(456789);
	
		StudentDao studentDao=new StudentDao();
		studentDao.saveStudent(student);
		
	}

}
