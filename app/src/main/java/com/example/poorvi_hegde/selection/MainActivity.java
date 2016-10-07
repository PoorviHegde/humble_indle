package com.example.poorvi_hegde.selection;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button)findViewById(R.id.clothes);
        Button b2 = (Button)findViewById(R.id.utensils);
        Button b3 = (Button)findViewById(R.id.food);
        Button b4 = (Button)findViewById(R.id.gadgets);
        Button b5 = (Button)findViewById(R.id.machines);
        Button b6 = (Button)findViewById(R.id.toiletaries);
        Button b7 = (Button)findViewById(R.id.toys);
        Button b8 = (Button)findViewById(R.id.vehicle);
        Button b9 = (Button)findViewById(R.id.blankets);


        assert b1 != null;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                startActivity(new Intent("android.intent.action.clothes"));
            }
        });

        assert b2 != null;
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg1){
                startActivity(new Intent("android.intent.action.utensils"));
            }
        });

        assert b3 != null;
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg2){
                startActivity(new Intent("android.intent.action.food"));
            }
        });

        assert b4 != null;
        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg3){
                startActivity(new Intent("android.intent.action.gadgets"));
            }
        });

        assert b5 !=null;
        b5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg4){
                startActivity(new Intent("android.intent.action.machines"));
            }
        });


        assert b6 !=null;
        b6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg5){
                startActivity(new Intent("android.intent.action.toiletaries"));
            }
        });

        assert b7 != null;
        b7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg6){
                startActivity(new Intent("android.intent.action.toys"));
            }
        });


        assert b8 != null;
        b8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg7){
                startActivity(new Intent("android.intent.action.vehicle"));
            }
        });

        assert b9 != null;
        b9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg8){
                startActivity(new Intent("android.intent.action.blankets"));
            }
        });





    }
}

