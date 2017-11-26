package com.kodilla.stream.world;
import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final Country country;
    private final String addCountry;
    private final Set<Continent> setContinent = new HashSet<>();


    public Continent(final Country country,final String addCountry) {
        this.country = country;
        this.addCountry = addCountry;
    }

    public void addCountry(Continent continent) {
        setContinent.add(continent);
    }

    public boolean removeSetContinent(Continent continent) {
        return setContinent.remove(continent);
    }

    public String getAddCountry() {
        return addCountry;
    }

    public Set<Continent> getSetContinent() {
        return setContinent;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "addCountry='" + addCountry + '\'' +
                ", setContinent=" + setContinent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;

        Continent continent = (Continent) o;

        return getAddCountry().equals(continent.getAddCountry());
    }

    @Override
    public int hashCode() {
        return getAddCountry().hashCode();
    }
}


