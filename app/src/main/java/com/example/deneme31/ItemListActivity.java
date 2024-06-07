package com.example.deneme31;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ItemListActivity extends AppCompatActivity {

    private TextView tvCategory;
    private RecyclerView recyclerView;
    private IngredientsAdapter ingredientsAdapter;
    private List<Ingredient> ingredientList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);

        tvCategory = findViewById(R.id.tvCategory);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String category = getIntent().getStringExtra("CATEGORY");
        if (category != null) {
            tvCategory.setText("Seçilen Kategori: " + category);
        }

        // Malzeme listesini oluşturun
        ingredientList = new ArrayList<>();
        ingredientList.add(new Ingredient("Nohut", R.drawable.nohut, "Baklagiller"));
        ingredientList.add(new Ingredient("Bezelye", R.drawable.bezelye, "Baklagiller"));
        ingredientList.add(new Ingredient("Fasulye", R.drawable.fasulyejpg, "Baklagiller"));
        ingredientList.add(new Ingredient("Yeşil Mercimek", R.drawable.yesilmerci, "Baklagiller"));
        ingredientList.add(new Ingredient("Kırmızı Mercimek", R.drawable.borulce, "Baklagiller"));
        ingredientList.add(new Ingredient("Börülce", R.drawable.borulce, "Baklagiller"));
        ingredientList.add(new Ingredient("Soya Fasulyesi", R.drawable.soyafasulyesi, "Baklagiller"));

        ingredientList.add(new Ingredient("Domates", R.drawable.domates, "Sebzeler"));
        ingredientList.add(new Ingredient("Biber", R.drawable.biber, "Sebzeler"));
        ingredientList.add(new Ingredient("Salatalık", R.drawable.domates, "Sebzeler"));
        ingredientList.add(new Ingredient("Kapya Biber", R.drawable.kapya, "Sebzeler"));
        ingredientList.add(new Ingredient("Dolma Biber", R.drawable.dolmab, "Sebzeler"));
        ingredientList.add(new Ingredient("Fasulye", R.drawable.yas_fasulye, "Sebzeler"));
        ingredientList.add(new Ingredient("Soğan", R.drawable.sogan, "Sebzeler"));
        ingredientList.add(new Ingredient("Patates", R.drawable.patates, "Sebzeler"));
        ingredientList.add(new Ingredient("Dere Otu", R.drawable.dere_otu, "Sebzeler"));
        ingredientList.add(new Ingredient("Havuç", R.drawable.dere_otu, "Sebzeler"));
        ingredientList.add(new Ingredient("Mantar", R.drawable.dere_otu, "Sebzeler"));
        ingredientList.add(new Ingredient("Dana Kıyma", R.drawable.dere_otu, "Et Urunleri"));
        ingredientList.add(new Ingredient("Dana Jambon", R.drawable.dere_otu, "Et Urunleri"));
        ingredientList.add(new Ingredient("Bacon", R.drawable.dere_otu, "Et Urunleri"));

        ingredientList.add(new Ingredient("Süt", R.drawable.sut, "Sut Urunleri"));
        ingredientList.add(new Ingredient("Peynir", R.drawable.peynir, "Sut Urunleri"));
        ingredientList.add(new Ingredient("Yoğurt", R.drawable.peynir, "Sut Urunleri"));
        ingredientList.add(new Ingredient("Krema", R.drawable.peynir, "Sut Urunleri"));
        ingredientList.add(new Ingredient("Mascarpone Peyniri", R.drawable.peynir, "Sut Urunleri"));

        ingredientList.add(new Ingredient("Tuz", R.drawable.tuz, "Baharatlar"));
        ingredientList.add(new Ingredient("Karabiber", R.drawable.karabiber, "Baharatlar"));
        ingredientList.add(new Ingredient("Kimyon", R.drawable.karabiber, "Baharatlar"));
        ingredientList.add(new Ingredient("Nane", R.drawable.karabiber, "Baharatlar"));
        ingredientList.add(new Ingredient("Köri", R.drawable.karabiber, "Baharatlar"));
        ingredientList.add(new Ingredient("Kakule", R.drawable.karabiber, "Baharatlar"));
        ingredientList.add(new Ingredient("İsot", R.drawable.karabiber, "Baharatlar"));
        ingredientList.add(new Ingredient("Kekik", R.drawable.karabiber, "Baharatlar"));
        ingredientList.add(new Ingredient("Zerdeçal", R.drawable.karabiber, "Baharatlar"));
        ingredientList.add(new Ingredient("Tarçın", R.drawable.karabiber, "Baharatlar"));

        ingredientList.add(new Ingredient("Un", R.drawable.karabiber, "Other"));
        ingredientList.add(new Ingredient("Maya", R.drawable.karabiber, "Other"));
        ingredientList.add(new Ingredient("İnce Bulgur", R.drawable.karabiber, "Other"));
        ingredientList.add(new Ingredient("Pirinç", R.drawable.karabiber, "Other"));
        ingredientList.add(new Ingredient("Kakao", R.drawable.karabiber, "Other"));
        ingredientList.add(new Ingredient("Toz Şeker", R.drawable.karabiber, "Other"));
        ingredientList.add(new Ingredient("Nişasta", R.drawable.karabiber, "Other"));
        ingredientList.add(new Ingredient("Limon Suyu", R.drawable.karabiber, "Other"));
        ingredientList.add(new Ingredient("Yumurta", R.drawable.karabiber, "Other"));
        ingredientList.add(new Ingredient("Hindistan Cevizi", R.drawable.karabiber, "Other"));
        ingredientList.add(new Ingredient("Kabartma Tozu", R.drawable.karabiber, "Other"));
        ingredientList.add(new Ingredient("Vanilya", R.drawable.karabiber, "Other"));

        // Kategoriye göre filtreleme yapın
        List<Ingredient> filteredList = ingredientList.stream()
                .filter(ingredient -> ingredient.getCategory().equals(category))
                .collect(Collectors.toList());

        ingredientsAdapter = new IngredientsAdapter(filteredList);
        recyclerView.setAdapter(ingredientsAdapter);
    }
}
