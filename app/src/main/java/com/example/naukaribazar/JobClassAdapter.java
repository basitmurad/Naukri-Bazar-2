package com.example.naukaribazar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;

public class JobClassAdapter extends RecyclerView.Adapter<JobClassAdapter.MyHolder> {

    private Context context;
    private ArrayList<JobClass> list;

    public JobClassAdapter(Context context, ArrayList<JobClass> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public JobClassAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.job_layout, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull JobClassAdapter.MyHolder holder, int position) {

        JobClass jobClass = list.get(position);
        holder.imageUrl.setImageResource(jobClass.getImageUrl());
        holder.name.setText(jobClass.getName());
        holder.skill.setText(jobClass.getSkill());
        holder.amount.setText(jobClass.getAmount());
        holder.location.setText(jobClass.getLocation());
        holder.time.setText(jobClass.getTime());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context.getApplicationContext(), R.style.BottomSheetStyle);
                View view = LayoutInflater.from(context).inflate(R.layout.bottom_sheet_layout, null, false);
//
                int position = holder.getAdapterPosition();
//
                Toast.makeText(context, "position" + position, Toast.LENGTH_SHORT).show();


                bottomSheetDialog.setContentView(view);
                bottomSheetDialog.show();

            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder  {
        TextView name, skill, amount, location, time;
        ImageView imageUrl;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            imageUrl = itemView.findViewById(R.id.imageView2);
            name = itemView.findViewById(R.id.textView_name);
            skill = itemView.findViewById(R.id.textView_skills);
            amount = itemView.findViewById(R.id.textView_amount);
            location = itemView.findViewById(R.id.textView_location);
            time = itemView.findViewById(R.id.textView_timePeriod);




        }




    }
}
