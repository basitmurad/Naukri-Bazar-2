package com.example.naukaribazar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;


import android.view.View;


import com.example.naukaribazar.databinding.ActivityFiltersBinding;

import java.util.ArrayList;

public class FiltersActivity extends AppCompatActivity {

    ActivityFiltersBinding binding;
    JobClassAdapter jobClassAdapter;
    ArrayList<JobClass> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFiltersBinding.inflate(getLayoutInflater()) ;
        setContentView(binding.getRoot());

        list = new ArrayList<>();
        list.add(new JobClass(R.drawable.back_image,"basit","graphic designing","2344","giglit","2h"));
        list.add(new JobClass(R.drawable.back_image,"basit","graphic designing","2344","giglit","2h"));
        list.add(new JobClass(R.drawable.back_image,"basit","graphic designing","2344","giglit","2h"));
        list.add(new JobClass(R.drawable.back_image,"basit","graphic designing","2344","giglit","2h"));
        list.add(new JobClass(R.drawable.back_image,"basit","graphic designing","2344","giglit","2h"));
        list.add(new JobClass(R.drawable.back_image,"basit","graphic designing","2344","giglit","2h"));
        list.add(new JobClass(R.drawable.back_image,"basit","graphic designing","2344","giglit","2h"));
        list.add(new JobClass(R.drawable.back_image,"basit","graphic designing","2344","giglit","2h"));
        list.add(new JobClass(R.drawable.back_image,"basit","graphic designing","2344","giglit","2h"));




        jobClassAdapter = new JobClassAdapter(this,list);
        binding.recyclerview.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerview.setAdapter(jobClassAdapter);




    }


    public void BackButton(View view) {
        finish();
    }
}