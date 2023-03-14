package com.nineleaps.flightmanagementsystem.service;

import com.nineleaps.flightmanagementsystem.model.Flight;

public interface IAdminService {

    public Flight addFlightDetails(Flight newFlight);

    public Flight updateFlightDetails(Flight updateFlight, Long id);
}
