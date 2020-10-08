package com.example.student.th_t3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Student on 10/8/2020.
 */

public class ShopAdappter extends BaseAdapter {

    Context ctx;
    int layout_item;
    ArrayList<Shop> arrayList;

    public ShopAdappter(Context ctx, int layout_item, ArrayList<Shop> arrayList) {
        this.ctx = ctx;
        this.layout_item = layout_item;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(ctx).inflate(layout_item,parent,false);

        TextView tvname = (TextView) convertView.findViewById(R.id.name);
        TextView tvshopName = (TextView) convertView.findViewById(R.id.nameShop);
        ImageView img = (ImageView) convertView.findViewById(R.id.img);

        tvname.setText(arrayList.get(position).getName());
        tvshopName.setText(arrayList.get(position).getShopName());
        img.setImageResource(arrayList.get(position).getImg());
        return convertView;
    }
}
