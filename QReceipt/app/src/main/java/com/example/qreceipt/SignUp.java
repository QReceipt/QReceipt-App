package com.example.qreceipt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Button sign_up_serve = findViewById(R.id.button_sign_up_serve);
        sign_up_serve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //todo: 가입 로직 처리
                finish();
            }
        });
    }
}