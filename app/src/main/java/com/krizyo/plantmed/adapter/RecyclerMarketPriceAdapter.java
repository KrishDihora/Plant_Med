package com.krizyo.plantmed.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.krizyo.plantmed.R;
import com.krizyo.plantmed.model.MarketPriceModel;

import java.util.ArrayList;

public class RecyclerMarketPriceAdapter extends RecyclerView.Adapter<RecyclerMarketPriceAdapter.ViewHolder>
{

    Context context;
    ArrayList<MarketPriceModel> array=new ArrayList<>();

    public RecyclerMarketPriceAdapter(Context Context,ArrayList<MarketPriceModel> Array)
    {
        this.context=Context;
        this.array=Array;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(context).inflate(R.layout.market_price_layout,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.tv_veg_name.setText(array.get(position).getVeg_name());
        holder.tv_location.setText(array.get(position).getLocation_name());
        holder.tv_price.setText(array.get(position).getPrice());


    }

    @Override
    public int getItemCount() {
        return array.size();
    }

    public  class  ViewHolder extends RecyclerView.ViewHolder
    {

        TextView tv_veg_name,tv_location,tv_price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_veg_name=itemView.findViewById(R.id.tv_veg_name);
            tv_location=itemView.findViewById(R.id.tv_location);
            tv_price=itemView.findViewById(R.id.tv_price);
        }
    }
}
