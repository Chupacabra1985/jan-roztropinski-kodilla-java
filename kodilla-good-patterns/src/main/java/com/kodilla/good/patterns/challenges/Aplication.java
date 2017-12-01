package com.kodilla.good.patterns.challenges;

public class Aplication {
    public static void main(String[] args){
        UserOrderDataRetriever userOrderDataRetriever = new UserOrderDataRetriever();
        UserOrderData userOrderData = userOrderDataRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService();
        productOrderService.process(userOrderData);

    }
}
