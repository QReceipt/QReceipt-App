package com.example.qreceipt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainLogin extends AppCompatActivity {

    Intent sign_up = null;
    Intent ReceiptByYear = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        TextView button_sign_up = findViewById(R.id.button_sign_up);
        button_sign_up.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                sign_up = new Intent(getApplicationContext(), SignUp.class);
                startActivity(sign_up);
            }
        });

        Button button_sing_in = findViewById(R.id.button_sign_in);
        button_sing_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //todo: 로그인 로직 추가
                ReceiptByYear = new Intent(getApplicationContext(), ReceiptByYear.class);
                startActivity(ReceiptByYear);
                finish();
            }
        });
    }
}