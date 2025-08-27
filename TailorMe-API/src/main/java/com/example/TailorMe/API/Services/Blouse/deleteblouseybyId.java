package com.example.TailorMe.API.Services.Blouse;

import com.example.TailorMe.API.Repositories.BlouseRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class deleteblouseybyId {
    private final BlouseRepo blouseReop;

    public deleteblouseybyId(BlouseRepo blouseReop) {
        this.blouseReop = blouseReop;
    }

    public ResponseEntity<String> deletedressbyId(Long Id){
        blouseReop.deleteById(Id);
        return ResponseEntity.ok().body("Dress deleted successfully");
    }
}
