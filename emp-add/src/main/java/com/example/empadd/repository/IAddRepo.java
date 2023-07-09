package com.example.empadd.repository;

import com.example.empadd.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddRepo extends JpaRepository<Address,Long> {
}
