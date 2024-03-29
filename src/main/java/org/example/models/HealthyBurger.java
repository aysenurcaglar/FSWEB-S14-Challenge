package org.example.models;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }



    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public void itemizeHamburger() {

        System.out.println("Name: " + this.getName());
        System.out.println("Meat: " + this.getMeat());
        System.out.println("BreadRollType: " + this.getBreadRollType());

        String[] additions = {getAddition1Name(), getAddition2Name(), getAddition3Name(), getAddition4Name()};
        double[] prices = {getAddition1Price(), getAddition2Price(), getAddition3Price(), getAddition4Price()};

        for (int i = 0; i < additions.length; i++) {
            if (additions[i] != null) {
                System.out.println("Addition" + (i + 1) + ": " + additions[i]);
            }
        }

        String[] healthyAdditions = {this.healthyExtra1Name, this.healthyExtra2Name};
        double[] healthyPrices = {this.healthyExtra1Price, this.healthyExtra2Price};

        for (int i = 0; i < healthyAdditions.length; i++) {
            if (healthyAdditions[i] != null) {
                System.out.println("HealthyAddition" + (i + 1) + ": " + healthyAdditions[i]);
            }
        }

        System.out.println("Price: " + this.getPrice());

    }

    @Override
    public double getPrice() {
        double totalPrice = super.getPrice();

        // Add regular additions
        totalPrice += getAddition1Price();
        totalPrice += getAddition2Price();
        totalPrice += getAddition3Price();
        totalPrice += getAddition4Price();

        // Add healthy additions
        totalPrice += this.healthyExtra1Price;
        totalPrice += this.healthyExtra2Price;

        return totalPrice;
    }
}
