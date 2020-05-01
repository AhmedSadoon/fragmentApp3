package com.example.fragmentapp3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements connection{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void con(int i) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragB fragB= (FragB) fragmentManager.findFragmentById(R.id.fragment2);
        fragB.modfiyData(i);

    }
}
