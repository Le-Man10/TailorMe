package com.example.TailorMe.API.Services.dressServices;

import com.example.TailorMe.API.Exceptionhandling.DressDoesNotExist;
import com.example.TailorMe.API.Exceptionhandling.NoDressesExistException;
import com.example.TailorMe.API.Models.Dress;
import com.example.TailorMe.API.Repositories.dressRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class getDresses {
    private final dressRepository dressReop;

    public getDresses(dressRepository dressReop) {
        this.dressReop = dressReop;
    }

    public ResponseEntity<List<Dress>> getdresses(Long Id) {
        Boolean dressesavailable = dressReop.findAll().isEmpty();
        if(!dressesavailable){
            throw new NoDressesExistException();
        }
        List<Dress> reqDress = dressReop.findAll();
        return ResponseEntity.ok().body(reqDress);
    }
}
