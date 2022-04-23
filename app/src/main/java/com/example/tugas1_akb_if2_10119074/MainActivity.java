package com.example.tugas1_akb_if2_10119074;
/**
    NIM : 10119074
    NAMA : HANDRIAN RIVALDI
    KELAS : IF2
    TANGGAL : 4/23/2022
    Membuat Main Activity
*/
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tVUsername, tVPassword;
    private String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void initView(){

    }

    public void setData(){
        Intent intent = getIntent();
        username = intent.getStringExtra( "username");
        password = intent.getStringExtra( "password");

        tVUsername.setText(username);
        tVPassword.setText(password);
    }
}