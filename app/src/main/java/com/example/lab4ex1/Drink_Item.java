package com.example.lab4ex1;

public class Drink_Item {

    private String name;
    private String description;
    private int image; // Image resource ID
    private String price;

    public Drink_Item(String name, String description, int image, String price) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }

    public String getPrice() {
        return price;
    }
}
