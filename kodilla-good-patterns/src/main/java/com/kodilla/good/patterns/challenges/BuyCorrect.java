package com.kodilla.good.patterns.challenges;

public class BuyCorrect implements BuyService {

    public boolean correctOrder(User user, int quantity){
        if(quantity>0){
            return true;
        }else{
            return false;
        }
    }
}
