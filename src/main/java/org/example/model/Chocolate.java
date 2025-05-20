package org.example.model;

public class Chocolate extends ProductForSale{

    public Chocolate(String type, int price, String description) {
        super(type, price, description);

    }


    @Override
    public int getSalesPrice(int quantity) {
        return quantity * getPrice();
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + "Description: " + getDescription() + "Price: " + getPrice());
    }
}
