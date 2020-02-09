package com.cartrawler.assessment.car;

import com.cartrawler.assessment.enums.CarGroupEnum;
import com.cartrawler.assessment.enums.CarSuppliersEnum;

import java.util.Objects;

public class CarResult {
    private final String description;
    private final String supplierName;
    private final String sippCode;
    private final double rentalCost;
    private final FuelPolicy fuelPolicy;
    private final  Boolean isCorporate;

	public enum FuelPolicy {
        FULLFULL,
        FULLEMPTY};
    
    public CarResult(String description, String supplierName, String sipp, double cost, FuelPolicy fuelPolicy) {
        this.description = description;
        this.supplierName = supplierName;
        this.sippCode = sipp;
        this.rentalCost = cost;
        this.fuelPolicy = fuelPolicy;
        this.isCorporate = CarSuppliersEnum.CAR_SUPPLIERS_ENUMS.contains(CarSuppliersEnum.valueOf(this.getSupplierName()));
    }
    
    public String getDescription() {
        return this.description;        
    }
    
    public String getSupplierName() {
        return this.supplierName;        
    }
    
    public String getSippCode() {
        return this.sippCode;        
    }
    
    public double getRentalCost() {
        return this.rentalCost;        
    }
    
    public FuelPolicy getFuelPolicy() {
        return this.fuelPolicy;
    }

    public Boolean isCorporate(){
        return this.isCorporate;
    }
    
    public String toString() {
        return this.supplierName + " : " +
            this.description + " : " +
            this.sippCode + " : " +
            this.rentalCost + " : " +
            this.fuelPolicy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarResult)) return false;
        CarResult carResult = (CarResult) o;
        return description.equals(carResult.description) &&
                supplierName.equals(carResult.supplierName) &&
                sippCode.equals(carResult.sippCode) &&
                fuelPolicy == carResult.fuelPolicy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, supplierName, sippCode, fuelPolicy);
    }

    public CarGroupEnum getCarGroupEnum() {
        return CarGroupEnum.valueOfByCharGroup(this.sippCode.charAt(0));
    }
}
