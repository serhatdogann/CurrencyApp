package com.example.currencyapp.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.currencyapp.Model.Currency;
import com.example.currencyapp.R;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter <RecyclerAdapter.MyViewHolder>{

    public RecyclerAdapter(ArrayList<Currency> currencyArrayList) {
        this.currencyArrayList = currencyArrayList;
    }

    private ArrayList<Currency>currencyArrayList;


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_currency,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Currency currency = currencyArrayList.get(position);
        holder.buyCurrency.setText(String.valueOf(currency.getBuyText()));
        holder.sellCurrency.setText(String.valueOf(currency.getSellText()));
        holder.imgFlag.setImageResource(currency.getLogo());

    }

    @Override
    public int getItemCount() {
        return currencyArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView buyCurrency;
        TextView sellCurrency;
        ImageView imgFlag;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFlag=itemView.findViewById(R.id.imageView);
            buyCurrency=itemView.findViewById(R.id.textView);
            sellCurrency=itemView.findViewById(R.id.textView2);
        }
    }
}
