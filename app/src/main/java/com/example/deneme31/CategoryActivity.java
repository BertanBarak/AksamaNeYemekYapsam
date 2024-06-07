package com.example.deneme31;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CategoryActivity extends AppCompatActivity {

    private Button btnSebzeler, btnBaharatlar, btnBaklagiller,btnEt,btnSutUrunleri,btnOther,btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        btnSebzeler = findViewById(R.id.btnSebzeler);
        btnBaharatlar = findViewById(R.id.btnBaharatlar);
        btnBaklagiller = findViewById(R.id.btnBaklagiller);
        btnEt = findViewById(R.id.btnEt);
        btnSutUrunleri = findViewById(R.id.btnSutUrunleri);
        btnOther = findViewById(R.id.btnOther);
        btnGo = findViewById(R.id.btnGo);



        btnSebzeler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, ItemListActivity.class);
                intent.putExtra("CATEGORY", "Sebzeler");
                startActivity(intent);
            }
        });

        btnBaharatlar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, ItemListActivity.class);
                intent.putExtra("CATEGORY", "Baharatlar");
                startActivity(intent);
            }
        });

        btnBaklagiller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, ItemListActivity.class);
                intent.putExtra("CATEGORY", "Baklagiller");
                startActivity(intent);
            }
        });

        btnEt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, ItemListActivity.class);
                intent.putExtra("CATEGORY", "Et Urunleri");
                startActivity(intent);

            }
        });

        btnSutUrunleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, ItemListActivity.class);
                intent.putExtra("CATEGORY", "Sut Urunleri");
                startActivity(intent);

            }
        });

        btnOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, ItemListActivity.class);
                intent.putExtra("CATEGORY", "Other");
                startActivity(intent);

            }
        });

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, sonekran.class);
                startActivity(intent);
            }
        });


    }
}
