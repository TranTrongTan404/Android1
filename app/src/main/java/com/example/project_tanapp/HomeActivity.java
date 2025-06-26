package com.example.project_tanapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button GoToProfile =findViewById(R.id.btnUser);
        GoToProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(it);
            }
        });

        Button GoToCart =findViewById(R.id.btnCart);
        GoToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), CartActivity.class);
                startActivity(it);
            }
        });

        Button GoToD1 =findViewById(R.id.btnD1);
        GoToD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ot = new Intent(getApplicationContext(), DetailProduct1Activity.class);
                startActivity(ot);
            }
        });
    }
}