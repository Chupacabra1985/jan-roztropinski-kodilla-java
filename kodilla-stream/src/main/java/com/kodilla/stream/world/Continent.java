package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final String continent;
    private final String country;
    private final Set<Continent> setCountry = new HashSet<>();

    public Continent(String continent, String country) {
        this.continent = continent;
        this.country = country;
    }

    public void addCountry(Continent country){
        setCountry.add(country);
    }
}
