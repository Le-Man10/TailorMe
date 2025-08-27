package com.example.TailorMe.API.Services.Blouse;

import com.example.TailorMe.API.Models.Blouse;
import com.example.TailorMe.API.Repositories.BlouseRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class newblouse {
    private final BlouseRepo Reop;

    public newblouse(BlouseRepo Reop) {
        this.Reop = Reop;
    }

    public ResponseEntity<Blouse> newDress(Blouse dress) {
        Blouse reqBlouse = Reop.save(dress);
        return ResponseEntity.ok().body(reqBlouse);
    }
}
