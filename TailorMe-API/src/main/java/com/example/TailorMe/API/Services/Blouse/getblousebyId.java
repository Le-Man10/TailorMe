package com.example.TailorMe.API.Services.Blouse;

import com.example.TailorMe.API.Exceptionhandling.DressDoesNotExist;
import com.example.TailorMe.API.Models.Blouse;
import com.example.TailorMe.API.Repositories.BlouseRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class getblousebyId {
    private final BlouseRepo Reop;


    public getblousebyId(BlouseRepo Reop) {
        this.Reop = Reop;
    }

    public ResponseEntity<Blouse> getdressbyid(Long Id){
        Blouse reqblouse = Reop.findById(Id).orElseThrow(DressDoesNotExist::new);
        return ResponseEntity.ok().body(reqblouse);
    }
}
