package com.example.newsrecy.adapter;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newsrecy.R;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView textViewItem;
    public ImageView newsImage;
    public TextView newsdescription;
    public RelativeLayout relativeLayout;
    public ImageButton favourite;

    public MyViewHolder(View itemView) {

        super(itemView);
        textViewItem = itemView.findViewById(R.id.titleTextView);
        newsImage = itemView.findViewById(R.id.imageView);
        newsdescription = itemView.findViewById(R.id.textdescripion);


        relativeLayout = itemView.findViewById(R.id.relativeLayout);
    }
}
