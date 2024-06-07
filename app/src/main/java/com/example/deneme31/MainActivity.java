package com.example.deneme31;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etName;
    private Button btnContinue, btnSelectIngredients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        btnContinue = findViewById(R.id.btnContinue);
        btnSelectIngredients = findViewById(R.id.btnSelectIngredients);

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                intent.putExtra("USER_NAME", name);
                startActivity(intent);
            }
        });

        btnSelectIngredients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IngredientCategoryActivity.class);
                startActivity(intent);
            }
        });
    }
}
