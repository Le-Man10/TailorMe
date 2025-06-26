package com.example.TailorMe.API.Models;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "users")
public class LoginDTO {

    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\\\.[a-z]{2,3}",flags = Pattern.Flag.CASE_INSENSITIVE)
    @Column(name = "email",unique = true)
    private String email;
    @Nonnull()
    @Column(name = "password")
    private String password;

}
