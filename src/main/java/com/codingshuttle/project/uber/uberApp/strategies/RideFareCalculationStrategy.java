package com.codingshuttle.project.uber.uberApp.strategies;

import com.codingshuttle.project.uber.uberApp.dto.RideRequestDto;

public interface RideFareCalculationStrategy {

    double calculateFate(RideRequestDto rideRequestDto);

}