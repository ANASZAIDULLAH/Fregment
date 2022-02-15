package com.example.fregment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fregment1 fregment1 = new Fregment1();
        getSupportFragmentManager().beginTransaction().add(R.id.fregment1,fregment1).commit();
    }
}