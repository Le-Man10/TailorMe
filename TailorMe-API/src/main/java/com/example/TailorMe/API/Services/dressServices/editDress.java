package com.example.TailorMe.API.Services.dressServices;

import com.example.TailorMe.API.Exceptionhandling.DressDoesNotExist;
import com.example.TailorMe.API.Models.Dress;
import com.example.TailorMe.API.Repositories.dressRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class editDress {
    private final dressRepository dressReop;

    public editDress(dressRepository dressReop) {
        this.dressReop = dressReop;
    }

    public ResponseEntity<Dress> editDress(Dress editdress){
        Dress dressToBeEdited = dressReop.findById(editdress.getId()).orElseThrow(DressDoesNotExist::new);
        dressToBeEdited = editdress;
        dressReop.save(dressToBeEdited);
        return ResponseEntity.ok().body(dressToBeEdited);
    }
}
