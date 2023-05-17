package com.example.hl_3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    DatabaseHelper databaseHelper;

    EditText et_username, et_password, et_cpassword;
    Button btn_register, btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        databaseHelper = new DatabaseHelper(Register.this);
        et_username = (EditText)findViewById(R.id.et_username);
        et_password = (EditText)findViewById(R.id.et_password);
        et_cpassword = (EditText)findViewById(R.id.et_cpassword);
        btn_register = (Button)findViewById(R.id.btn_register);
        btn_login = (Button)findViewById(R.id.btn_login);

        // кнопка перехода на экран логина
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this, Login.class);

                startActivity(intent);
            }
        });


        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //считываем с полей ввода
                String username = et_username.getText().toString();
                String password = et_password.getText().toString();
                String confirm_password = et_cpassword.getText().toString();


            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}