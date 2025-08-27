package com.example.TailorMe.API.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.sql.Date;

@Entity
@Table(name = "skirt")
public class skirt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @NotNull(message = "enter name for your skirt")
    @Column(name = "skirtName")
    private int skirtName;
    @Column(name = "waist")
    private int waist;
    @Column(name = "hip")
    private int hip;
    @Column(name = "Length")
    private int Length;
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

    public int getSkirtName() {
        return skirtName;
    }

    public void setSkirtName(int skirtName) {
        this.skirtName = skirtName;
    }

    public int getWaist() {
        return waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    public int getHip() {
        return hip;
    }

    public void setHip(int hip) {
        this.hip = hip;
    }

    public int getLength() {
        return Length;
    }

    public void setLength(int length) {
        Length = length;
    }


}
