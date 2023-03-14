package com.nineleaps.flightmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nineleaps.flightmanagementsystem.model.Flight;
import com.nineleaps.flightmanagementsystem.repository.FlightRepository;

@Service
public class AdminServiceImplementation implements IAdminService {

    @Autowired
    private FlightRepository flightRepository;

    @Override
    public Flight addFlightDetails(Flight newFlight) {
        return flightRepository.save(newFlight);
    }

    @Override
    public Flight updateFlightDetails(Flight updateFlight, Long id) {
        Flight res = flightRepository.findById(id).get();
        if (res != null) {
            res.setDepartureLocation(updateFlight.getDepartureLocation());
            res.setArrivalLocation(updateFlight.getArrivalLocation());
            res.setFleet(updateFlight.getFleet());
            res.setStatus(updateFlight.getStatus());
            res.setDepartureTime(updateFlight.getDepartureTime());
            res.setArrivalTime(updateFlight.getArrivalTime());
        }
        return flightRepository.save(res);
    }

}
