package com.kodilla.good.patterns.food2door;

import java.util.List;

public class GlutenFreeShop extends AbstractProducer {

    public GlutenFreeShop(String companyName, String city, List<Product> productList) {
        super(companyName, city, productList);
    }

    public void process() {
        //producer is processing order
    }

    public void addProduct(Product product) {
        getProductList().add(product);

    }

    public boolean getOrderStatus() {
        return false;
    }
}
