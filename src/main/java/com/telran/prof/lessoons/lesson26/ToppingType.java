package com.telran.prof.lessoons.lesson26;

public enum ToppingType {

    CHOCOLATE(1),
    SPRINKLES(2),
    CARAMEL(3),
    STRAWBERRY(4);

    private final int code;

    public int getCode() {
        return code;
    }

    ToppingType(int code) {
        this.code = code;
    }

    public static ToppingType toppingFromCode(int code) {
        for(ToppingType topping : ToppingType.values()) {
            if (topping.getCode() == code) {
                return topping;
            }
        }

        return null;
    }
}
