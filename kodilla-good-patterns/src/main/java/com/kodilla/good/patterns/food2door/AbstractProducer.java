package com.kodilla.good.patterns.food2door;

import java.util.LinkedList;
import java.util.List;

abstract class AbstractProducer implements Producer {
    private String companyName;
    private String city;
    private List<Product> productList = new LinkedList<>();

    public AbstractProducer(String companyName, String city, List<Product> productList) {
        this.companyName = companyName;
        this.city = city;
        this.productList = productList;
    }

    public void addProduct(Product product) {
        getProductList().add(product);

    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCity() {
        return city;
    }

    public List<Product> getProductList() {
        return productList;
    }
}
