package com.nineleaps.flightmanagementsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nineleaps.flightmanagementsystem.model.Flight;
import com.nineleaps.flightmanagementsystem.service.AdminServiceImplementation;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminServiceImplementation adminService;

    @GetMapping("/addflightdetails/{id}")
    public Flight addFlightDetails(@RequestBody Flight newFlight, @PathVariable("id") Long id) {
        return adminService.addFlightDetails(newFlight);
    }

    @GetMapping("/updateflightdetails/{id}")
    public Flight updateFlightDetails(@RequestBody Flight updateFlight, @PathVariable("id") Long id) {
        return adminService.updateFlightDetails(updateFlight, id);
    }

}
