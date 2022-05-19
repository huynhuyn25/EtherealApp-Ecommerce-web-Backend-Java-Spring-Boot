package com.huynhuyn25.etherealapp.Model;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdress;
    @Column(name = "city")
    private String City;
    @Column(name = "district")
    private String District;
    @Column(name = "ward")
    private String Ward;
    @Column(name = "strest")
    private String Strest;
    @Column(name = "building")
    private String Building;
    @Column(name = "numberhome")
    private String numberHome;

    public Address() {
    }

    public Address( String city, String district, String ward, String strest, String building, String numberHome) {
        City = city;
        District = district;
        Ward = ward;
        Strest = strest;
        Building = building;
        this.numberHome = numberHome;
    }

    public Address(int idAdress, String city, String district, String ward, String strest, String building, String numberHome) {
        this.idAdress = idAdress;
        City = city;
        District = district;
        Ward = ward;
        Strest = strest;
        Building = building;
        this.numberHome = numberHome;
    }

    public int getIdAdress() {
        return idAdress;
    }

    public void setIdAdress(int idAdress) {
        this.idAdress = idAdress;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getWard() {
        return Ward;
    }

    public void setWard(String ward) {
        Ward = ward;
    }

    public String getStrest() {
        return Strest;
    }

    public void setStrest(String strest) {
        Strest = strest;
    }

    public String getBuilding() {
        return Building;
    }

    public void setBuilding(String building) {
        Building = building;
    }

    public String getNumberHome() {
        return numberHome;
    }

    public void setNumberHome(String numberHome) {
        this.numberHome = numberHome;
    }
}
