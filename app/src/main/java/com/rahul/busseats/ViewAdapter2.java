package com.rahul.busseats;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ViewAdapter2 extends RecyclerView.Adapter<ViewHolder2> {
    private List<String> objectList;

    ViewAdapter2(List<String> objectList) {
        this.objectList = objectList;
    }

    @NonNull
    @Override
    public ViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_2, parent, false);
        return new ViewHolder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder2 holder, int position) {
        String s = objectList.get(position);
        holder.setData(s);
    }

    @Override
    public int getItemCount() {
        return objectList.size();
    }
}
