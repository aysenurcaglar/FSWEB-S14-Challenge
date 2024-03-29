package org.example.models;

public class DeluxeBurger extends Hamburger {
    private String cips;
    private String drink;

    public DeluxeBurger() {
        super("Deluxe", "Double", 19.10, "Double Sandwich");
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    public void warning() {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        warning();
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        warning();
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        warning();
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        warning();
    }

    @Override
    public void itemizeHamburger() {
        super.itemizeHamburger();
    }
}
