package com.cartrawler.assessment.constants;

public enum CarGroupEnum {


    MINI('M'), ECONOMY('E'), COMPACT('C'), OTHER('O');

    private Character charGroup;

    private CarGroupEnum(Character charGroup) {
        this.charGroup = charGroup;
    }

    public char getCharGroup() {
        return charGroup;

    }

    public static CarGroupEnum valueOfByCharGroup(Character value) {
        for (CarGroupEnum cg : values()) {
            if (cg.charGroup.equals(value)) {
                return cg;
            }
        }

        return OTHER;
    }
}
