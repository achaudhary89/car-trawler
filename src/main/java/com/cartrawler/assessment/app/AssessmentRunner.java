package com.cartrawler.assessment.app;

import com.cartrawler.assessment.car.CarResult;
import com.cartrawler.assessment.view.Display;
import java.util.HashSet;
import java.util.Set;

public class AssessmentRunner {
    public static final Set<CarResult> CARS;;
    static {
        CARS = new HashSet<>();
        CARS.add(new CarResult("Volkswagen Polo", "NIZA", "EDMR", 12.81d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Ford C-Max Diesel", "NIZA", "CMMD", 22.04d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Renault Scenic Diesel", "NIZA", "JGAD", 93.67d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Up", "NIZA", "MDMR", 9.78d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Golf", "NIZA", "CDMR", 18.07d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Audi A3 Diesel", "NIZA", "CDMD", 41.16d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Touran Diesel", "NIZA", "IVMD", 55.47d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Mini Cooper", "NIZA", "EDMR", 16.75d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("BMW 2 Series Gran Tourer Diesel", "NIZA", "JVAD", 146.62d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Polo", "NIZA", "EDMR", 22.65d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Ford C-Max Diesel", "NIZA", "CMMD", 43.98d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Renault Scenic Diesel", "NIZA", "JGAD", 115.58d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Up", "NIZA", "MDMR", 18.6d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Golf", "NIZA", "CDMR", 33.06d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Audi A3 Diesel", "NIZA", "CDMD", 63.07d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Touran Diesel", "NIZA", "IVMD", 77.41d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Mini Cooper", "NIZA", "EDMR", 36.92d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Citroen Berlingo", "CENTAURO", "CMMV", 33.15d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Ford Focus Estate Diesel", "CENTAURO", "CWMD", 67.26d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Golf", "CENTAURO", "CDMR", 26.96d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Ford Fiesta Diesel", "CENTAURO", "EDMD", 25.02d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Nissan Juke Diesel", "CENTAURO", "HFMD", 34.32d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Golf Diesel", "CENTAURO", "CDMD", 40.91d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Ford C-Max Diesel", "CENTAURO", "CMMD", 69.2d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Touran", "CENTAURO", "IVAR", 99.8d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Polo", "CENTAURO", "EDMR", 11.08d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Ford Focus Estate", "CENTAURO", "CWMR", 59.12d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Ford Galaxy Diesel", "CENTAURO", "FVMD", 148.23d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Mercedes Vito Traveliner", "CENTAURO", "SVMR", 163.73d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Touran", "CENTAURO", "IVMR", 72.29d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Touran Diesel", "CENTAURO", "IVMD", 80.43d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Peugeot 107", "CENTAURO", "MCMR", 9.53d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Citroen Berlingo", "CENTAURO", "CMMV", 65.15d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Ford Focus Estate Diesel", "CENTAURO", "CWMD", 100.27d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Golf", "CENTAURO", "CDMR", 58.77d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Ford Fiesta Diesel", "CENTAURO", "EDMD", 56.77d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Nissan Juke Diesel", "CENTAURO", "HFMD", 66.35d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Golf Diesel", "CENTAURO", "CDMD", 73.14d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Ford C-Max Diesel", "CENTAURO", "CMMD", 102.27d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Touran", "CENTAURO", "IVAR", 133.79d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Polo", "CENTAURO", "EDMR", 42.41d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Ford Focus Estate", "CENTAURO", "CWMR", 91.89d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Ford Galaxy Diesel", "CENTAURO", "FVMD", 183.66d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Mercedes Vito Traveliner", "CENTAURO", "SVMR", 199.62d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Touran", "CENTAURO", "IVMR", 105.45d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Touran Diesel", "CENTAURO", "IVMD", 113.83d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Peugeot 107", "CENTAURO", "MCMR", 40.82d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Citroen Berlingo", "CENTAURO", "CMMV", 34.11d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Ford Focus Estate Diesel", "CENTAURO", "CWMD", 69.24d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Golf", "CENTAURO", "CDMR", 27.73d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Ford Fiesta Diesel", "CENTAURO", "EDMD", 25.74d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Nissan Juke Diesel", "CENTAURO", "HFMD", 35.31d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Golf Diesel", "CENTAURO", "CDMD", 42.1d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Ford C-Max Diesel", "CENTAURO", "CMMD", 71.23d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Touran", "CENTAURO", "IVAR", 102.75d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Polo", "CENTAURO", "EDMR", 11.38d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Ford Focus Estate", "CENTAURO", "CWMR", 60.86d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Ford Galaxy Diesel", "CENTAURO", "FVMD", 152.63d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Mercedes Vito Traveliner", "CENTAURO", "SVMR", 168.59d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Touran", "CENTAURO", "IVMR", 74.42d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Touran Diesel", "CENTAURO", "IVMD", 82.8d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Peugeot 107", "CENTAURO", "MCMR", 9.78d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Toyota Avensis", "GOLDCAR", "IDMR", 301.95d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Nissan Juke", "GOLDCAR", "CFMR", 146.54d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Golf", "GOLDCAR", "CLMR", 52.02d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Citroen C4 Grand Picasso", "GOLDCAR", "IVAR", 399.28d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Toyota Avensis", "GOLDCAR", "IDAR", 116.68d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Ford Focus Estate", "GOLDCAR", "CWMR", 126.08d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Touran", "GOLDCAR", "IVMR", 366.84d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Citroen DS3", "GOLDCAR", "ESMR", 63.69d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Audi A3", "GOLDCAR", "ICMR", 84.46d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Citroen Berlingo", "GOLDCAR", "CMMV", 53.89d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Polo", "GOLDCAR", "EDMR", 31.71d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Renault Scenic", "GOLDCAR", "JGMR", 139.95d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("BMW 3 Series", "GOLDCAR", "FDAR", 436.43d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Peugeot 107", "GOLDCAR", "MCMR", 26.86d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Mercedes Vito Traveliner", "GOLDCAR", "SVMR", 621.7d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Golf", "GOLDCAR", "CDMR", 39.79d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Toyota Avensis", "GOLDCAR", "IDMR", 243.55d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Nissan Juke", "GOLDCAR", "CFMR", 127.33d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Golf", "GOLDCAR", "CLMR", 54.13d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Citroen C4 Grand Picasso", "GOLDCAR", "IVAR", 326.7d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Toyota Avensis", "GOLDCAR", "IDAR", 97.31d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Ford Focus Estate", "GOLDCAR", "CWMR", 114.01d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Touran", "GOLDCAR", "IVMR", 303.43d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Citroen DS3", "GOLDCAR", "ESMR", 60d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Audi A3", "GOLDCAR", "ICMR", 74.04d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Citroen Berlingo", "GOLDCAR", "CMMV", 70.83d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Polo", "GOLDCAR", "EDMR", 44.99d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Renault Scenic", "GOLDCAR", "JGMR", 120.59d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("BMW 3 Series", "GOLDCAR", "FDAR", 353.17d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Peugeot 107", "GOLDCAR", "MCMR", 39.63d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Mercedes Vito Traveliner", "GOLDCAR", "SVMR", 509.37d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Golf", "GOLDCAR", "CDMR", 49.58d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("BMW 4 Series Convertible", "MARBESOL", "RTAV", 189.85d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Renault Megane Convertible", "MARBESOL", "CTMR", 59.22d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Citroen Berlingo", "MARBESOL", "CMMV", 10.53d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Ford Focus Estate", "MARBESOL", "CWMR", 16.11d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Passat Diesel", "MARBESOL", "IDMD", 38.15d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Renault Clio Estate", "MARBESOL", "EWMR", 10.93d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Mercedes Vito Traveliner", "MARBESOL", "SVMR", 108.04d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Polo", "MARBESOL", "EDMM", 4.8d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Ford Galaxy", "MARBESOL", "FVMR", 45.07d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("BMW 3 Series", "MARBESOL", "FDAR", 74.03d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Touran", "MARBESOL", "IVMR", 35.64d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Golf Diesel", "MARBESOL", "CDMD", 8.86d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Toyota Yaris", "MARBESOL", "EDAR", 16.86d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Up", "MARBESOL", "MDMR", 4d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Nissan Qashqai", "MARBESOL", "IFMR", 45.07d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Ford Fiesta Diesel", "MARBESOL", "EDMD", 5.11d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Toyota Avensis", "MARBESOL", "IDMR", 36.57d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Golf", "MARBESOL", "CDMR", 8.05d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Golf", "MARBESOL", "CDAR", 25.24d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Polo", "MARBESOL", "EDMR", 4.49d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Passat", "MARBESOL", "SDAR", 44.14d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("BMW 3 Series", "MARBESOL", "FDMR", 47.55d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Mercedes Citan", "MARBESOL", "CMMD", 10.53d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("BMW 4 Series Convertible", "MARBESOL", "RTAV", 189.85d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Renault Megane Convertible", "MARBESOL", "CTMR", 59.22d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Citroen Berlingo", "MARBESOL", "CMMV", 10.53d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Ford Focus Estate", "MARBESOL", "CWMR", 16.11d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Passat Diesel", "MARBESOL", "IDMD", 38.15d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Renault Clio Estate", "MARBESOL", "EWMR", 10.93d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Mercedes Vito Traveliner", "MARBESOL", "SVMR", 108.04d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Polo", "MARBESOL", "EDMM", 4.8d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Ford Galaxy", "MARBESOL", "FVMR", 45.07d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("BMW 3 Series", "MARBESOL", "FDAR", 74.03d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Touran", "MARBESOL", "IVMR", 35.64d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Golf Diesel", "MARBESOL", "CDMD", 8.86d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Toyota Yaris", "MARBESOL", "EDAR", 16.86d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Up", "MARBESOL", "MDMR", 4d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Nissan Qashqai", "MARBESOL", "IFMR", 45.07d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Ford Fiesta Diesel", "MARBESOL", "EDMD", 5.11d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Toyota Avensis", "MARBESOL", "IDMR", 36.57d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Golf", "MARBESOL", "CDMR", 8.05d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Golf", "MARBESOL", "CDAR", 25.24d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Polo", "MARBESOL", "EDMR", 4.49d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Passat", "MARBESOL", "SDAR", 44.14d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("BMW 3 Series", "MARBESOL", "FDMR", 47.55d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Mercedes Citan", "MARBESOL", "CMMD", 10.53d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("BMW 4 Series Convertible", "MARBESOL", "RTAV", 516.52d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Renault Megane Convertible", "MARBESOL", "CTMR", 204.47d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Citroen Berlingo", "MARBESOL", "CMMV", 78.06d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Ford Focus Estate", "MARBESOL", "CWMR", 85.54d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Passat Diesel", "MARBESOL", "IDMD", 98.2d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Renault Clio Estate", "MARBESOL", "EWMR", 82.37d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Mercedes Vito Traveliner", "MARBESOL", "SVMR", 231.59d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Polo", "MARBESOL", "EDMM", 70.89d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Ford Galaxy", "MARBESOL", "FVMR", 213.53d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("BMW 3 Series", "MARBESOL", "FDAR", 199.93d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Touran", "MARBESOL", "IVMR", 168.28d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Passat Diesel", "MARBESOL", "IDAD", 127.59d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Golf Diesel", "MARBESOL", "CDMD", 76.94d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Toyota Yaris", "MARBESOL", "EDAR", 91.44d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Renault Scenic", "MARBESOL", "JGMR", 86.44d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Up", "MARBESOL", "MDMR", 69.93d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Nissan Qashqai", "MARBESOL", "IFMR", 88.27d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Ford Fiesta Diesel", "MARBESOL", "EDMD", 73.78d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Toyota Avensis", "MARBESOL", "IDMR", 95.47d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Golf", "MARBESOL", "CDMR", 75.14d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Golf", "MARBESOL", "CDAR", 109.5d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Polo", "MARBESOL", "EDMR", 70.89d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Citroen C4 Cactus", "MARBESOL", "CGAR", 114.03d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Passat", "MARBESOL", "SDAR", 123.09d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("BMW 3 Series", "MARBESOL", "FDMR", 195.43d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("BMW 1 Series", "MARBESOL", "IDAR", 172.81d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Mercedes Citan", "MARBESOL", "CMMD", 78.06d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Citroen Berlingo", "RECORD", "CMMV", 33.26d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Golf", "RECORD", "CDMR", 26.52d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Nissan Juke", "RECORD", "CFMR", 28.64d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Toyota Rav4", "RECORD", "IFMR", 36.3d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Ford Galaxy", "RECORD", "FVMR", 154.59d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Polo", "RECORD", "EDMR", 22.23d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Peugeot 107", "RECORD", "MCMR", 19.1d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Citroen Berlingo", "RECORD", "CMMV", 34.8d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Ford Galaxy", "RECORD", "FVAR", 160.75d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Audi A3", "SIXT", "ICMR", 186.37d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("BMW 2 Series Active Tourer", "SIXT", "JDAR", 239.18d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Ford Focus Estate", "SIXT", "CWMR", 222.56d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Polo", "SIXT", "EDMR", 128.93d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Mercedes A Class", "SIXT", "ICAV", 254.02d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Peugeot 107", "SIXT", "MCMR", 97.08d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("BMW 2 Series Active Tourer", "SIXT", "JDMR", 183.14d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Smart Fortwo", "SIXT", "MUMR", 115.76d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Golf", "SIXT", "CDMR", 134.45d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Opel Corsa", "SIXT", "ECMN", 107.58d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Mini Convertible", "SIXT", "NTMR", 248.85d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Citroen C4 Cactus", "SIXT", "CGAR", 191.54d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Mercedes E Class", "SIXT", "PDAR", 403.22d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Toyota Rav4", "SIXT", "IFAR", 328.62d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Mercedes E Class", "SIXT", "PDMR", 325.38d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Toyota Rav4", "SIXT", "IFMR", 276.73d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Passat Estate", "SIXT", "SWMR", 292.78d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Ford Galaxy", "SIXT", "FVMR", 692.45d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("BMW 3 Series", "SIXT", "FDMR", 225.18d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("BMW 3 Series", "SIXT", "FDAR", 295.22d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Renault Scenic", "SIXT", "JGMR", 245.09d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Toyota Avensis", "AVIS", "IDMR", 373.69d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Opel Astra", "AVIS", "CCMR", 203.32d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Touran Diesel", "AVIS", "IVAD", 520.49d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Mercedes E Class", "AVIS", "PDAR", 948.24d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Mercedes E Class", "AVIS", "PDAR", 790.36d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Touran Diesel", "AVIS", "IVMD", 495.74d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Skoda Octavia Diesel", "AVIS", "IDMD", 310.22d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Ford Focus Estate", "AVIS", "CWMR", 291.28d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Mercedes Viano", "AVIS", "OVAR", 572.44d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Ford Galaxy Diesel", "AVIS", "FVMD", 520.49d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Peugeot 107", "AVIS", "MCMR", 145.52d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Toyota Avensis", "AVIS", "IDAR", 465.34d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Polo", "AVIS", "EDMR", 160.73d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Mercedes Vito Traveliner", "AVIS", "SVMR", 624.38d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Mercedes A Class", "AVIS", "ICAV", 310.56d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Golf Diesel", "AVIS", "CDMD", 258.69d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Toyota Avensis", "AVIS", "IDMR", 373.69d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Opel Astra", "AVIS", "CCMR", 203.32d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Touran Diesel", "AVIS", "IVAD", 520.49d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Mercedes E Class", "AVIS", "PDAR", 948.24d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Mercedes E Class", "AVIS", "PDAR", 790.36d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Touran Diesel", "AVIS", "IVMD", 495.74d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Skoda Octavia Diesel", "AVIS", "IDMD", 310.22d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Ford Focus Estate", "AVIS", "CWMR", 291.28d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Mercedes Viano", "AVIS", "OVAR", 572.44d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Ford Galaxy Diesel", "AVIS", "FVMD", 520.49d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Peugeot 107", "AVIS", "MCMR", 145.52d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Toyota Avensis", "AVIS", "IDAR", 465.34d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Polo", "AVIS", "EDMR", 160.73d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Mercedes Vito Traveliner", "AVIS", "SVMR", 624.38d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Mercedes A Class", "AVIS", "ICAV", 310.56d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Golf Diesel", "AVIS", "CDMD", 258.69d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Toyota Avensis", "BUDGET", "IDMR", 211.89d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Opel Astra", "BUDGET", "CCMR", 177.15d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Golf", "BUDGET", "CDMR", 268.97d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Toyota Avensis", "BUDGET", "IDMR", 234.91d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Opel Astra", "BUDGET", "CCMR", 196.21d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Golf", "BUDGET", "CDMR", 298.48d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Toyota Avensis", "BUDGET", "IDMR", 211.89d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Opel Astra", "BUDGET", "CCMR", 177.15d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Golf", "BUDGET", "CDMR", 268.97d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Toyota Avensis", "BUDGET", "IDMR", 211.89d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Opel Astra", "BUDGET", "CCMR", 177.15d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Golf", "BUDGET", "CDMR", 268.97d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Toyota Avensis", "BUDGET", "IDMR", 211.89d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Opel Astra", "BUDGET", "CCMR", 177.15d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Golf", "BUDGET", "CDMR", 268.97d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Ford Focus Estate", "DELPASO", "CWMR", 31.35d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Up", "DELPASO", "MDMR", 5.92d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Golf", "DELPASO", "CDMR", 11.49d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Toyota Rav4", "DELPASO", "IFMR", 41.16d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Polo", "DELPASO", "EDMR", 6.23d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Mercedes Vito Traveliner", "DELPASO", "SVMR", 121.26d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Peugeot 107", "DELPASO", "MCMR", 5.92d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Peugeot 107", "THRIFTY", "MCMR", 67.03d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Peugeot 107", "THRIFTY", "MCMR", 67.03d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Renault Clio Estate", "FIREFLY", "EWMR", 45.16d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Peugeot 107", "FIREFLY", "MCMR", 26.57d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Polo", "FIREFLY", "EDMR", 29.79d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Citroen Berlingo", "FIREFLY", "CMMV", 35.67d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Touran", "FIREFLY", "IVMR", 125.92d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Golf", "FIREFLY", "CDMR", 33.84d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Peugeot 107", "HERTZ", "MCMR", 67.98d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Peugeot 107", "HERTZ", "MCMR", 60.34d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Peugeot 107", "ENTERPRISE", "MCMR", 78.1d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Passat", "ENTERPRISE", "SDMR", 206.5d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Polo", "ENTERPRISE", "EDMR", 105.51d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Ford Galaxy", "ENTERPRISE", "FVMR", 512.95d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Touran", "ENTERPRISE", "IVAR", 392.35d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Citroen Berlingo", "ENTERPRISE", "CMMV", 212.23d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Toyota Avensis", "ENTERPRISE", "IDMR", 124.84d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Golf", "ENTERPRISE", "CDAR", 516.28d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Renault Scenic", "ENTERPRISE", "JGMR", 268.42d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Toyota Avensis", "ENTERPRISE", "IDAR", 413.05d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Mercedes Vito Traveliner", "ENTERPRISE", "SVMR", 579.11d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Renault Scenic", "ENTERPRISE", "IMMR", 224.74d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Golf", "ENTERPRISE", "CDMR", 142.05d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Renault Scenic", "RHODIUM", "JGMR", 180.47d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("BMW 3 Series", "RHODIUM", "FDAR", 409.68d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Ford Focus Estate", "RHODIUM", "CWMR", 177.09d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Citroen DS3", "RHODIUM", "ESMR", 116.51d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Golf", "RHODIUM", "CDAR", 243.55d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Golf", "RHODIUM", "CDMR", 104.53d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Toyota Avensis", "RHODIUM", "IDMR", 300.05d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Audi A3", "RHODIUM", "ICMR", 130.54d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Citroen Berlingo", "RHODIUM", "CMMV", 114.01d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Polo", "RHODIUM", "EDMR", 92.9d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Ford Galaxy", "RHODIUM", "FVMR", 509.37d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Golf", "RHODIUM", "CLMR", 109.76d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Touran", "RHODIUM", "IVMR", 359.93d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Peugeot 107", "RHODIUM", "MCMR", 87.36d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Touran", "RHODIUM", "IVAR", 383.03d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Mercedes Vito Traveliner", "RHODIUM", "SVMR", 565.88d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Toyota Avensis", "RHODIUM", "IDAR", 153.82d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Toyota Rav4", "FLIZZR", "IFMR", 75.93d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Opel Corsa", "FLIZZR", "EBMN", 49.29d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Peugeot 2008", "FLIZZR", "EGMR", 78.43d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Citroen C3 Picasso", "FLIZZR", "EMMV", 75.93d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Golf", "FLIZZR", "CDMR", 87.91d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Volkswagen Polo", "FLIZZR", "EDMR", 49.29d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Citroen DS3", "FLIZZR", "ESMR", 53.56d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Citroen C1", "FLIZZR", "MBMR", 42.54d, CarResult.FuelPolicy.FULLEMPTY));
        CARS.add(new CarResult("Toyota Rav4", "FLIZZR", "IFMR", 87.73d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Opel Corsa", "FLIZZR", "EBMN", 56.51d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Peugeot 2008", "FLIZZR", "EGMR", 90.23d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Citroen C3 Picasso", "FLIZZR", "EMMV", 87.73d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Golf", "FLIZZR", "CDMR", 101.62d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Polo", "FLIZZR", "EDMR", 56.51d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Citroen Berlingo", "FLIZZR", "CMMV", 113.91d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Citroen DS3", "FLIZZR", "ESMR", 61.44d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Volkswagen Touran", "FLIZZR", "IVMR", 159.66d, CarResult.FuelPolicy.FULLFULL));
        CARS.add(new CarResult("Citroen C1", "FLIZZR", "MBMR", 49.08d, CarResult.FuelPolicy.FULLFULL));
    }

    public static void main(String[] args) {
        Display display = new Display();
        display.render(CARS);
    }        
}