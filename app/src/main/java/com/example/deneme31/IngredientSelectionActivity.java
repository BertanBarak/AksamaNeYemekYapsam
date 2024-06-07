package com.example.deneme31;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.DatabaseError;
import java.util.ArrayList;
import java.util.List;

public class IngredientSelectionActivity extends AppCompatActivity {

    private LinearLayout ingredientsLayout;
    private Button suggestButton;
    private List<Ingredient> ingredients;
    private FirebaseHelper firebaseHelper;
    private String category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredient_selection);

        ingredientsLayout = findViewById(R.id.ingredients_layout);
        suggestButton = findViewById(R.id.suggest_button);

        ingredients = new ArrayList<>();
        firebaseHelper = new FirebaseHelper();

        category = getIntent().getStringExtra("CATEGORY");

        // Firebase'den malzemeleri al ve checkbox'ları oluştur
        firebaseHelper.getIngredients(new FirebaseHelper.IngredientDataStatus() {
            @Override
            public void DataIsLoaded(List<Ingredient> ingredientsFromDb) {
                ingredients.clear();
                for (Ingredient ingredient : ingredientsFromDb) {
                    if (ingredient.getCategory().equals(category)) {
                        ingredients.add(ingredient);
                    }
                }
                for (Ingredient ingredient : ingredients) {
                    CheckBox checkBox = new CheckBox(IngredientSelectionActivity.this);
                    checkBox.setText(ingredient.getName());
                    checkBox.setTag(ingredient);
                    ingredientsLayout.addView(checkBox);
                }
            }

            @Override
            public void DataIsCancelled(DatabaseError databaseError) {
                // Hataları işle
            }
        });

        suggestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Ingredient> selectedIngredients = new ArrayList<>();
                for (int i = 0; i < ingredientsLayout.getChildCount(); i++) {
                    CheckBox checkBox = (CheckBox) ingredientsLayout.getChildAt(i);
                    if (checkBox.isChecked()) {
                        selectedIngredients.add((Ingredient) checkBox.getTag());
                    }
                }

                Intent intent = new Intent(IngredientSelectionActivity.this, RecipeSuggestionActivity.class);
                intent.putExtra("selectedIngredients", new ArrayList<>(selectedIngredients));
                startActivity(intent);
            }
        });
    }
}
