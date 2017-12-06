package com.kodilla.good.patterns.food2door;

public interface Producer {

    void process();

    void addProduct(Product product);

    boolean getOrderStatus();


}
