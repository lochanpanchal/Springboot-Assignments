package com.example.empadd.controller;

import com.example.empadd.model.Employee;
import com.example.empadd.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmpController {

    @Autowired
    EmpService empService;

//    GET /employees - get all employees
//    GET /employees/{id} - get an employee by id
//    POST /employees - create a new employee
//    PUT /employees/{id} - update an employee by id
//    DELETE /employees/{id} - delete an employee by id

    @GetMapping("employees")
    public List<Employee> getAllEmployees(){
        return empService.getAllEmplyees();
    }

    @GetMapping("employee/{id}")
    public Optional<Employee> getEmployeeById(@RequestParam Long id){
        return empService.getEmployeeById(id);
    }

    @PostMapping("employeeC")
    public String createEmployee(@RequestBody Employee employee){
         return empService.createEmployee(employee);
    }

    @PutMapping("employee/{id}/{empFirstName}")
    public String updateEmployeeById(@PathVariable Long id, @PathVariable String empFirstName){
        return empService.updateEmployeeById(id,empFirstName);
    }

    @DeleteMapping("employee/{id}")
    public String deleteEmployee(@PathVariable Long id)
    {
        return empService.deleteEmployee(id);
    }

}
