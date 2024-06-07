package com.example.deneme31;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class RecipeListActivity extends AppCompatActivity {
    ImageButton imgbtn1, imgbtn2, imgbtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_list);

        imgbtn1 = findViewById(R.id.imgbtn1);
        imgbtn2 = findViewById(R.id.imgbtn2);
        imgbtn3 = findViewById(R.id.imgbtn3);

        imgbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRecipeListDialog1();
            }
        });

        imgbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRecipeListDialog2();
            }
        });

        imgbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRecipeListDialog3();
            }
        });
    }

    private void showRecipeListDialog1() {
        final String[] recipes = {"Mercimek Çorbası", "Ezogelin Çorbası", "Domates Çorbası", "Tarhana Çorbası"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Çorba Tarifleri");

        builder.setItems(recipes, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String selectedRecipe = recipes[which];
                Intent intent = new Intent(RecipeListActivity.this, RecipeDetailActivity.class);
                intent.putExtra("recipeName", selectedRecipe);
                startActivity(intent);
            }
        });

        builder.show();
    }
    private void showRecipeListDialog2() {
        final String[] recipes = {
                "Karnıyarık", "Izgara Tavuk", "Spagetti Carbonara", "Köfte",
                "Fırında Tavuk", "Kuru Fasulye", "Mantar Sote"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Yemek Tarifleri");

        builder.setItems(recipes, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String selectedRecipe = recipes[which];
                Intent intent = new Intent(RecipeListActivity.this, RecipeDetailActivity.class);
                intent.putExtra("recipeName", selectedRecipe);
                startActivity(intent);
            }
        });

        builder.show();
    }

    private void showRecipeListDialog3() {
        final String[] recipes = {
                "Baklava", "Cheesecake", "Profiterol", "Tiramisu",
                "Magnolia", "Pavlova", "Trileçe"
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Yemek Tarifleri");

        builder.setItems(recipes, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String selectedRecipe = recipes[which];
                Intent intent = new Intent(RecipeListActivity.this, RecipeDetailActivity.class);
                intent.putExtra("recipeName", selectedRecipe);
                startActivity(intent);
            }
        });

        builder.show();
    }

}
