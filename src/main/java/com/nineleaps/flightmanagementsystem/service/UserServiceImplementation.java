package com.nineleaps.flightmanagementsystem.service;

import com.nineleaps.flightmanagementsystem.model.Booking;
import com.nineleaps.flightmanagementsystem.model.Flight;
import com.nineleaps.flightmanagementsystem.model.Passenger;
import com.nineleaps.flightmanagementsystem.model.User;
import com.nineleaps.flightmanagementsystem.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nineleaps.flightmanagementsystem.repository.UserRepository;

import java.util.HashSet;

@Service
public class UserServiceImplementation implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FlightRepository flightRepository;

    @Override
    public User addUser(User newUser) {
        return userRepository.save(newUser);
    }

    @Override
    public User modifyUser(User updateUser, Long id) {
        User res = userRepository.findById(id).get();
        if (res != null) {
            res.setUserName(updateUser.getUserName());
            res.setPassoword(updateUser.getPassoword());
            res.setFirstName(updateUser.getFirstName());
            res.setLastName(updateUser.getLastName());
            res.setEmail(updateUser.getEmail());
            res.setContact(updateUser.getContact());
        }
        return userRepository.save(res);
    }

    @Override
    public User deleteUser(Long id) {
        userRepository.deleteById(id);
        return null;
    }

    @Override
    public HashSet<Flight> searchFlight(String source, String destination) {
        return flightRepository.findByDepartureLocationAndArrivalLocation(source, destination);
    }

    @Override
    public Flight viewSchedule(Long id) {
        return null;
    }

    @Override
    public Booking bookTicket(Passenger newPassenger, Flight newFlight) {
        return null;
    }

    @Override
    public Long purchaseTicket(Long id) {
        return null;
    }

    @Override
    public Long cancelTicket(Long id) {
        return null;
    }
}
