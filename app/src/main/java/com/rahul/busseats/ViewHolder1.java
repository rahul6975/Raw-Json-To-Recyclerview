package com.rahul.busseats;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder1 extends RecyclerView.ViewHolder {
    private TextView seat;

    public ViewHolder1(@NonNull View itemView) {
        super(itemView);
        seat = itemView.findViewById(R.id.seatNumber1);
    }

    public void setData(String s) {
        seat.setText(s);
    }
}
