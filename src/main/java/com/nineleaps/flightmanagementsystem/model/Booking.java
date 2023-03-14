package com.nineleaps.flightmanagementsystem.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long bookingNumber;
    private Date bookingDate;
    private Date travelDate;
    private double totaCost;
    private Flight flightBooked;

    public Booking() {
    }

    public Booking(Long id, long bookingNumber, Date bookingDate, Date travelDate, double totaCost,
            Flight flightBooked) {
        this.id = id;
        this.bookingNumber = bookingNumber;
        this.bookingDate = bookingDate;
        this.travelDate = travelDate;
        this.totaCost = totaCost;
        this.flightBooked = flightBooked;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getBookingNumber() {
        return this.bookingNumber;
    }

    public void setBookingNumber(long bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public Date getBookingDate() {
        return this.bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Date getTravelDate() {
        return this.travelDate;
    }

    public void setTravelDate(Date travelDate) {
        this.travelDate = travelDate;
    }

    public double getTotaCost() {
        return this.totaCost;
    }

    public void setTotaCost(double totaCost) {
        this.totaCost = totaCost;
    }

    public Flight getFlightBooked() {
        return this.flightBooked;
    }

    public void setFlightBooked(Flight flightBooked) {
        this.flightBooked = flightBooked;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", bookingNumber='" + getBookingNumber() + "'" +
                ", bookingDate='" + getBookingDate() + "'" +
                ", travelDate='" + getTravelDate() + "'" +
                ", totaCost='" + getTotaCost() + "'" +
                ", flightBooked='" + getFlightBooked() + "'" +
                "}";
    }

}
