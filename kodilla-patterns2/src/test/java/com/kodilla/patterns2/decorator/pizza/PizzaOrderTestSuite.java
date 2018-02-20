package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testFirstPizzaOrderGetCost(){

        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(27), theCost);
    }

    @Test
    public void testFirstPizzaOrderGetDescription(){

        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        System.out.println(theOrder.getDescription());

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Standard pizza with toppings: + salami + cheese + cheese + onion", description);
    }

    @Test
    public void testSecondPizzaGetCost(){

        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SeafoodDecorator(theOrder);
        theOrder = new ThickCrustDecorator(theOrder);
        theOrder = new SpicyDecorator(theOrder);
        theOrder = new TunaDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(27), theCost);
    }

    @Test
    public void testSecondPizzaGetDescription(){

        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SeafoodDecorator(theOrder);
        theOrder = new ThickCrustDecorator(theOrder);
        theOrder = new SpicyDecorator(theOrder);
        theOrder = new TunaDecorator(theOrder);
        System.out.println(theOrder.getDescription());

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Standard pizza with toppings: + seafood + thick crust + spicy + tuna", description);
    }
}
