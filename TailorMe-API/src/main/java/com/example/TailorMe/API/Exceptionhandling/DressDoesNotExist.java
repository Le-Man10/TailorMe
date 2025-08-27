package com.example.TailorMe.API.Exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DressDoesNotExist extends RuntimeException{
    public DressDoesNotExist(){
        super("Dress does not exist");
    }
}
