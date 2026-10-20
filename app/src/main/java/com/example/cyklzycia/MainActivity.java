package com.example.cyklzycia;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button plus, minus;
    TextView wynik;
    int punkty = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        plus = findViewById(R.id.button);
        minus = findViewById(R.id.button2);
        wynik = findViewById(R.id.punkty);

        plus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty++;
                        wynik.setText(String.valueOf(punkty));

                    }
                }
        );
        minus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty--;
                        wynik.setText(String.valueOf(punkty));
                    }
                }
        );
        Log.i("CZAS", "wywołana metoda onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("CZAS", "wywołana metoda onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CZAS", "wywołana metoda onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("CZAS", "wywołana metoda onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("CZAS", "wywołana metoda onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CZAS", "wywołana metoda onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CZAS", "wywołana metoda onDestroy");
    }
}