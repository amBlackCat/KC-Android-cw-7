package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;



public class itemAdapter extends ArrayAdapter {

    List<Items> itemsList;

    public itemAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);

        itemsList = objects;


    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.item_row, parent, false);

        Items currentItem = itemsList.get(position);



        TextView itemNameView = view.findViewById(R.id.itemNameView);
        TextView itemPriceView = view.findViewById(R.id.itemPriceView);
        ImageView itemImgView = view.findViewById(R.id.itemImg);


        itemNameView.setText(currentItem.getItemName());
        itemPriceView.setText(String.valueOf(currentItem.getItemPrice()));
        itemImgView.setImageResource(currentItem.getItemImg());
        return view;




    }









}
