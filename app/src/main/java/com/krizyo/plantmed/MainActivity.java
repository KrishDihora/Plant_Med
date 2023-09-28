package com.krizyo.plantmed;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.QuickContactBadge;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.krizyo.plantmed.activity.SignupActivity;
import com.krizyo.plantmed.fragment.ChatFragment;
import com.krizyo.plantmed.fragment.CommunityFragment;
import com.krizyo.plantmed.fragment.CropsFragment;
import com.krizyo.plantmed.fragment.HomeFragment;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    BottomNavigationView bottom_navigation;
    ImageView iv_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*define id*/
        toolbar = findViewById(R.id.toolbar);
        bottom_navigation=findViewById(R.id.bottom_navigation);
        iv_profile=findViewById(R.id.iv_profile);

        /* Its needed to access toolbar or to work on it*/
        setSupportActionBar(toolbar);

        /*Define code of bottom navigation*/
        bottom_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                int id = item.getItemId();

                if (id == R.id.home)
                {
                    loadFragment(new HomeFragment(), 1);
                } else if (id == R.id.chat) {
                    loadFragment(new ChatFragment(),1);
                } else if (id == R.id.community) {
                    loadFragment(new CommunityFragment(),1);
                }else {
                    loadFragment(new CropsFragment(),1);
                }

                return true;
            }
        });
        bottom_navigation.setSelectedItemId(R.id.home);

        iv_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });




    }

    public void loadFragment(Fragment fragment, int flag) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if (flag == 0) {
            ft.add(R.id.framelayout, fragment);
            /* fm.popBackStack(R.id.home,FragmentManager.POP_BACK_STACK_INCLUSIVE);*/
            ft.commit();
        } else {
            ft.replace(R.id.framelayout, fragment);
            /*ft.addToBackStack(null);*/
            ft.commit();
        }
    }

}