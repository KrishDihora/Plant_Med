package com.krizyo.plantmed.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.krizyo.plantmed.R;
import com.krizyo.plantmed.model.MixedModel;

import java.util.ArrayList;

public class RecyclerVideosAdapter extends RecyclerView.Adapter<RecyclerVideosAdapter.ViewHolder>
{
    Context context;
    ArrayList<MixedModel> array=new ArrayList<>();

    public  RecyclerVideosAdapter(Context Context,ArrayList<MixedModel> Array)
    {
        this.context=Context;
        this.array=Array;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(context).inflate(R.layout.mixed_layout,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.description.setText(array.get(position).getDescription());
        holder.date.setText(array.get(position).getDate());

    }

    @Override
    public int getItemCount() {
        return array.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView image;
        TextView description,date;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            description=itemView.findViewById(R.id.tv_description);
            date=itemView.findViewById(R.id.tv_date);
            image=itemView.findViewById(R.id.iv_image);
        }
    }
}
