package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetpeopleQuantity(){
        //Given
        World world = new World();
        Continent europe = new Continent();
        europe.addCountry(new Country(new BigDecimal("1000000")));
        europe.addCountry(new Country(new BigDecimal("2000000")));
        europe.addCountry(new Country(new BigDecimal("3000000")));
        world.addContinent(europe);
        Continent asia = new Continent();
        asia.addCountry(new Country(new BigDecimal("150000000")));
        asia.addCountry(new Country(new BigDecimal("200000000")));
        asia.addCountry(new Country(new BigDecimal("500000000")));
        world.addContinent(asia);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("856000000"), result);

    }
}
