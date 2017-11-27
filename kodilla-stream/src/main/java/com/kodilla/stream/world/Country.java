package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final BigDecimal quamtity;

    public Country(BigDecimal quantity) {
        this.quamtity = quantity;
    }

    BigDecimal getPeopleQuantity(){
        return quamtity;
    }

}
