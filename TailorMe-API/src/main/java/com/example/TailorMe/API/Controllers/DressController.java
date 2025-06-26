package com.example.TailorMe.API.Controllers;

import com.example.TailorMe.API.Models.Dress;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "tailorApi/v1/")
public class DressController {
    @GetMapping("getDresses")
    public ResponseEntity<List<Dress>> getAlldresses(){
        return null;
    }
    @GetMapping("getDressbyId/")
    public ResponseEntity<Dress> getdressbyId(@RequestParam(name = "id") Long id){
        return null;
    }
    @DeleteMapping("deleteDresses")
    public ResponseEntity<String> deletealldresses(){
        return null;
    }
    @DeleteMapping("deleteDressbyId/")
    public ResponseEntity<String> deletedressbyid(@RequestParam(name = "id") Long id){
        return null;
    }
    @PostMapping("newDress")
    public ResponseEntity<String> addNewDress(@RequestBody Dress newdress){
        return null;
    }
    @PutMapping("editDress/")
    public ResponseEntity<String> deletealldresses(@RequestParam(name = "id") Long id,@RequestBody Dress editDress){
        return null;
    }


}
