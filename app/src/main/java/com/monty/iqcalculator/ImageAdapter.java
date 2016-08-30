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

    //No of objects to be created and inflated in the gridview
    //Define distinctly all the elements even if it a list
    //Use simple arrayadapter incase of strings no need to form a custom adapter for that
    private Context context;
    private final String[] Values;
    private int[] imageid;

    public ImageAdapter(Context context, String[] Values,int[] imageid) {
        this.context = context;
        this.Values = Values;
        this.imageid= imageid;
    }

    //most important method
    //gets called while inflation
    //need to take care of the condition of the convertview
    //if convertview is null inflate it and then typecast the views and set text
    //Could have used VIEWHOLDER too but no need to make it complex
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