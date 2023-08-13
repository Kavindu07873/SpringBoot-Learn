package com.luv2code.demo.advice;

import com.luv2code.demo.rest.StudentErrorResponse;
import com.luv2code.demo.rest.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {

    //    add an exception handler using @ExceptionHandler
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc){

//    create a StudentErrorResponse
        StudentErrorResponse errorResponse = new StudentErrorResponse();

        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorResponse.setMessage(exc.getMessage());
        errorResponse.setTimestamp(System.currentTimeMillis());
// return ResponseEntity
        return new  ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
    // add another exception  handler  to catech any exception (Catch All)
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception excs){

//    create a StudentErrorResponse
        StudentErrorResponse errorResponse = new StudentErrorResponse();

        errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        errorResponse.setMessage(excs.getMessage());
        errorResponse.setTimestamp(System.currentTimeMillis());


// return ResponseEntity
        return new  ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);

    }
}
