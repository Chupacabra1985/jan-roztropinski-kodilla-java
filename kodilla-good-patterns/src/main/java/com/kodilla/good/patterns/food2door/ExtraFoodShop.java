package com.kodilla.good.patterns.food2door;

import java.util.List;

public class ExtraFoodShop extends Producer implements ProducerProcess {

    public ExtraFoodShop(String companyName, String city, List<Product> productList) {
        super(companyName, city, productList);
    }

    public boolean process(){
        return true;
    }
}


