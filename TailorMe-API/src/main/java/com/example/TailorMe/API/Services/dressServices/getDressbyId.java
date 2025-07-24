package com.example.TailorMe.API.Services.dressServices;

import com.example.TailorMe.API.Exceptionhandling.DressDoesNotExist;
import com.example.TailorMe.API.Models.Dress;
import com.example.TailorMe.API.Repositories.dressRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class getDressbyId {
    private final dressRepository dressReop;


    public getDressbyId(dressRepository dressReop) {
        this.dressReop = dressReop;
    }

    public ResponseEntity<Dress> getdressbyid(Long Id){
        Dress reqDress = dressReop.findById(Id).orElseThrow(DressDoesNotExist::new);
        return ResponseEntity.ok().body(reqDress);
    }
}
