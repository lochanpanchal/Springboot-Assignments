package com.example.empadd.controller;

import com.example.empadd.model.Address;
import com.example.empadd.service.AddService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddController {

    @Autowired
    AddService addService;

//    GET /addresses - get all addresses
//    GET /addresses/{id} - get an address by id
//    POST /addresses - create a new address
//    PUT /addresses/{id} - update an address by id
//    DELETE /addresses/{id} - delete an address by id

    @GetMapping("Addresses")
    public List<Address> getAllAddresses(){
        return addService.getAllAddresses();
    }

    @GetMapping("Address/{id}")
    public Optional<Address> getAddressById(@PathVariable Long id){
        return addService.getAddressById(id);
    }

    @PostMapping("AddressesC")
    public String createAddress(@RequestBody Address address){
        return addService.createAddress(address);
    }

    @PutMapping("Addresses/{id}/{addCity}")
    public String updateAddress(@PathVariable Long id,@PathVariable String addCity ){
        return addService.updateAddress(id,addCity);
    }

    @DeleteMapping("Addresses/{id}")
    public String deleteAddress(@PathVariable Long id){
        return addService.deleteAddress(id);
    }

}
