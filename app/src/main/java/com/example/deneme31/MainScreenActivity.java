package com.example.deneme31;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainScreenActivity extends AppCompatActivity {

    private Button btnAction1, btnAction2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        btnAction1 = findViewById(R.id.btnAction1);
        btnAction2 = findViewById(R.id.btnAction2);

        btnAction1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreenActivity.this, CategoryActivity.class);
                startActivity(intent);
            }
        });

        btnAction2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreenActivity.this, RecipeListActivity.class);
                startActivity(intent);
            }
        });
    }
}



