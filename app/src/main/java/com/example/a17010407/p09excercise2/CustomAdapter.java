package com.example.a17010407.p09excercise2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<employeeStuff> Estuff;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<employeeStuff> objects) {
        super(context, resource, objects);
        this.parent_context = parent_context;
        this.layout_id = layout_id;
        this.Estuff = Estuff;

    }
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater infLater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = infLater.inflate(layout_id,parent,false);
        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvRole = rowView.findViewById(R.id.tvRole);
        TextView tvPay = rowView.findViewById(R.id.tvPay);

        employeeStuff currentItem = Estuff.get(position);
        tvName.setText(currentItem.getEname());
        tvRole.setText(currentItem.getErole());
        tvPay.setText(currentItem.getEpay());

        return rowView;
}
}
