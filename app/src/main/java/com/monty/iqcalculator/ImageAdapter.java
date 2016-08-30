package com.monty.iqcalculator;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by monty on 8/8/16.
 */
public class ImageAdapter extends BaseAdapter {
    private Context context;
    private final String[] Values;
    private int[] imageid;

    public ImageAdapter(Context context, String[] Values,int[] imageid) {
        this.context = context;
        this.Values = Values;
        this.imageid= imageid;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;
        gridView = convertView;

        if (convertView == null) {

            gridView = new View(context);

            // get layout from mobile.xml
            gridView = inflater.inflate(R.layout.itemlayout, null);
         }

          // set image based on selected text
            ImageView imageView = (ImageView) gridView.findViewById(R.id.imageView1);
            imageView.setImageResource(imageid[position]);

            // set value into textview
            TextView textView = (TextView) gridView
                    .findViewById(R.id.textView1);
            textView.setText(Values[position]);

        return gridView;
    }

    @Override
    public int getCount() {
        return Values.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

}