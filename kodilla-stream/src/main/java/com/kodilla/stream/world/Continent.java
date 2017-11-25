package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final Set<Country> setCountry = new HashSet<>();
    private final String addCountry;

    public Continent(final String addCountry) {
        this.addCountry = addCountry;
    }

    public void addCountry(Country country){
        setCountry.add(country);
    }

    public boolean removeSetCountry(Country country){
        return setCountry.remove(country);
    }

    public Set<Country> getSetCountry(){
        return new HashSet<>(setCountry);
    }

    public String getAddCountry(){
        return addCountry;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "setCountry=" + setCountry +
                ", addCountry='" + addCountry + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;

        Continent continent = (Continent) o;

        return getAddCountry().equals(continent.getAddCountry());
    }

}
