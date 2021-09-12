package com.rahul.busseats;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder2 extends RecyclerView.ViewHolder {
    private TextView seat;

    public ViewHolder2(@NonNull View itemView) {
        super(itemView);
        seat = itemView.findViewById(R.id.seatNumber2);
    }

    public void setData(String s) {
        seat.setText(s);
    }
}
