package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private BuyService buyService;
    private SendService sendService;
    private BuyerInformationService buyerInformationService;



    public ProductOrderService(BuyService buyService, SendService sendService, BuyerInformationService buyerInformationService) {
        this.buyService = buyService;
        this.sendService = sendService;
        this.buyerInformationService = buyerInformationService;
    }

    public SellDto process (final UserOrderData userOrderData){
        boolean isSold = buyService.correctOrder(userOrderData.getUser(), userOrderData.getQuantity());
        if(isSold){
            sendService.sendToBuyer(userOrderData.getUser());
            buyerInformationService.email();
            return new SellDto(userOrderData.getUser(), true);
        }else{
            return new SellDto(userOrderData.getUser(),false);
        }
    }



}
