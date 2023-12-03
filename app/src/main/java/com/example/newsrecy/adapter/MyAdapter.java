package com.example.newsrecy.adapter;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.newsrecy.R;
import com.example.newsrecy.model.Articles;
import com.example.newsrecy.ui.WebView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private List<Articles> itemList;
    private Context context;

    public MyAdapter(Context context,List<Articles> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.headline_list_items, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        final Articles item2 = itemList.get(position);



        ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams) holder.relativeLayout.getLayoutParams();
        layoutParams.setMargins(0, 0, 0, 10); // Adjust the margins as needed
        holder.relativeLayout.setLayoutParams(layoutParams);

holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(context, WebView.class);
        intent.putExtra("url",itemList.get(position).getUrl());
        context.startActivity(intent);
    }
});



        Articles item = itemList.get(position);
        holder.textViewItem.setText(item.getAuthor());
        holder.newsdescription.setText(item.getDescription());
        Glide.with(context)
                .load(item.getUrlToImage())
                .into(holder.newsImage);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}