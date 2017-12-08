package com.kodilla.good.patterns.food2door;

import java.util.LinkedList;
import java.util.List;

public class Aplication {

    public static void main(String[] args){

        List<Product> extraFoodShopList = new LinkedList<>();

        AbstractProducer extraFoodShop = new ExtraFoodShop("ExtraFoodShop", "Toronto", extraFoodShopList);
        extraFoodShop.addProduct(new Product("Milk",4));
        extraFoodShop.process();
        extraFoodShop.getOrderStatus();


        List<Product> healthyShopList = new LinkedList<>();

        AbstractProducer healthyShop = new HealthyShop("HealthyShop", "Dubaj", healthyShopList );
        healthyShop.addProduct(new Product("Bread", 7));
        healthyShop.process();
        healthyShop.getOrderStatus();

        List<Product> glutenFreeShopList = new LinkedList<>();

        AbstractProducer glutenFreeShop = new GlutenFreeShop("GlutenFreeShop", "Poznan", glutenFreeShopList);
        glutenFreeShop.process();
        glutenFreeShop.getOrderStatus();

        List<Producer> producerList = new LinkedList<>();
        producerList.add(extraFoodShop);
        producerList.add(healthyShop);
        producerList.add(glutenFreeShop);

        for (int i=0; i<producerList.size(); i++){
            producerList.get(i);
        }

    }

}
