package com.kodilla.good.patterns.food2door;

import java.util.LinkedList;
import java.util.List;

abstract class AbstractProducer implements Producer {
    String companyName;
    String city;
    List<Product> productList = new LinkedList<>();

    public AbstractProducer(String companyName, String city, List<Product> productList) {
        this.companyName = companyName;
        this.city = city;
        this.productList = productList;
    }

}
