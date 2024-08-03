package com.codingshuttle.project.uber.uberApp.strategies.impl;

import com.codingshuttle.project.uber.uberApp.dto.RideRequestDto;
import com.codingshuttle.project.uber.uberApp.strategies.RideFareCalculationStrategy;

public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFate(RideRequestDto rideRequestDto) {
        return 0;
    }
}
