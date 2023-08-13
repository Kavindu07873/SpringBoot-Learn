package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

//    define endpoint for "/students" - return a list of student
    @GetMapping("/students")
    public List<Student> getstudent(){

        List<Student> theStudents = new ArrayList<>();

        theStudents.add(new Student("kamal","nimala"));
        theStudents.add(new Student("kamwrgbal","nimalaewgv"));
        theStudents.add(new Student("wbrbkamal","nimrbbrala"));

        return theStudents;

    }
}
