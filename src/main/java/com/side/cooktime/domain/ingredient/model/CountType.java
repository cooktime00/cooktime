package com.side.cooktime.domain.ingredient.model;

public enum CountType {
    COUNT("COUNT"), LITER("LITER"), AMOUNT("AMOUNT");

    private String name;

    CountType(final String name) {
        this.name = name;
    }
}
