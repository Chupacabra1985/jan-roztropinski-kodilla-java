package com.kodilla.good.patterns.food2door;

import java.util.LinkedList;
import java.util.List;

public class Aplication {

    public static void main(String[] args){

        List<Product> extraFoodShopList = new LinkedList<>();

        ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop", "Toronto", extraFoodShopList);
        extraFoodShop.addProduct(new Product("Milk",4));
        extraFoodShop.process();
        extraFoodShop.getOrderStatus();

    }

}
