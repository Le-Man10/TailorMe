package com.example.TailorMe.API.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.sql.Date;

@Entity
@Table(name = "blouse")
public class Blouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @NotNull
    @Column(name = "blouseName")
    private int blouseName;
    @Column(name = "shoulders")
    private int shoulders;
    @Column(name = "bust")
    private int bust;
    @Column(name = "waist")
    private int waist;
    @Column(name = "bodice")
    private int bodice;
    @Column(name = "hip")
    private int hip;
    @Column(name = "aroundArm")
    private int aroundArm;
    @Column(name = "sleeve")
    private int sleeve;
    @NotNull
    @Column(name = "DOC",insertable = false,updatable = false)
    private Date dateOfCreation ;
    @NotNull
    private Date dueDate ;



    @ManyToOne
    @JoinColumn(name = "clientId",nullable = false,insertable = false,updatable = false)
    @Transient
    private Client client;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public int getBlouseName() {
        return blouseName;
    }

    public void setBlouseName(int blouseName) {
        this.blouseName = blouseName;
    }

    public int getShoulders() {
        return shoulders;
    }

    public void setShoulders(int shoulders) {
        this.shoulders = shoulders;
    }

    public int getBust() {
        return bust;
    }

    public void setBust(int bust) {
        this.bust = bust;
    }

    public int getWaist() {
        return waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    public int getBodice() {
        return bodice;
    }

    public void setBodice(int bodice) {
        this.bodice = bodice;
    }

    public int getHip() {
        return hip;
    }

    public void setHip(int hip) {
        this.hip = hip;
    }

    public int getAroundArm() {
        return aroundArm;
    }

    public void setAroundArm(int aroundArm) {
        this.aroundArm = aroundArm;
    }

    public int getSleeve() {
        return sleeve;
    }

    public void setSleeve(int sleeve) {
        this.sleeve = sleeve;
    }


}
