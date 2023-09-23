package com.krizyo.plantmed.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.krizyo.plantmed.R;
import com.krizyo.plantmed.adapter.RecyclerMarketPriceAdapter;
import com.krizyo.plantmed.model.MarketPriceModel;

import java.util.ArrayList;


public class HomeFragment extends Fragment
{

    RecyclerView recyclerview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
         View view=inflater.inflate(R.layout.fragment_home, container, false);

         /*ID Define*/
        recyclerview=view.findViewById(R.id.recyclerview);

        /*add layout manager*/
        recyclerview.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        /*array list for recyclerview*/
        ArrayList<MarketPriceModel> list=new ArrayList<>();
        list.add(new MarketPriceModel("Bringal","Bhavnager","Rs 900/Q"));
        list.add(new MarketPriceModel("Ginger","Bhavnager","Rs 9000/Q"));
        list.add(new MarketPriceModel("Chille","Bhavnager","Rs 2000/Q"));
        list.add(new MarketPriceModel("Beetroot","Bhavnager","Rs 1300/Q"));

        /*set recycler subject adapter on recycler view*/
        RecyclerMarketPriceAdapter adapter = new RecyclerMarketPriceAdapter(getContext(),list);
        recyclerview.setAdapter(adapter);





         return view;
    }
}