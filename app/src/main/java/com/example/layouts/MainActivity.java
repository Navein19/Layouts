package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.bt1);
        b2=findViewById(R.id.bt2);
        b3=findViewById(R.id.bt3);
        b4=findViewById(R.id.bt4);
        b5=findViewById(R.id.bt5);


        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent in = new Intent(MainActivity.this, LinearLayoutC.class);
                startActivity(in);
            }
        });


        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent in = new Intent(MainActivity.this, LinerLayoutH.class);
                startActivity(in);
            }
        });


        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent in = new Intent(MainActivity.this, FrameLayout.class);
                startActivity(in);
            }
        });


        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent in = new Intent(MainActivity.this, RelativeLayout.class);
                startActivity(in);
            }
        });


        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent in = new Intent(MainActivity.this, GridLayout.class);
                startActivity(in);
            }
        });
    }


}
