package com.cartrawler.assessment.service;

import com.cartrawler.assessment.car.CarResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SortingServiceImplTest {

    @Test
    void checkForDuplicateTest() {
        Set set = new HashSet<CarResult>();
        set.add(new CarResult("Citroen Berlingo", "FLIZZR", "CMMV", 113.91d, CarResult.FuelPolicy.FULLFULL));
        set.add(new CarResult("Citroen Berlingo", "FLIZZR", "CMMV", 113.91d, CarResult.FuelPolicy.FULLFULL));
        SortingService service = new SortingServiceImpl();
        Set<CarResult> results = service.sort(set);
        Assertions.assertEquals(results.size(), 1);
    }

    @Test
    void sortCorporateCarTest(){
        Set set = new HashSet<CarResult>();
        CarResult carResult = new CarResult("Peugeot 107", "HERTZ", "MCMR", 67.98d, CarResult.FuelPolicy.FULLFULL);
        set.add(new CarResult("Citroen Berlingo", "FLIZZR", "CMMV", 113.91d, CarResult.FuelPolicy.FULLFULL));
        set.add(carResult);

        SortingService service = new SortingServiceImpl();
        Set<CarResult> results = service.sort(set);
        Assertions.assertEquals(carResult, results.iterator().next());
    }

    @Test
    void sortCorporateCarTest_negative(){
        Set set = new HashSet<CarResult>();
        CarResult carResult = new CarResult("Peugeot 107", "HERTZ", "MCMR", 67.98d, CarResult.FuelPolicy.FULLFULL);
        set.add(new CarResult("Citroen Berlingo", "FLIZZR", "CMMV", 113.91d, CarResult.FuelPolicy.FULLFULL));
        set.add(carResult);

        SortingService service = new SortingServiceImpl();
        Set<CarResult> results = service.sort(set);
        Iterator iterator = results.iterator();
        iterator.next();
        Assertions.assertNotEquals(carResult, iterator.next());
    }

    @Test
    void sortCorporateCarGroupSortingTest(){
        CarResult carResult = new CarResult("Peugeot 107", "HERTZ", "EDMR", 67.98d, CarResult.FuelPolicy.FULLFULL);
        CarResult carResult1 = new CarResult("Peugeot 107", "HERTZ", "MCMR", 67.98d, CarResult.FuelPolicy.FULLFULL);
        CarResult carResult2 = new CarResult("Peugeot 107", "HERTZ", "CDMR", 67.98d, CarResult.FuelPolicy.FULLFULL);
        CarResult carResult3 = new CarResult("Peugeot 107", "HERTZ", "other", 67.98d, CarResult.FuelPolicy.FULLFULL);
        Set set =   new LinkedHashSet();
        set.add(carResult1);
        set.add(carResult);
        set.add(carResult2);
        set.add(carResult3);
        SortingService service = new SortingServiceImpl();
        Set<CarResult> results = service.sort(set);
        Iterator iterator = results.iterator();
        Iterator iterator1 = set.iterator();
        while (iterator.hasNext()){
            Assertions.assertEquals(iterator.next(), iterator1.next());
        }
    }

    @Test
    void sortCorporateAndNonCorporateCarGroupSortingTest(){
        CarResult carResult = new CarResult("Peugeot 107", "HERTZ", "EDMR", 67.98d, CarResult.FuelPolicy.FULLFULL);
        CarResult carResult1 = new CarResult("Peugeot 107", "HERTZ", "MCMR", 67.98d, CarResult.FuelPolicy.FULLFULL);
        CarResult carResult2 = new CarResult("Peugeot 107", "HERTZ", "CDMR", 67.98d, CarResult.FuelPolicy.FULLFULL);
        CarResult carResult3 = new CarResult("Peugeot 107", "HERTZ", "other", 67.98d, CarResult.FuelPolicy.FULLFULL);
        CarResult carResult4 = new CarResult("Peugeot 107", "MARBESOL", "CDMR", 67.98d, CarResult.FuelPolicy.FULLFULL);
        CarResult carResult5 = new CarResult("Peugeot 107", "RHODIUM", "other", 67.98d, CarResult.FuelPolicy.FULLFULL);
        Set set =   new LinkedHashSet();
        set.add(carResult1);
        set.add(carResult);
        set.add(carResult2);
        set.add(carResult3);
        set.add(carResult4);
        set.add(carResult5);
        SortingService service = new SortingServiceImpl();
        Set<CarResult> results = service.sort(set);
        Iterator iterator = results.iterator();
        Iterator iterator1 = set.iterator();
        while (iterator.hasNext()){
            Assertions.assertEquals(iterator.next(), iterator1.next());
        }
    }

    @Test
    void sortPricingTest(){
        CarResult carResult = new CarResult("Peugeot 107", "HERTZ", "EDMR", 167.98d, CarResult.FuelPolicy.FULLFULL);
        CarResult carResult1 = new CarResult("Peugeo1t 107", "HERTZ", "EDMR", 607.98d, CarResult.FuelPolicy.FULLFULL);
        CarResult carResult2 = new CarResult("Peugeot2 107", "HERTZ", "EDMR", 61.98d, CarResult.FuelPolicy.FULLFULL);
        CarResult carResult3 = new CarResult("Peugeot3 107", "HERTZ", "EDMR", 67.98d, CarResult.FuelPolicy.FULLFULL);
        CarResult carResult4 = new CarResult("Peugeot4 107", "MARBESOL", "CDMR", 67.98d, CarResult.FuelPolicy.FULLFULL);
        CarResult carResult5 = new CarResult("Peugeot5 107", "RHODIUM", "CDMR", 167.98d, CarResult.FuelPolicy.FULLFULL);
        Set set =   new LinkedHashSet();
        set.add(carResult1);
        set.add(carResult);
        set.add(carResult2);
        set.add(carResult3);
        set.add(carResult4);
        set.add(carResult5);
        SortingService service = new SortingServiceImpl();
        Set<CarResult> results = service.sort(set);
        Iterator iterator = results.iterator();
        Iterator iterator1 = set.iterator();
        while (iterator.hasNext()){
            Assertions.assertNotEquals(iterator.next(), iterator1.next());
        }
    }



}