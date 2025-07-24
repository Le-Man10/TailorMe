package com.example.TailorMe.API.Models;


import com.example.TailorMe.API.enumTypes.roles;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import org.hibernate.annotations.JdbcType;
import org.hibernate.dialect.PostgreSQLEnumJdbcType;

public class userDTO {

    private Long userId;

    private roles userRole;

    private String firstName;

    private String lastName;
    private String email;
    private String jwt;

    public userDTO(user loginUser,String jwtToken) {
        this.userId = loginUser.getUserId();
        this.userRole = loginUser.getUserRole();
        this.firstName = loginUser.getFirstName();
        this.lastName = loginUser.getLastName();
        this.email = loginUser.getEmail();
        this.jwt = jwtToken;
    }
}
