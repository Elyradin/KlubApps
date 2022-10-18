package com.example.klubapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailKlubActivity extends AppCompatActivity {
    TextView txtName, txtColor, txtDesc;
    String name, color, desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_klub);

        txtName = findViewById(R.id.txt_name);
        txtColor = findViewById(R.id.txt_color);
        txtDesc = findViewById(R.id.txt_description);

        Intent intent = getIntent();

        name = intent.getStringExtra("name");
        color = intent.getStringExtra("color");
        desc = intent.getStringExtra("desc");

        txtName.setText(name);
        txtColor.setText(color);
        txtDesc.setText(desc);
    }
}