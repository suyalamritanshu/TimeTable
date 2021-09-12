package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.timetable.databinding.ActivityTuesdayBinding;
import com.example.timetable.databinding.ActivityWednesdayBinding;

public class TuesdayActivity extends AppCompatActivity {

    ActivityTuesdayBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTuesdayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.dbmsLab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://meet.google.com/lookup/ek7khgw6to?authuser=0&hs=179");

            }
        });
        binding.pythonLecture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://meet.google.com/vqb-vrah-dny");

            }
        });

        binding.ps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://meet.google.com/lookup/eoq72v3ro4?authuser=0&hs=179");

            }
        });

        binding.oopsLab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://meet.google.com/lookup/ez5a2hp6s5?authuser=0&hs=179");

            }
        });


    }


    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}