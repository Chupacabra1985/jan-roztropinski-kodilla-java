package com.kodilla.good.patterns.challenges;

public class Aplication {
    public static void main(String[] args){
        UserOrderDataRetriever userOrderDataRetriever = new UserOrderDataRetriever();
        UserOrderData userOrderData = userOrderDataRetriever.retrieve();

        SendService sendService = new Send();
        BuyService buyService = new BuyCorrect();
        BuyerInformationService buyerInformationService = new Email();

        ProductOrderService productOrderService = new ProductOrderService(buyService, sendService, buyerInformationService);
        productOrderService.process(userOrderData);

    }
}
