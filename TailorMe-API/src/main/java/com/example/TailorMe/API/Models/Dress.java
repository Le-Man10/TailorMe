package com.example.TailorMe.API.Models;
import jakarta.persistence.*;
@Entity
@Table(name = "dresses")
public class Dress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "")
    private Long id;
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
    @Column(name = "dressLength")
    private int dressLength;
    @Column(name = "sleeveLength")
    private int sleeveLength;
    @Column(name = "armCircumference")
    private int armCircumference;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getDressLength() {
        return dressLength;
    }

    public void setDressLength(int dressLength) {
        this.dressLength = dressLength;
    }

    public int getSleeveLength() {
        return sleeveLength;
    }

    public void setSleeveLength(int sleeveLength) {
        this.sleeveLength = sleeveLength;
    }

    public int getArmCircumference() {
        return armCircumference;
    }

    public void setArmCircumference(int armCircumference) {
        this.armCircumference = armCircumference;
    }
}
