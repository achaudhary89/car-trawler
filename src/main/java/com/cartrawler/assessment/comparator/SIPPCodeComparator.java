
package com.cartrawler.assessment.comparator;

import com.cartrawler.assessment.car.CarResult;
import com.cartrawler.assessment.constants.CarGroupEnum;

import java.util.Comparator;

public class SIPPCodeComparator implements Comparator<CarResult> {

    public int compare(CarResult o1, CarResult o2) {

        if (!(CarGroupEnum.OTHER == (o1.getCarGroupEnum()))
                && !(CarGroupEnum.OTHER == (o2.getCarGroupEnum()))) {
            return o1.getSippCode().compareTo(o2.getSippCode());
        }

        if (CarGroupEnum.OTHER == (o1.getCarGroupEnum())
                && !(CarGroupEnum.OTHER == (o2.getCarGroupEnum()))) {
            return 1;
        }
        if (!(CarGroupEnum.OTHER == (o1.getCarGroupEnum()))
                && CarGroupEnum.OTHER == (o2.getCarGroupEnum())) {
            return -1;
        }

        return o1.getSippCode().compareTo(o2.getSippCode());

    }
}

