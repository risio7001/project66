package com.example.project66;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        findViewById(R.id.btn_forgot).setOnClickListener(onclickListener);
        findViewById(R.id.btn_login).setOnClickListener(onclickListener);
        findViewById(R.id.btn_signUp).setOnClickListener(onclickListener);
    }

    @SuppressLint("NonConstantResourceId")
    View.OnClickListener onclickListener = v -> {
      switch (v.getId()){
          case R.id.btn_forgot:
              Toast.makeText(this, "계정찾기", Toast.LENGTH_SHORT).show();
              break;
          case R.id.btn_login:
              Toast.makeText(this, "로그인", Toast.LENGTH_SHORT).show();
              break;
          case R.id.btn_signUp:
              Toast.makeText(this, "회원가입", Toast.LENGTH_SHORT).show();
              break;
      }
    };

}