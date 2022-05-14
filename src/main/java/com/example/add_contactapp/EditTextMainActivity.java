package com.example.add_contactapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class EditTextMainActivity extends AppCompatActivity {
    EditText editText;
    ImageButton imageButton;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text_main);
        editText=findViewById(R.id.editText);
        imageButton=findViewById(R.id.btn1);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        });

        editText.setText(getIntent().getStringExtra("number"));

    }
}