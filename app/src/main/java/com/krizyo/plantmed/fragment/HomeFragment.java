package com.krizyo.plantmed.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.krizyo.plantmed.R;
import com.krizyo.plantmed.adapter.RecyclerBlogsAdapter;
import com.krizyo.plantmed.adapter.RecyclerMarketPriceAdapter;
import com.krizyo.plantmed.adapter.RecyclerNewsAdapter;
import com.krizyo.plantmed.adapter.RecyclerVideosAdapter;
import com.krizyo.plantmed.model.MarketPriceModel;
import com.krizyo.plantmed.model.MixedModel;

import java.util.ArrayList;


public class HomeFragment extends Fragment
{

    RecyclerView recyclerview,recyclerview_news,recyclerview_blogs,recyclerview_videos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
         View view=inflater.inflate(R.layout.fragment_home, container, false);

         /*ID Define*/
        recyclerview=view.findViewById(R.id.recyclerview);
        recyclerview_news=view.findViewById(R.id.recyclerview_news);
        recyclerview_blogs=view.findViewById(R.id.recyclerview_blogs);
        recyclerview_videos=view.findViewById(R.id.recyclerview_videos);

        /*add layout manager*/
        recyclerview.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerview_news.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerview_blogs.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerview_videos.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));




        /*array list for recyclerview*/
        ArrayList<MarketPriceModel> list=new ArrayList<>();
        list.add(new MarketPriceModel("Bringal","Bhavnager","Rs 900/Q"));
        list.add(new MarketPriceModel("Ginger","Bhavnager","Rs 9000/Q"));
        list.add(new MarketPriceModel("Chille","Bhavnager","Rs 2000/Q"));
        list.add(new MarketPriceModel("Beetroot","Bhavnager","Rs 1300/Q"));

        ArrayList<MixedModel> news_list=new ArrayList<>();
        news_list.add(new MixedModel("Madhya Pradesh: Crops destroyed by dry August and excess September rain","27/09/2023",R.drawable.news1));
        news_list.add(new MixedModel("Govt aims 60% of wheat area under climate resilient varieties in rabi season amid El Nino fear","27/09/2023",R.drawable.news2));
        news_list.add(new MixedModel("Demo Title","23/09/2023",R.drawable.news1));
        news_list.add(new MixedModel("Demo Title","23/09/2023",R.drawable.news1));

        ArrayList<MixedModel> blogs_list=new ArrayList<>();
        blogs_list.add(new MixedModel("Demo Title","27/09/2023",R.drawable.blog1));
        blogs_list.add(new MixedModel("Demo Title","27/09/2023",R.drawable.blog2));
        blogs_list.add(new MixedModel("Demo Title","23/09/2023",R.drawable.blog1));
        blogs_list.add(new MixedModel("Demo Title","23/09/2023",R.drawable.blog1));

        ArrayList<MixedModel> videos_list=new ArrayList<>();
        videos_list.add(new MixedModel("Demo Title","23/09/2023",10));
        videos_list.add(new MixedModel("Demo Title","23/09/2023",10));
        videos_list.add(new MixedModel("Demo Title","23/09/2023",10));
        videos_list.add(new MixedModel("Demo Title","23/09/2023",10));


        /*set recycler subject adapter on recycler view*/
        RecyclerMarketPriceAdapter adapter = new RecyclerMarketPriceAdapter(getContext(),list);
        recyclerview.setAdapter(adapter);
        RecyclerNewsAdapter news_adapter=new RecyclerNewsAdapter(getContext(),news_list);
        recyclerview_news.setAdapter(news_adapter);
        RecyclerBlogsAdapter blogs_adapter=new RecyclerBlogsAdapter(getContext(),blogs_list);
        recyclerview_blogs.setAdapter(blogs_adapter);
        RecyclerVideosAdapter videos_adapter=new RecyclerVideosAdapter(getContext(),videos_list);
        recyclerview_videos.setAdapter(videos_adapter);





         return view;
    }
}