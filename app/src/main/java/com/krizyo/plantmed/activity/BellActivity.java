package com.krizyo.plantmed.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.krizyo.plantmed.R;

public class BellActivity extends AppCompatActivity {

    ImageView back;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bell);

        /*define id*/
        toolbar=findViewById(R.id.toolbar);
        back=findViewById(R.id.back);

        /*activate toolbar*/
        setSupportActionBar(toolbar);

        /*      set on click listener on back button*/
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* Intent home=new Intent(BellActivity.this,MainActivity.class);
                startActivity(home);*/
                finish();

            }
        });
    }
}