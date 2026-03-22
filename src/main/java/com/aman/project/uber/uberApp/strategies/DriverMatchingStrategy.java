package com.aman.project.uber.uberApp.strategies;

import com.aman.project.uber.uberApp.entities.Driver;
import com.aman.project.uber.uberApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
