package com.nineleaps.flightmanagementsystem.repository;

import com.nineleaps.flightmanagementsystem.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    HashSet<Flight> findByDepartureLocationAndArrivalLocation(String source, String destination);
}
