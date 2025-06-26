package com.example.TailorMe.API.Exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NoDressesExistException extends RuntimeException{
    public NoDressesExistException() {
        super("You do not have any dresses recorded");
    }
}
