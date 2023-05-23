package com.example.ovarious;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<data_list> userlist;

    public Adapter(List<data_list>userlist){
        this.userlist = userlist;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.blueprint_layout , parent , false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int saal = userlist.get(position).getYears();
        holder.setData(saal);
    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView years;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            years =itemView.findViewById(R.id.year);
        }

        public void setData(int years1) {
            years.setText(years1);
        }
    }
}
