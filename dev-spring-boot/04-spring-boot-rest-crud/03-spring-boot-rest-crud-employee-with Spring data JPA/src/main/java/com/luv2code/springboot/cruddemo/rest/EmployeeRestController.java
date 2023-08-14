package com.luv2code.springboot.cruddemo.rest;

import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;
// quick and dirty : inject employee service (use constructor injection )
    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

//  expose "/employees" and return a list of employees
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){

        Employee theEmployee = employeeService.findById(employeeId);
       if(theEmployee == null){
           throw new RuntimeException("Employee id Not Found : " + employeeId );
       }

       return theEmployee;
    }

    @PostMapping("/employees")
    public  Employee addEmployee(@RequestBody Employee theEmployee){

//        also just in case they pass id in JSON ... set id to 0
//        this is to force a save of new item ... instead  of update

        theEmployee.setId(0);

        Employee dbEmployee = employeeService.save(theEmployee);

        return  dbEmployee;


    }


//    add mapping for PUT /employees - update existing employee
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee){
        Employee dbEmployee = employeeService.save(theEmployee);
        return dbEmployee;
    }


    //add mapping for DELETE /employees/{employeeID} -delete employee
    @DeleteMapping("/employees/{employeeID}")
    public String deleteEmployee( @PathVariable int employeeID){
        Employee tempEmployee = employeeService.findById(employeeID);
        if(tempEmployee == null){
            throw  new RuntimeException("Employee id not Found" + employeeID);

        }
        employeeService.deleteById(employeeID);
        return  "Delete employee id  "+ employeeID;
    }


    }
