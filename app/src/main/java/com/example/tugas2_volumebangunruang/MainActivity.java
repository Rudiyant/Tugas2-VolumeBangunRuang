package com.example.tugas2_volumebangunruang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnTabung, btnKubus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTabung = findViewById(R.id.btnTabung);
        btnKubus = findViewById(R.id.btnKubus);

        btnTabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this, Tabung.class);
                startActivity(moveIntent);
            }
        });

        btnKubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this, Kubus.class);
                startActivity(moveIntent);
            }
        });
    }
}
