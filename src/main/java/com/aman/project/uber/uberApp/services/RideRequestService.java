package com.aman.project.uber.uberApp.services;

import com.aman.project.uber.uberApp.entities.RideRequest;

public interface RideRequestService {

    RideRequest findRideRequestById(Long rideRequestId);

    void update(RideRequest rideRequest);
}
