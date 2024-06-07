package com.example.deneme31;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecipeDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);

        TextView recipeDetailTextView = findViewById(R.id.recipe_detail);

        // Intent'ten tarif adını al
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("recipeName")) {
            String recipeName = intent.getStringExtra("recipeName");

            // Tarif detayını göster
            recipeDetailTextView.setText(getRecipeDetail(recipeName));
        } else {
            recipeDetailTextView.setText("Tarif bulunamadı.");
        }
    }

    private String getRecipeDetail(String recipeName) {
        switch (recipeName) {
            case "Mercimek Çorbası":
                return "Mercimek Çorbası Tarifi:\n\nMalzemeler:\n- 1 su bardağı kırmızı mercimek\n- 1 adet soğan\n- 1 adet havuç\n- 1 adet patates\n- 1 yemek kaşığı salça\n- 2 yemek kaşığı tereyağı\n- 1 çay kaşığı tuz\n- 6 su bardağı su\n\nYapılışı:\n1. Soğanı doğrayın ve tereyağında kavurun.\n2. Salçayı ekleyip karıştırın.\n3. Doğranmış havuç ve patatesi ekleyin.\n4. Mercimeği ekleyin ve karıştırın.\n5. Suyu ekleyin ve kaynamaya bırakın.\n6. Sebzeler yumuşayınca blender ile çorbayı ezin.\n7. Tuzunu ekleyip karıştırın ve servis edin.";
            case "Ezogelin Çorbası":
                return "Ezogelin Çorbası Tarifi:\n\nMalzemeler:\n- 1 su bardağı kırmızı mercimek\n- 1/2 su bardağı ince bulgur\n- 1/2 su bardağı pirinç\n- 1 adet soğan\n- 2 yemek kaşığı tereyağı\n- 1 yemek kaşığı salça\n- 1 çay kaşığı nane\n- 1 çay kaşığı pul biber\n- 1 çay kaşığı tuz\n- 8 su bardağı su\n\nYapılışı:\n1. Soğanı doğrayın ve tereyağında kavurun.\n2. Salçayı ekleyip karıştırın.\n3. Mercimek, bulgur ve pirinci ekleyin.\n4. Suyu ekleyin ve kaynamaya bırakın.\n5. Baharatları ekleyin ve karıştırın.\n6. Çorba kıvam alınca ocaktan alın ve servis edin.";
            case "Domates Çorbası":
                return "Domates Çorbası Tarifi:\n\nMalzemeler:\n- 5 adet domates\n- 1 adet soğan\n- 2 yemek kaşığı tereyağı\n- 2 yemek kaşığı un\n- 1 su bardağı süt\n- 5 su bardağı su\n- 1 çay kaşığı tuz\n- 1 çay kaşığı karabiber\n\nYapılışı:\n1. Domatesleri rendeleyin.\n2. Soğanı doğrayın ve tereyağında kavurun.\n3. Unu ekleyin ve kavurun.\n4. Rendelenmiş domatesleri ekleyin ve karıştırın.\n5. Suyu ekleyin ve kaynamaya bırakın.\n6. Çorba kaynayınca sütü ekleyin ve karıştırın.\n7. Tuz ve karabiber ekleyin ve karıştırın.\n8. Çorbayı blender ile ezin ve servis edin.";
            case "Tarhana Çorbası":
                return "Tarhana Çorbası Tarifi:\n\nMalzemeler:\n- 1 su bardağı tarhana\n- 1 yemek kaşığı salça\n- 2 yemek kaşığı tereyağı\n- 6 su bardağı su\n- 1 çay kaşığı tuz\n- 1 çay kaşığı pul biber\n\nYapılışı:\n1. Tarhanayı bir kase su ile ıslatın.\n2. Tereyağını eritip salçayı kavurun.\n3. Suyu ekleyin ve kaynamaya bırakın.\n4. Islatılmış tarhanayı ekleyin ve karıştırın.\n5. Tuz ve pul biber ekleyin ve karıştırın.\n6. Çorba kıvam alınca ocaktan alın ve servis edin.";
            case "Karnıyarık":
                return "Karnıyarık Tarifi:\n\nMalzemeler:\n- 4 adet patlıcan\n- 300 gram kıyma\n- 2 adet domates\n- 2 adet yeşil biber\n- 2 adet kapya biber\n- 2 adet soğan\n- 2 diş sarımsak\n- 1/2 su bardağı sıvı yağ\n- Tuz, karabiber, kimyon\n\nYapılışı:\n1. Patlıcanları alacalı soyun ve kızgın yağda kızartın.\n2. Soğanı ve sarımsağı doğrayın, sıvı yağda kavurun.\n3. Kıymayı ekleyip kavurun, baharatlarını ekleyin.\n4. Doğranmış biberleri ekleyin, domatesleri rendeleyip ekleyin.\n5. Patlıcanların içine bu harçtan doldurun.\n6. Fırın tepsisine dizin ve üzerlerine domates dilimleri yerleştirin.\n7. Önceden ısıtılmış 180 derece fırında pişirin.";
            case "Izgara Tavuk":
                return "Izgara Tavuk Tarifi:\n\nMalzemeler:\n- 4 adet tavuk göğsü\n- 1/4 su bardağı zeytinyağı\n- 2 diş sarımsak\n- Tuz, karabiber, kekik\n\nYapılışı:\n1. Tavuk göğüslerini temizleyin ve ince dilimlere kesin.\n2. Zeytinyağı, ezilmiş sarımsak ve baharatlar ile marine edin.\n3. Izgara tavasında veya mangalda pişirin.\n4. Pişirme sırasında tavukları ara sıra çevirerek her tarafının eşit pişmesini sağlayın.";
            case "Spagetti Carbonara":
                return "Spagetti Carbonara Tarifi:\n\nMalzemeler:\n- 400 gram spagetti makarna\n- 150 gram dana jambon veya bacon\n- 3 adet yumurta\n- 1 su bardağı rendelenmiş parmesan peyniri\n- 3 diş sarımsak\n- Tuz, karabiber\n\nYapılışı:\n1. Spagetti makarnayı haşlayın, suyunu süzün.\n2. Jambon veya bacon'u küçük küçük doğrayın ve tavada kızartın.\n3. Yumurtaları çırpın, içine rendelenmiş parmesan peynirini ekleyin.\n4. Haşlanmış makarnayı tavada kızartılan jambonun üzerine ekleyin.\n5. Ocaktan almadan önce yumurtalı karışımı ekleyin ve karıştırarak pişirin.\n6. Sıcak servis yapın.";
            case "Köfte":
                return "Köfte Tarifi:\n\nMalzemeler:\n- 500 gram dana kıyma\n- 1 adet soğan\n- 2 dilim bayat ekmek içi\n- 1 yumurta\n- Tuz, karabiber, kimyon\n\nYapılışı:\n1. Kıymayı yoğurma kabına alın, üzerine rendelenmiş soğanı, ufalanmış bayat ekmek içini, yumurtayı, tuz ve baharatları ekleyin.\n2. Malzemeleri yoğurarak köfte harcını hazırlayın.\n3. Harcı istediğiniz şekle bürün ve ızgarada veya tavada pişirin.\n4. Pişirme işlemi tamamlandıktan sonra sıcak servis yapın.";
            case "Fırında Tavuk":
                return "Fırında Tavuk Tarifi:\n\nMalzemeler:\n- 1 adet bütün tavuk\n- 2 yemek kaşığı tereyağı\n- 2 diş sarımsak\n- 1 adet limon\n- Tuz, karabiber, kekik\n\nYapılışı:\n1. Tavuğu temizleyin ve içine tereyağı, ezilmiş sarımsak ve limon dilimlerini yerleştirin.\n2. Tavuğun dışını tuz, karabiber ve kekik ile ovun.\n3. Önceden ısıtılmış 180 derece fırında tavuğu pişirin, ara sıra tavuğun suyunu dökerek üzerini kontrol edin.\n4. Pişirme süresi tamamlandıktan sonra sıcak servis yapın.";
            case "Kuru Fasulye":
                return "Kuru Fasulye Tarifi:\n\nMalzemeler:\n- 2 su bardağı kuru fasulye\n- 1 adet soğan\n- 2 yemek kaşığı salça\n- 2 yemek kaşığı sıvı yağ\n- Tuz, karabiber, kimyon\n\nYapılışı:\n1. Kuru fasulyeleri akşamdan suya koyun ve ıslatın.\n2. Ertesi gün fasulyeleri süzün ve temizleyin.\n3. Tencereye sıvı yağ ve doğranmış soğanı ekleyin, kavurun.\n4. Salçayı ekleyin, karıştırın.\n5. Fasulyeleri ekleyin, suyunu ekleyin.\n6. Tuz ve baharatları ekleyin, karıştırın.\n7. Kısık ateşte fasulyeler yumuşayana kadar pişirin.";
            case "Mantar Sote":
                return "Mantar Sote Tarifi:\n\nMalzemeler:\n- 500 gram mantar\n- 2 adet yeşil biber\n- 2 adet kırmızı biber\n- 1 adet soğan\n- 2 diş sarımsak\n- 2 yemek kaşığı zeytinyağı\n- Tuz, karabiber, kekik\n\nYapılışı:\n1. Mantarları temizleyin ve dilimleyin.\n2. Soğanı ve sarımsağı doğrayın, biberleri şerit şeklinde kesin.\n3. Bir tavada zeytinyağını kızdırın, doğranmış soğan ve sarımsağı ekleyin, kavurun.\n4. Ardından mantarları ekleyin ve suyunu salıp çekene kadar pişirin.\n5. Biberleri ekleyin ve kavurun.\n6. Tuz, karabiber ve kekikle tatlandırın.\n7. Sıcak servis yapın.";
            case "Baklava":
                return "Baklava Tarifi:\n\nMalzemeler:\n- 1 paket baklavalık yufka\n- 300 gram ceviz içi\n- 250 gram tereyağı\n- 1 su bardağı şeker\n- 1 su bardağı su\n- 1 çay kaşığı toz tarçın\n\nYapılışı:\n1. Ceviz içini iri olarak doğrayın.\n2. Baklavalık yufkaları tezgaha serin.\n3. Yufkaları aralara yağ sürerek üst üste koyun.\n4. Üst üste koyduğunuz yufkaların arasına ceviz içi serpiştirin.\n5. Baklavayı dilimleyin ve fırın tepsisine dizin.\n6. Önceden ısıtılmış 180 derece fırında pişirin.\n7. Şeker ve suyu kaynatıp şerbet haline getirin, ocaktan alın.\n8. Fırından çıkan sıcak baklavaların üzerine soğuk şerbeti dökün.\n9. Tarçın serpip servis yapın.";
            case "Cheesecake":
                return "Cheesecake Tarifi:\n\nMalzemeler:\n- 200 gram krem peynir\n- 200 gram labne peynir\n- 1 su bardağı toz şeker\n- 3 adet yumurta\n- 1 çay bardağı yoğurt\n- 1 çay bardağı krema\n- 1 paket vanilya\n- 2 yemek kaşığı un\n- 1 yemek kaşığı mısır nişastası\n- 1 adet limon kabuğu rendesi\n- 1 paket burçak bisküvi\n- 80 gram tereyağı\n\nYapılışı:\n1. Burçak bisküvileri rondodan geçirip toz haline getirin.\n2. Eritilmiş tereyağı ile bisküvi tozunu karıştırıp kelepçeli kalıba yayın ve sıkıştırın.\n3. Krem peynir, labne peynir, toz şeker, yoğurt ve vanilyayı mikserle çırpın.\n4. Yumurtaları tek tek ekleyerek çırpmaya devam edin.\n5. Un ve mısır nişastasını ekleyip karıştırın.\n6. Limon kabuğu rendesini ekleyip karıştırın.\n7. Karışımı bisküvili tabanın üzerine dökün.\n8. Önceden ısıtılmış 170 derece fırında 45-50 dakika pişirin.\n9. Soğuduktan sonra buzdolabında en az 4 saat dinlendirin ve dilimleyerek servis yapın.";
            case "Profiterol":
                return "Profiterol Tarifi:\n\nMalzemeler:\n- 1 su bardağı su\n- 100 gram tereyağı\n- 1 çay kaşığı tuz\n- 1 su bardağı un\n- 3 adet yumurta\n- 1 su bardağı süt\n- 1 su bardağı su\n- 1 paket krema\n- 100 gram çikolata\n\nYapılışı:\n1. Tereyağını, suyu ve tuzu küçük bir tencerede kaynatın.\n2. Unu ekleyip karıştırarak pişirin ve ocaktan alın.\n3. Karışımı biraz soğuttuktan sonra yumurtaları tek tek ekleyerek karıştırın.\n4. Krema ve çikolatayı küçük bir tencerede eritin.\n5. Pişirdiğiniz hamuru sıkma torbasına alın ve yağlı kağıt serdiğiniz fırın tepsisine ufak parçalar halinde sıkın.\n6. Önceden ısıtılmış 200 derece fırında üzerleri kızarana kadar pişirin.\n7. Pişen profiterollerin içine krema doldurun ve üzerine erittiğiniz çikolatayı dökün.\n8. Soğuyunca servis yapın. Afiyet olsun!";
            case "Tiramisu":
                return "Tiramisu Tarifi:\n\nMalzemeler:\n- 1 paket kedi dili bisküvi\n- 2 su bardağı sıcak su\n- 2 yemek kaşığı granül kahve\n- 3 yemek kaşığı toz şeker\n- 500 gram mascarpone peynir\n- 1 su bardağı krema\n- 1 paket vanilya\n- 3 yemek kaşığı kakao\n\nYapılışı:\n1. Sıcak suya granül kahveyi ve şekeri ekleyip karıştırın.\n2. Kedi dili bisküvilerini bu karışıma batırıp dikdörtgen bir borcamın tabanına dizin.\n3. Mascarpone peynirini krema ile karıştırın.\n4. Vanilyayı ekleyip karıştırın.\n5. Kedi dili bisküvilerinin üzerine bu karışımın yarısını yayın.\n6. Kalan kedi dili bisküvilerini üzerine dizin ve tekrar peynirli karışımı yayın.\n7. Kakao ile üzerini süsleyin.\n8. Buzdolabında en az 4 saat dinlendirip servis yapın.";
            case "Magnolia":
                return "Magnolia Tarifi:\n\nMalzemeler:\n- 2 su bardağı süt\n- 2 yemek kaşığı un\n- 1 yemek kaşığı mısır nişastası\n- 1/2 su bardağı toz şeker\n- 1 paket vanilya\n- 2 adet muz\n- 1 paket kakaolu bisküvi\n- 1 paket krem şanti\n\nYapılışı:\n1. Süt, un, mısır nişastası, şeker ve vanilyayı tencerede pişirin.\n2. Pişen muhallebiyi ocaktan alıp soğumaya bırakın.\n3. Krem şantiyi süt ile çırpıp dolaba koyun.\n4. Muzları dilimleyin.\n5. Kakaolu bisküvileri ıslatılmış süt ile birlikte bir borcama dizin.\n6. Üzerine muz dilimleri ve muhallebiyi dökün.\n7. Son kat olarak krem şantiyi sürün.\n8. Buzdolabında 1-2 saat dinlendirin ve servis yapın.";
            case "Pavlova":
                return "Pavlova Tarifi:\n\nMalzemeler:\n- 4 adet yumurta akı\n- 1 su bardağı toz şeker\n- 1 çay kaşığı limon suyu\n- 1 çay kaşığı nişasta\n- 1 su bardağı krema\n- Çilek ve frambuaz (üzeri için)\n\nYapılışı:\n1. Yumurta aklarını çırpıcı yardımıyla köpük köpük olana kadar çırpın.\n2. Şekerin yarısını ekleyip çırpmaya devam edin.\n3. Kalan şekerin yarısını da ekleyip çırpmaya devam edin.\n4. Limon suyunu ve nişastayı ekleyip karıştırın.\n5. Yağlı kağıt serdiğiniz fırın tepsisine karışımı yayın ve ortasını oyarak çukur yapın.\n6. Önceden ısıtılmış 120 derece fırında 1.5 saat pişirin.\n7. Soğuduktan sonra üzerine krema sürün ve meyvelerle süsleyin.\n8. Dilimleyerek servis yapın.";
            case "Trileçe":
                return "Trileçe Tarifi:\n\nMalzemeler:\n- 4 adet yumurta\n- 1 su bardağı toz şeker\n- 1 su bardağı un\n- 1 paket kabartma tozu\n- 1 paket vanilya\n- 1 su bardağı süt\n- 1 su bardağı krema\n- 1 su bardağı şeker\n- 1 su bardağı hindistan cevizi\n- 1 su bardağı süt\n\nYapılışı:\n1. Yumurta ve toz şekeri mikserle çırpın.\n2. Unu, kabartma tozunu ve vanilyayı ekleyip karıştırın.\n3. Yağlanmış fırın kabına dökün.\n4. Önceden ısıtılmış 180 derece fırında pişirin.\n5. Pişen keki fırından alıp soğumaya bırakın.\n6. Soğuyan kekin üzerine süt dökün.\n7. Krem şantiyi süt ile çırpıp üzerine sürün.\n8. Hindistan cevizini serpip servis yapın.";
            default:
                return "Tarif bulunamadı";
        }
    }

}

