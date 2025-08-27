package com.example.TailorMe.API.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clientId;
    @NotNull(message = "Insert name of the client")
    private String name;
    @NotNull(message = "Insert client's phone number")
    private String phoneNumber;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "clientId")
    private List<ShirtsMen> shirtsMen;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "clientId")
    private List<Dress> dresses;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "clientId")
    private List<Blouse> blouses;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "clientId")
    private List<skirt> skirt;

}
