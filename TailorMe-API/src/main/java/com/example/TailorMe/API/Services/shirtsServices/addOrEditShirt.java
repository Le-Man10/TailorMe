package com.example.TailorMe.API.Services.shirtsServices;

import com.example.TailorMe.API.Models.ShirtsMen;
import com.example.TailorMe.API.Repositories.Command;
import com.example.TailorMe.API.Repositories.shirtsMenRepo;
import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class addOrEditShirt implements Command<ShirtsMen,ShirtsMen> {
    private final shirtsMenRepo shirtsRepo;

    public addOrEditShirt(shirtsMenRepo shirtsRepo) {
        this.shirtsRepo = shirtsRepo;
    }
    @Transactional
    @Override
    public ResponseEntity<ShirtsMen> execute(ShirtsMen input) {
        ShirtsMen shirt = shirtsRepo.save(input);
        return ResponseEntity.ok().body(shirt);
    }
}
