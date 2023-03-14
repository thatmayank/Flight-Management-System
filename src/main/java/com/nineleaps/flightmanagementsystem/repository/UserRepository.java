package com.nineleaps.flightmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nineleaps.flightmanagementsystem.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
