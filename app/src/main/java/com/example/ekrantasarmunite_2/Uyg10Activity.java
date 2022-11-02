package com.example.ekrantasarmunite_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg10Activity extends AppCompatActivity {
    Button btnGeri;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg8_activity);

        btnGeri = findViewById(R.id.btnGeri);
        btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(Uyg10Activity.this, MainActivity.class);
                startActivity(main);
            }
        });
    }
}
