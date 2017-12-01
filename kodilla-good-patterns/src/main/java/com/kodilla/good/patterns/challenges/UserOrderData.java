package com.kodilla.good.patterns.challenges;

public class UserOrderData {
    public User user;
    public String town;
    public String address;

    public UserOrderData(User user, String town, String address) {
        this.user = user;
        this.town = town;
        this.address = address;
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
}
