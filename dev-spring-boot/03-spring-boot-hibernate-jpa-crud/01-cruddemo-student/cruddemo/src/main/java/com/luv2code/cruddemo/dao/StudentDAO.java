package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String theLastName);

//    List<Student> findByLastName(String amra);

    void update (Student theStudent);

    void delete(Integer id);

    int deleteAll();
}
