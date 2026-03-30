package com.dezxxx.javaDesignPatterns.factory;

// RU: Enum хранит допустимые бренды гитар
// EN: Enum stores available guitar brands

public enum GuitarsBrand {
    IBANEZ("Ibanez"),
    GIBSON("Gibson"),
    LTD_BY_ESP("LTD by ESP");

    private final String brandName;

    GuitarsBrand(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }
}