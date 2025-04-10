package com.telran.prof.lessoons.lesson26;

public enum DonutType {

    GLAZED(1),
    FILLED(2),
    RING(3),
    CAKE(4),
    CLASSIC(5);

    private final int code;

    DonutType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static DonutType donutFromCode(int code) {
        for(DonutType donut : DonutType.values()) {
            if(donut.getCode() == code) {
                return donut;
            }
        }
        return null;
    }
}
