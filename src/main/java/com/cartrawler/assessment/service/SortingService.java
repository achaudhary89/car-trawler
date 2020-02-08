package com.cartrawler.assessment.service;

import com.cartrawler.assessment.car.CarResult;

import java.util.Set;

public interface SortingService {

    public Set<CarResult> sort(Set<CarResult> carResult);
}
