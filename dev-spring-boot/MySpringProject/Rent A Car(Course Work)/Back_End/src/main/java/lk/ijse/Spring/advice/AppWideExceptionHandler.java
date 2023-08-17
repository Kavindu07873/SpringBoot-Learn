package lk.ijse.Spring.advice;

import lk.ijse.Spring.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@CrossOrigin
public class AppWideExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({RuntimeException.class})
    public ResponseUtil handleException(RuntimeException e){
        return new ResponseUtil("500",e.getMessage(),null);
    }

//
//    @ExceptionHandler
//    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc){
//
////    create a StudentErrorResponse
//        StudentErrorResponse errorResponse = new StudentErrorResponse();
//
//        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
//        errorResponse.setMessage(exc.getMessage());
//        errorResponse.setTimestamp(System.currentTimeMillis());
//// return ResponseEntity
//        return new  ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
//    }
//    // add another exception  handler  to catech any exception (Catch All)
//    @ExceptionHandler
//    public ResponseEntity<StudentErrorResponse> handleException(Exception excs){
//
////    create a StudentErrorResponse
//        StudentErrorResponse errorResponse = new StudentErrorResponse();
//
//        errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
//        errorResponse.setMessage(excs.getMessage());
//        errorResponse.setTimestamp(System.currentTimeMillis());
//
//
//// return ResponseEntity
//        return new  ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
//
//    }

}
