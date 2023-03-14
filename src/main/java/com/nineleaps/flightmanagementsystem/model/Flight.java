package com.nineleaps.flightmanagementsystem.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String departureLocation;
    private String arrivalLocation;
    private Date departureTime;
    private Date arrivalTime;

    private Fleet fleet;
    private FlightStatus status;

    public Flight() {
    }

    public Flight(Long id, String departureLocation, String arrivalLocation, Date departureTime, Date arrivalTime,
            Fleet fleet, FlightStatus status) {
        this.id = id;
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.fleet = fleet;
        this.status = status;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartureLocation() {
        return this.departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return this.arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public Date getDepartureTime() {
        return this.departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return this.arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Fleet getFleet() {
        return this.fleet;
    }

    public void setFleet(Fleet fleet) {
        this.fleet = fleet;
    }

    public FlightStatus getStatus() {
        return this.status;
    }

    public void setStatus(FlightStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", departureLocation='" + getDepartureLocation() + "'" +
                ", arrivalLocation='" + getArrivalLocation() + "'" +
                ", departureTime='" + getDepartureTime() + "'" +
                ", arrivalTime='" + getArrivalTime() + "'" +
                ", fleet='" + getFleet() + "'" +
                ", status='" + getStatus() + "'" +
                "}";
    }

}
