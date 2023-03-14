package com.nineleaps.flightmanagementsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String addressLine;
    private long zipCode;
    private String city;
    private String state;
    private String country;
    private String mobileNo;

    public Contact() {
    }

    public Contact(Long id, String type, String addressLine, long zipCode, String city, String state, String country,
            String mobileNo) {
        this.id = id;
        this.type = type;
        this.addressLine = addressLine;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
        this.country = country;
        this.mobileNo = mobileNo;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddressLine() {
        return this.addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public long getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMobileNo() {
        return this.mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", type='" + getType() + "'" +
                ", addressLine='" + getAddressLine() + "'" +
                ", zipCode='" + getZipCode() + "'" +
                ", city='" + getCity() + "'" +
                ", state='" + getState() + "'" +
                ", country='" + getCountry() + "'" +
                ", mobileNo='" + getMobileNo() + "'" +
                "}";
    }

}
