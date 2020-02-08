package com.cartrawler.assessment.constants;

import java.util.EnumSet;

public enum CarSuppliersEnum {
    AVIS, BUDGET,ENTERPRISE,FIREFLY,HERTZ,SIXT,THRIFTY,CENTAURO, DELPASO,FLIZZR, GOLDCAR,MARBESOL, NIZA, RECORD, RHODIUM;
    public static final EnumSet<CarSuppliersEnum> CAR_SUPPLIERS_ENUMS   =   EnumSet.range(CarSuppliersEnum.AVIS, CarSuppliersEnum.THRIFTY);


}
