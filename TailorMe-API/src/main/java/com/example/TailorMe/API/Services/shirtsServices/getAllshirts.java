package com.example.TailorMe.API.Services.shirtsServices;

import com.example.TailorMe.API.Models.Client;
import com.example.TailorMe.API.Models.ShirtsMen;
import com.example.TailorMe.API.Repositories.Command;
import com.example.TailorMe.API.Repositories.shirtsMenRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class getAllshirts implements Command<Client, List<ShirtsMen>> {
    private final shirtsMenRepo shirtsRepo;

    public getAllshirts(shirtsMenRepo shirtsRepo) {
        this.shirtsRepo = shirtsRepo;
    }

    @Override
    public ResponseEntity<List<ShirtsMen>> execute(Client input) {

        return null;
    }
}
