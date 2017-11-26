package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class World {
    private final String continent;
    private final Set<World> setWorld = new HashSet<>();

    public World(String continent) {
        this.continent = continent;
    }

    public void addContinent(World world){
        setWorld.add(world);
    }
    public boolean removeSetWorld(){
        return setWorld.remove(world);
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
