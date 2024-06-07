package com.example.deneme31;

import java.io.Serializable;

public class Ingredient implements Serializable {
    private String name;
    private int quantity;
    private String unit;
    private int imageResId;
    private boolean available;
    private String category; // Yeni alan

    public Ingredient() {
        // Default constructor required for calls to DataSnapshot.getValue(Ingredient.class)
    }

    public Ingredient(String name) {
        this.name = name;
    }

    public Ingredient(String name, int imageResId, String category) {
        this.name = name;
        this.imageResId = imageResId;
        this.category = category;
        this.available = false; // Default value
    }

    // Kaldırılan constructor:
    // public Ingredient(String name, int quantity, String unit) {
    //    this.name = name;
    //    this.quantity = quantity;
    //    this.unit = unit;
    //    this.available = false; // Default value
    // }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
