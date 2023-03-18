package com.example.naukaribazar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ListAdapter;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import com.example.naukaribazar.databinding.ActivityMainBinding;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    String [] arrays12 = {"Select Skill","ui/ux design","graphic Design","web development","wordpress developer"};
    String [] arrays121 = {"Select Skill","ui/ux design","graphic Design","web development","wordpress developer"};
   ArrayList<String> list ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());


        binding.btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openBottomMenu();
            }
        });
        list = new ArrayList<>();

        list.add("part time");
        list.add("part time");
        list.add("part time");
        list.add("part time");
        list.add("part time");
        list.add("part time");
        list.add(" show more");


    }
    @SuppressLint("MissingInflatedId")
    private void openBottomMenu() {

BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(MainActivity.this,R.style.BottomSheetStyle1);

View view = LayoutInflater.from(this).inflate(R.layout.bottom_second_sheet,null,false);

//Spinner spinner = view.findViewById(R.id.categorySpinner);
//
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,arrays12);
//        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
//
//        spinner.setAdapter(arrayAdapter);
//
//
//
//        Spinner spinner1 = view.findViewById(R.id.subCategorySpinner);
//        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,arrays121);
//        arrayAdapter1.setDropDownViewResource( android.R.layout.simple_spinner_item);
//        spinner1.setAdapter(arrayAdapter1);









        bottomSheetDialog.setContentView(view);
        bottomSheetDialog.show();

    }
}