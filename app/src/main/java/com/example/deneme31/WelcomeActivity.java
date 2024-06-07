package com.example.deneme31;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    private TextView tvWelcomeMessage;
    private ProgressBar progressBar;
    private Handler handler;
    private Runnable runnable;
    private int progressStatus = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        tvWelcomeMessage = findViewById(R.id.tvWelcomeMessage);
        progressBar = findViewById(R.id.progressBar);

        Intent intent = getIntent();
        String name = intent.getStringExtra("USER_NAME");
        tvWelcomeMessage.setText(name + " 'in mutfağına hoşgeldiniz!");

        // 2 saniye içinde ilerleyen progress bar
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                if (progressStatus < 100) {
                    progressStatus += 1;
                    progressBar.setProgress(progressStatus);
                    handler.postDelayed(this, 20); // 2000 milisaniye = 2 saniye, her adımda 20 ms
                } else {
                    // 2 saniye sonra MainScreenActivity'ye geçiş
                    Intent intent = new Intent(WelcomeActivity.this, MainScreenActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        handler.post(runnable);
    }
}
