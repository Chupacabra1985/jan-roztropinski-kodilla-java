package com.kodilla.good.patterns.challenges;

public class UserOrderData {
    public User user;
    public String town;
    public String address;
    public int quantity;

    public UserOrderData(User user, String town, String address, int quantity) {
        this.user = user;
        this.town = town;
        this.address = address;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public String getTown() {
        return town;
    }

    public String getAddress() {
        return address;
    }

    public int getQuantity() {
        return quantity;
    }
}
