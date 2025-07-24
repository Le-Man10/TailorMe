package com.example.TailorMe.API.Services.dressServices;

import com.example.TailorMe.API.Repositories.dressRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service

public class deleteDressybyId {
    private final dressRepository dressReop;

    public deleteDressybyId(dressRepository dressReop) {
        this.dressReop = dressReop;
    }

    public ResponseEntity<String> deletedressbyId(Long Id){
        dressReop.deleteById(Id);
        return ResponseEntity.ok().body("Dress deleted successfully");
    }
}
