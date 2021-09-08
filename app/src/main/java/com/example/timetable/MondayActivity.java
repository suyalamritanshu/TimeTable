package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.timetable.databinding.ActivityMondayBinding;

public class MondayActivity extends AppCompatActivity {

    ActivityMondayBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMondayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();


        binding.pythonLab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://meet.google.com/lookup/dnnytwfbgf?authuser=0&hs=179");

            }
        });
        binding.idve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://meet.google.com/lookup/holnfmbn3z?authuser=0&hs=179");

            }
        });
        binding.oops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://meet.google.com/lookup/hxlm7dytnt?authuser=0&hs=179");

            }
        });

        binding.dbmsLec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://meet.google.com/lookup/df5oib425t?authuser=0&hs=179");

            }
        });

        binding.workshopLab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://meet.google.com/lookup/a5v6urijaq?authuser=0&hs=179");

            }
        });


    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}