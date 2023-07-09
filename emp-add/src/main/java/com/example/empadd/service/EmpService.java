package com.example.empadd.service;

import com.example.empadd.model.Employee;
import com.example.empadd.repository.IEmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {
    @Autowired
    IEmpRepo iEmpRepo;

    public List<Employee> getAllEmplyees() {
        return iEmpRepo.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return iEmpRepo.findById(id);
    }

    public String createEmployee(Employee employee) {
        iEmpRepo.save(employee);
        return "Employee added";
    }


    public String updateEmployeeById(Long id, String empFirstName) {
        Optional<Employee> myEmployeeOpt = iEmpRepo.findById(id);
        Employee myEmployee = null;
        if(myEmployeeOpt.isPresent())
        {
            myEmployee = myEmployeeOpt.get();
        }
        else{
            return "Id not Found";
        }
        myEmployee.setEmpFirstName(empFirstName);
        iEmpRepo.save(myEmployee);
        return "Employee name is updated";
    }


    public String deleteEmployee(Long id) {
        iEmpRepo.deleteById(id);
        return "employee deleted from DB";
    }
}
