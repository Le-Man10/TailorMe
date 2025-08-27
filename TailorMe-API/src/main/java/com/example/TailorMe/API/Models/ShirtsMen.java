package com.example.TailorMe.API.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import javax.annotation.processing.Generated;
import java.sql.Date;

@Entity
@Table(name = "shirtsMen")
public class ShirtsMen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @NotNull(message = "give a name to your shirt")
    @Column(name = "NameShirts")
    private String nameShirts;
    @Column(name = "shoulders")
    private int shoulders;
    @Column(name = "chest")
    private int chest;
    @Column(name = "shirtLength")
    private int shirtLength;
    @Column(name = "sleeveLength")
    private int sleeveLength;
    @Column(name = "aroundArm")
    private int aroundArm;
    @Column(name = "cuff")
    private int cuff;
    @NotNull
    @Column(name = "DOC",insertable = false,updatable = false)
    private Date dateOfCreation ;
    @NotNull
    private Date dueDate ;
    @ManyToOne
    @JoinColumn(name = "clientId",nullable = false,insertable = false,updatable = false)
    private Client client;
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNameShirts() {
        return nameShirts;
    }

    public void setNameShirts(String nameShirts) {
        this.nameShirts = nameShirts;
    }

    public int getShoulders() {
        return shoulders;
    }

    public void setShoulders(int shoulders) {
        this.shoulders = shoulders;
    }

    public int getChest() {
        return chest;
    }

    public void setChest(int chest) {
        this.chest = chest;
    }

    public int getShirtLength() {
        return shirtLength;
    }

    public void setShirtLength(int shirtLength) {
        this.shirtLength = shirtLength;
    }

    public int getSleeveLength() {
        return sleeveLength;
    }

    public void setSleeveLength(int sleeveLength) {
        this.sleeveLength = sleeveLength;
    }

    public int getAroundArm() {
        return aroundArm;
    }

    public void setAroundArm(int aroundArm) {
        this.aroundArm = aroundArm;
    }

    public int getCuff() {
        return cuff;
    }

    public void setCuff(int cuff) {
        this.cuff = cuff;
    }


}
