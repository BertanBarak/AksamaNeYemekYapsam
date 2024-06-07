package com.example.deneme31;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class IngredientCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredient_category);

        Button btnSebzeler = findViewById(R.id.btnSebzeler);
        Button btnBaharatlar = findViewById(R.id.btnBaharatlar);
        Button btnBaklagiller = findViewById(R.id.btnBaklagiller);
        Button btnEt = findViewById(R.id.btnEt);
        Button btnSut = findViewById(R.id.btnSut);
        Button btnDiger = findViewById(R.id.btnDiger);

        btnSebzeler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIngredientSelectionActivity("Sebzeler");
            }
        });

        btnBaharatlar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIngredientSelectionActivity("Baharatlar");
            }
        });

        btnBaklagiller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIngredientSelectionActivity("Baklagiller");
            }
        });

        btnEt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIngredientSelectionActivity("Et ve Şarküteri");
            }
        });

        btnSut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIngredientSelectionActivity("Süt Ürünleri");
            }
        });

        btnDiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIngredientSelectionActivity("Diğer");
            }
        });
    }

    private void openIngredientSelectionActivity(String category) {
        Intent intent = new Intent(IngredientCategoryActivity.this, IngredientSelectionActivity.class);
        intent.putExtra("CATEGORY", category);
        startActivity(intent);
    }
}
