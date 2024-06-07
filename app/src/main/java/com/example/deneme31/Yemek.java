package com.example.deneme31;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Yemek implements Serializable {
    private String name;
    private String category;
    private List<Ingredient> ingredients;

    public Yemek() {
        // Default constructor required for calls to DataSnapshot.getValue(Yemek.class)
    }

    public Yemek(String name, String category) {
        this.name = name;
        this.category = category;
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void addIngredient(String ingredientName) {
        if (this.ingredients == null) {
            this.ingredients = new ArrayList<>();
        }
        this.ingredients.add(new Ingredient(ingredientName));
    }

    public void addIngredient(String ingredientName, int quantity, String unit) {
        if (this.ingredients == null) {
            this.ingredients = new ArrayList<>();
        }
        this.ingredients.add(new Ingredient(ingredientName, quantity, unit));
    }

    public boolean matchesIngredients(List<Ingredient> selectedIngredients) {
        for (Ingredient ingredient : selectedIngredients) {
            if (!this.ingredients.contains(ingredient)) {
                return false;
            }
        }
        return true;
    }
}
