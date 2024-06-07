package com.example.deneme31;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;
import java.util.List;

public class FirebaseHelper {
    private DatabaseReference yemekDatabaseReference;
    private DatabaseReference ingredientDatabaseReference;

    public FirebaseHelper() {
        yemekDatabaseReference = FirebaseDatabase.getInstance().getReference("yemekler");
        ingredientDatabaseReference = FirebaseDatabase.getInstance().getReference("ingredients");
    }

    public void addYemek(Yemek yemek) {
        yemekDatabaseReference.push().setValue(yemek);
    }

    public void addIngredient(Ingredient ingredient) {
        ingredientDatabaseReference.push().setValue(ingredient);
    }

    public void getYemekler(final YemekDataStatus dataStatus) {
        yemekDatabaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                List<Yemek> yemekler = new ArrayList<>();
                for (DataSnapshot keyNode : dataSnapshot.getChildren()) {
                    Yemek yemek = keyNode.getValue(Yemek.class);
                    yemekler.add(yemek);
                }
                dataStatus.DataIsLoaded(yemekler);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                dataStatus.DataIsCancelled(databaseError);
            }
        });
    }

    public void getIngredients(final IngredientDataStatus dataStatus) {
        ingredientDatabaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                List<Ingredient> ingredients = new ArrayList<>();
                for (DataSnapshot keyNode : dataSnapshot.getChildren()) {
                    Ingredient ingredient = keyNode.getValue(Ingredient.class);
                    ingredients.add(ingredient);
                }
                dataStatus.DataIsLoaded(ingredients);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                dataStatus.DataIsCancelled(databaseError);
            }
        });
    }

    public interface YemekDataStatus {
        void DataIsLoaded(List<Yemek> yemekler);
        void DataIsCancelled(DatabaseError databaseError);
    }

    public interface IngredientDataStatus {
        void DataIsLoaded(List<Ingredient> ingredients);
        void DataIsCancelled(DatabaseError databaseError);
    }
}
