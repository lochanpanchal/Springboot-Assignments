package com.example.empadd.repository;

import com.example.empadd.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpRepo extends JpaRepository<Employee, Long> {

}
