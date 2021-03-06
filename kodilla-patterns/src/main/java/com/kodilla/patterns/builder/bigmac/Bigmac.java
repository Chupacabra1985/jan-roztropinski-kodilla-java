package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String roll;
    private final int burgers;
    private final String sauce;
    private final List<String> ingrediens;

    public static class BigmacBuilder{
        private String roll;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder roll(String roll){
            this.roll = roll;
            return this;
        }

        public BigmacBuilder burgers(int burgers){
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce){
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient){
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build(){
            return new Bigmac(roll, burgers, sauce, ingredients);
        }

    }

    private Bigmac(final String roll, final int burgers, final String sauce, List<String> ingrediens) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingrediens = new ArrayList<>(ingrediens);
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngrediens() {
        return ingrediens;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingrediens=" + ingrediens +
                '}';
    }
}
