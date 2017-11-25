package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class World {
    private final Set<Continent> setContinent = new HashSet<>();
    private final String continent;

    public World(String continent) {
        this.continent = continent;
    }

    public void addContinent(Continent continent){
        setContinent.add(continent);
    }
    public boolean removeSetContinent(){
        return setContinent.remove(continent);
    }

    public Set<Continent> getSetContinent(){
        return new HashSet<>(setContinent);
    }

    public String getContinent() {
        return continent;
    }

    @Override
    public String toString() {
        return "World{" +
                "setContinent=" + setContinent +
                ", continent='" + continent + '\'' +
                '}';
    }


}
