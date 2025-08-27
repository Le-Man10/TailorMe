package com.example.TailorMe.API.Services.shirtsServices;

import com.example.TailorMe.API.Exceptionhandling.shirtNotFoundException;
import com.example.TailorMe.API.Models.ShirtsMen;
import com.example.TailorMe.API.Repositories.Command;
import com.example.TailorMe.API.Repositories.shirtsMenRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class deleteShirt implements Command<Long,String> {
    private final shirtsMenRepo shirtsrepo;

    public deleteShirt(shirtsMenRepo shirtsrepo) {
        this.shirtsrepo = shirtsrepo;
    }

    @Override
    public ResponseEntity<String> execute(Long input) {
        if (shirtsrepo.existsById(input)){
            shirtsrepo.deleteById(input);
            return ResponseEntity.ok().body("successfully deleted");
        }
        throw new shirtNotFoundException();
    }
}
