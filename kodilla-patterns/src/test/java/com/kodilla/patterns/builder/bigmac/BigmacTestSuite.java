package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("With sesame")
                .burgers(2)
                .sauce("Barbecue")
                .ingredient("Bacon")
                .ingredient("Cheese")
                .ingredient("Lettuce")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngrediens = bigmac.getIngrediens().size();

        //Then
        Assert.assertEquals(3, howManyIngrediens);

    }
}
