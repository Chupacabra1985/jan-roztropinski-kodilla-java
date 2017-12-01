package com.kodilla.good.patterns.challenges;

public class BuyUser implements BuyService {
    public int quantity;

    public BuyUser(int quantity) {
        this.quantity = quantity;
    }

    public boolean Buy(User user, int quantity){
        return true;
    }

    public int getQuantity() {
        return quantity;
    }
}
