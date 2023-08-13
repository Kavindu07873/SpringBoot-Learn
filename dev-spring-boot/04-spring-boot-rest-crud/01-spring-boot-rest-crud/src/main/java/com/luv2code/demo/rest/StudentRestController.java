package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;
//    define @postConstruct to load the student data ... only once!

    @PostConstruct
    public void  loadData(){
        theStudents = new ArrayList<>();

        theStudents.add(new Student("kamal","nimala"));
        theStudents.add(new Student("kamwrgbal","nimalaewgv"));
        theStudents.add(new Student("wbrbkamal","nimrbbrala"));

    }



//    define endpoint for "/students" - return a list of student
    @GetMapping("/students")
    public List<Student> getStudent(){
        return theStudents;
    }
    @GetMapping("/students/{studentId}")
    public Student  getStudent(@PathVariable int studentId){


//        check the student id again list size
        if((studentId >= theStudents.size()) || (studentId < 0)  ){
            throw new StudentNotFoundException("Student id not found - "+ studentId);
        }

        return  theStudents.get(studentId);
    }

}
