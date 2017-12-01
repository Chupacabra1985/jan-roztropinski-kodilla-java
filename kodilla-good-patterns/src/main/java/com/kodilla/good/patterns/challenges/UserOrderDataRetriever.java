package com.kodilla.good.patterns.challenges;

public class UserOrderDataRetriever {

    public UserOrderData retrieve() {
        User user = new User("John", "Kowalski");
        String town = "Warsaw";
        String address = "Narutowicza 8/9";

        return new UserOrderData(user, town, address);
    }

}
