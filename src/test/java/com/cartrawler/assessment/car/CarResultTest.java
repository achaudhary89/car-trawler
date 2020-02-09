package com.cartrawler.assessment.car;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class CarResultTest {

    @Test
    void testCarResultTest(){
        CarResult carResult = new CarResult("Volkswagen Polo", "FLIZZR", "EDMR", 56.51d, CarResult.FuelPolicy.FULLFULL);
        ObjectOutputStream out = null;
        CarResult carResult1 = null;

        try {
            FileOutputStream file = new FileOutputStream("test.txt");
            out = new ObjectOutputStream(file);
            out.writeObject(carResult);
            out.close();
            file.close();

            FileInputStream file1 = new FileInputStream("test.txt");
            ObjectInputStream in = new ObjectInputStream(file1);

            carResult1 = (CarResult) in.readObject();

            in.close();
            file.close();


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        Assertions.assertEquals(carResult.getSippCode(),carResult1.getSippCode());
        Assertions.assertEquals(carResult.getSupplierName(), carResult.getSupplierName());
        Assertions.assertEquals(carResult.getDescription(), carResult.getDescription());
    }

}