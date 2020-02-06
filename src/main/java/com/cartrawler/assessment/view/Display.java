package com.cartrawler.assessment.view;

import com.cartrawler.assessment.car.CarResult;
import java.util.Set;

public class Display {
    public void render(Set<CarResult> cars) {
        for (CarResult car : cars) {
            System.out.println (car);
        }
    }
}
