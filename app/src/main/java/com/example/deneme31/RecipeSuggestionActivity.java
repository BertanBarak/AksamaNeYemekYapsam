package com.example.deneme31;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.DatabaseError;
import java.util.ArrayList;
import java.util.List;

public class RecipeSuggestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_suggestion);

        List<Ingredient> selectedIngredients = (List<Ingredient>) getIntent().getSerializableExtra("selectedIngredients");

        List<Yemek> suggestedYemekList = new ArrayList<>();
        FirebaseHelper firebaseHelper = new FirebaseHelper();

        firebaseHelper.getYemekler(new FirebaseHelper.YemekDataStatus() {
            @Override
            public void DataIsLoaded(List<Yemek> yemekler) {
                for (Yemek yemek : yemekler) {
                    if (yemek.matchesIngredients(selectedIngredients)) {
                        suggestedYemekList.add(yemek);
                    }
                }

                TextView suggestionsTextView = findViewById(R.id.suggestions_text_view);
                if (suggestedYemekList.isEmpty()) {
                    suggestionsTextView.setText("No recipes found for the selected ingredients.");
                } else {
                    StringBuilder suggestions = new StringBuilder("Suggested Recipes:\n");
                    for (Yemek yemek : suggestedYemekList) {
                        suggestions.append(yemek.getName()).append("\n");
                    }
                    suggestionsTextView.setText(suggestions.toString());
                }
            }

            @Override
            public void DataIsCancelled(DatabaseError databaseError) {
                // Handle errors here
            }
        });
    }
}
