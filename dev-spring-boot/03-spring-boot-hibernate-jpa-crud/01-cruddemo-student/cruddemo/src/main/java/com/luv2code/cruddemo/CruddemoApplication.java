package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
//			System.out.println("Hello World");
//			createStudent(studentDAO);
//			createMultipleStudent(studentDAO);
		readStudent(studentDAO);
		};
	}

	private void readStudent(StudentDAO studentDAO) {
//		create the student object
		System.out.println("Creating new Student object ..");
		Student tempStudent = new Student("Kamal","amra","Dil@gmail.com");

//		Save the student Object
		System.out.println("Save the student Object");
		studentDAO.save(tempStudent);

//		display id of the save student
		int theId = tempStudent.getId();
		System.out.println("display id of the save student   " + theId);

//		retrieve student based on the id: primary key
		Student myStudent = studentDAO.findById(theId);

//		display student
		System.out.println("Found the Student   "+myStudent);
	}

	private void createMultipleStudent(StudentDAO studentDAO) {

		//	create multiple student
		System.out.println("Creating 3 Student");
		Student temStudent1 = new Student("ka","jdiouw","a@gmail.com");
		Student temStudent2 = new Student("tbkhet4tascfqa","bejdiouwscad","asfcwq@gmail.com");
		Student temStudent3 = new Student("efqaka","jdiouw","abetbe@gmail.com");


		// save the student
		System.out.println("Saving 3 Student");
		studentDAO.save(temStudent1);
		studentDAO.save(temStudent2);
		studentDAO.save(temStudent3);


	}

	private void createStudent(StudentDAO studentDAO) {
//		create the student object
		System.out.println("Creating new Student object ..");
		Student tempStudent = new Student("Kamal","amra","Dil@gmail.com");

//		Save the student Object
		System.out.println("Save the student Object");
		studentDAO.save(tempStudent);

//		display id of the save student
		System.out.println("display id of the save student   " + tempStudent.getId());

	}


}
