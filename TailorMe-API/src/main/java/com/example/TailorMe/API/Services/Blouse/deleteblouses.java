package com.example.TailorMe.API.Services.Blouse;

import com.example.TailorMe.API.Exceptionhandling.NoDressesExistException;
import com.example.TailorMe.API.Repositories.BlouseRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class deleteblouses {
    private final BlouseRepo Reop;

    public deleteblouses(BlouseRepo blouseRepo) {
        this.Reop = blouseRepo;
    }
    public ResponseEntity<String> deletealldresses(){
        boolean areThereAnyDresses = Reop.findAll().isEmpty();
        if (!areThereAnyDresses){
            throw new NoDressesExistException();
        }
        Reop.deleteAll();
        return ResponseEntity.ok().body("All dresses have been successfully deleted");
    }
}
