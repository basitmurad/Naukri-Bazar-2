package com.example.naukaribazar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class GridItemAdapter extends RecyclerView.Adapter<GridItemAdapter.MyHolder> {
    private Context context;
    private ArrayList<String> list;



    public GridItemAdapter(Context context, ArrayList<String> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public GridItemAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


            View view = LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.grid_item_layout,parent,false);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridItemAdapter.MyHolder holder, int position) {

        holder.textView.setText(list.get(position));

    }
    public void addData(List<String> newData) {
        int startPosition = list.size();
        list.addAll(newData);
        notifyItemRangeInserted(startPosition, newData.size());
    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textAdapter);
        }
    }
}
