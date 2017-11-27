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
        europe.addCountry(new Country(new BigDecimal("100")));
        europe.addCountry(new Country(new BigDecimal("200")));
        world.addContinent(europe);
        Continent asia = new Continent();
        asia.addCountry(new Country(new BigDecimal("10")));
        asia.addCountry(new Country(new BigDecimal("20")));
        world.addContinent(asia);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("330"), result);




    }
}
