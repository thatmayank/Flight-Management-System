package com.nineleaps.flightmanagementsystem.service;

import com.nineleaps.flightmanagementsystem.model.Flight;
import com.nineleaps.flightmanagementsystem.model.User;
import com.nineleaps.flightmanagementsystem.model.Booking;
import com.nineleaps.flightmanagementsystem.model.Passenger;

import java.util.Date;
import java.util.HashSet;

public interface IUserService {

    public User addUser(User newUser);

    public User modifyUser(User updateUser, Long id);

    public User deleteUser(Long id);

    public HashSet<Flight> searchFlight(String source, String destination);

    public Flight viewSchedule(Long id);

    public Booking bookTicket(Passenger newPassenger, Flight newFlight);

    public Long purchaseTicket(Long id);

    public Long cancelTicket(Long id);

}
