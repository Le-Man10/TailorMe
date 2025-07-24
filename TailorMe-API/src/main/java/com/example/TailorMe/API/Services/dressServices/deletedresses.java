package com.example.TailorMe.API.Services.dressServices;

import com.example.TailorMe.API.Exceptionhandling.NoDressesExistException;
import com.example.TailorMe.API.Repositories.Command;
import com.example.TailorMe.API.Repositories.dressRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class deletedresses {
    private final dressRepository dressReop;

    public deletedresses(dressRepository dressReop) {
        this.dressReop = dressReop;
    }
    public ResponseEntity<String> deletealldresses(){
        Boolean areThereAnyDresses = dressReop.findAll().isEmpty();
        if (!areThereAnyDresses){
            throw new NoDressesExistException();
        }
        dressReop.deleteAll();
        return ResponseEntity.ok().body("All dresses have been successfully deleted");
    }
}
