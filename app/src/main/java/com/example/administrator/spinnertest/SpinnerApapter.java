package com.example.administrator.spinnertest;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class SpinnerApapter extends BaseAdapter {
    private LayoutInflater inflater;
    private ArrayList<coloritem> colors;


    public SpinnerApapter(Context c, ArrayList<coloritem> colors) {
        inflater = (LayoutInflater) c.getSystemService(c.LAYOUT_INFLATER_SERVICE);
        this.colors = colors;
    }
    @Override
    public int getCount() {
        return colors.size();
    }

    @Override
    public Object getItem(int position) {
        return colors.get(position);
    }

    @Override
    public long getItemId(int position) {
        return colors.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        coloritem colorItem = (coloritem) getItem(position);
        View v = inflater.inflate(R.layout.color_view,null);
        ImageView ticket = v.findViewById(R.id.imageView);
        TextView color_name = v.findViewById(R.id.color);
        ticket.setBackgroundColor(Color.parseColor(colorItem.code));
        color_name.setText(colorItem.color);
        return v;
    }
}
