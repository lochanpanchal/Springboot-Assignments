package com.example.empadd.service;

import com.example.empadd.model.Address;
import com.example.empadd.repository.IAddRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddService {

    @Autowired
    IAddRepo iAddRepo;

    public List<Address> getAllAddresses() {
        return iAddRepo.findAll();
    }

    public Optional<Address> getAddressById(Long id) {
        return iAddRepo.findById(id);
    }

    public String createAddress(Address address) {
        iAddRepo.save(address);
        return "address created";
    }

    public String updateAddress(Long id, String addCity) {
        Optional<Address> myAddressOpt = iAddRepo.findById(id);
        Address myAddress = null;
        if(myAddressOpt.isPresent()){
            myAddress = myAddressOpt.get();
        }
        else{
            return "Id not found";
        }
        myAddress.setAddCity(addCity);
        iAddRepo.save(myAddress);
        return "city updated";
    }

    public String deleteAddress(Long id) {
        iAddRepo.deleteById(id);
        return "address deleted";
    }
}
