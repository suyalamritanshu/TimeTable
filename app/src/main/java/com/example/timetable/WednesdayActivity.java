package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.timetable.databinding.ActivityWednesdayBinding;

public class WednesdayActivity extends AppCompatActivity {
    ActivityWednesdayBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWednesdayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.pythonLab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://meet.google.com/lookup/dnnytwfbgf");

            }
        });
        binding.idve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://meet.google.com/mze-fwrh-qej");

            }
        });
        binding.oops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://meet.google.com/lookup/hxlm7dytnt");

            }
        });

        binding.dbmsLec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://meet.google.com/lookup/df5oib425t");

            }
        });

        binding.workshopLab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://meet.google.com/oon-wqwm-ggk");

            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

}