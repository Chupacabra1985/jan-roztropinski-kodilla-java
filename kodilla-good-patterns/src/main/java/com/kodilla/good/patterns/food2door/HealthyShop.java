package com.kodilla.good.patterns.food2door;

import java.util.List;

public class HealthyShop extends AbstractProducer {

    public HealthyShop(String companyName, String city, List<Product> productList) {
        super(companyName, city, productList);
    }

    public void process() {
        //producer is processing order
    }


    public void addProduct(Product product) {
        getProductList().add(product);

    }


    public boolean getOrderStatus() {
        return true;
    }
}
