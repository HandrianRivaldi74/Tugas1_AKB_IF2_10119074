package com.example.tugas1_akb_if2_10119074;
/**
    NIM : 10119074
    NAMA : HANDRIAN RIVALDI
    KELAS : IF2
    TANGGAL : 4/23/2022
    Membuat Login Activity
*/
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private Button btnLogin;
    private EditText etUsername,etPassword;
    private String username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void initView(){
        btnLogin = findViewById(R.id.btn_login);
        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        initView();
        setData();

    }

    public void setData(){

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                username = etUsername.getText().toString();
                password = etPassword.getText().toString();
                //action
                Intent intent = new Intent( LoginActivity.this, MainActivity.class );
                intent.putExtra(  "usename", username);
                intent.putExtra(  "password", password);
                startActivity(intent);
            }
        });
    }
}