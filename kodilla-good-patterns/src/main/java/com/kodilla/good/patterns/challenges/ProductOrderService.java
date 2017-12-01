package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private BuyService buyService;
    private SendService sendService;
    private BuyerInformationService buyerInformationService;
    private BuyUser buyUser;


    public ProductOrderService(BuyService buyService, SendService sendService, BuyerInformationService buyerInformationService,BuyUser buyUser) {
        this.buyService = buyService;
        this.sendService = sendService;
        this.buyerInformationService = buyerInformationService;
        this.buyUser = buyUser;
    }

    public SellDto process (final UserOrderData userOrderData){
        boolean isSold = buyService.Buy(userOrderData.getUser(), buyUser.getQuantity());
        if(isSold){
            sendService.SendToBuyer(userOrderData.getUser());
            buyerInformationService.Email();
            return new SellDto(userOrderData.getUser(), true);
        }else{
            return new SellDto(userOrderData.getUser(),false);
        }
    }



}
