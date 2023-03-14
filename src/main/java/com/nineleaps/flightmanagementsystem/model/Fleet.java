package com.nineleaps.flightmanagementsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fleet")
public class Fleet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String model;
    private int totalEconomySeats;
    private int totalPremiumSeats;
    private int totalBusinessSeats;

    public Fleet() {
    }

    public Fleet(Long id, String code, String model, int totalEconomySeats, int totalPremiumSeats,
            int totalBusinessSeats) {
        this.id = id;
        this.code = code;
        this.model = model;
        this.totalEconomySeats = totalEconomySeats;
        this.totalPremiumSeats = totalPremiumSeats;
        this.totalBusinessSeats = totalBusinessSeats;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTotalEconomySeats() {
        return this.totalEconomySeats;
    }

    public void setTotalEconomySeats(int totalEconomySeats) {
        this.totalEconomySeats = totalEconomySeats;
    }

    public int getTotalPremiumSeats() {
        return this.totalPremiumSeats;
    }

    public void setTotalPremiumSeats(int totalPremiumSeats) {
        this.totalPremiumSeats = totalPremiumSeats;
    }

    public int getTotalBusinessSeats() {
        return this.totalBusinessSeats;
    }

    public void setTotalBusinessSeats(int totalBusinessSeats) {
        this.totalBusinessSeats = totalBusinessSeats;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", code='" + getCode() + "'" +
                ", model='" + getModel() + "'" +
                ", totalEconomySeats='" + getTotalEconomySeats() + "'" +
                ", totalPremiumSeats='" + getTotalPremiumSeats() + "'" +
                ", totalBusinessSeats='" + getTotalBusinessSeats() + "'" +
                "}";
    }

}
