package com.example.TailorMe.API.Services.dressServices;

import com.example.TailorMe.API.Exceptionhandling.DressDoesNotExist;
import com.example.TailorMe.API.Models.Dress;
import com.example.TailorMe.API.Repositories.dressRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class newDress {
    private final dressRepository dressReop;

    public newDress(dressRepository dressReop) {
        this.dressReop = dressReop;
    }

    public ResponseEntity<Dress> newDress(Dress dress) {
        Dress reqDress = dressReop.save(dress);
        return ResponseEntity.ok().body(reqDress);
    }
}
