package com.example.lab4ex1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DrinkActivity extends BaseAdapter {

    private Context context;
    private ArrayList<Drink_Item> items;

    public DrinkActivity(Context context, ArrayList<Drink_Item> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.food_item, parent, false);
        }
        // Get the current item
        Food_Item currentItem = (Food_Item) getItem(position);

        // Set the name
        TextView itemName = convertView.findViewById(R.id.foodname);
        itemName.setText(currentItem.getName());

        // Set the subdescription
        TextView itemDescription = convertView.findViewById(R.id.fooddes);
        itemDescription.setText(currentItem.getDescription());

        // Set the image
        ImageView itemImage = convertView.findViewById(R.id.foodimage);
        itemImage.setImageResource(currentItem.getImage());

//        Set the price
        TextView itemPrice = convertView.findViewById(R.id.foodprice);
        itemPrice.setText(currentItem.getPrice());

        return convertView;
    }
}
