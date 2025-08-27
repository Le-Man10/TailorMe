package com.example.TailorMe.API.Services.Blouse;

import com.example.TailorMe.API.Exceptionhandling.DressDoesNotExist;
import com.example.TailorMe.API.Models.Blouse;
import com.example.TailorMe.API.Repositories.BlouseRepo;
import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class editblouse {
    private final BlouseRepo Reop;

    public editblouse(BlouseRepo Reop) {
        this.Reop = Reop;
    }
    @Transactional
    public ResponseEntity<Blouse> editBlouse(Blouse edit){
        Blouse dressToBeEdited = Reop.findById(edit.getId()).orElseThrow(DressDoesNotExist::new);
        dressToBeEdited = edit;
        Reop.save(dressToBeEdited);
        return ResponseEntity.ok().body(dressToBeEdited);
    }
}
