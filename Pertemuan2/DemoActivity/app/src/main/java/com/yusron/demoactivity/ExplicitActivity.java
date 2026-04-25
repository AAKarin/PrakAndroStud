package com.yusron.demoactivity;

import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ExplicitActivity extends AppCompatActivity {
    String nilai_nim, nilai_nama;
    EditText etNim, etNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit);
        etNim = (EditText) findViewById(R.id.etNim);
        etNama = (EditText) findViewById(R.id.etNama);
        etNim.setText(getIntent().getStringExtra("data1"));
        etNama.setText(getIntent().getStringExtra("data2"));
    }
}