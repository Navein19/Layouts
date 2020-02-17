package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RelativeLayout extends AppCompatActivity {

    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

        b1=findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener(){

                @Override

        public void onClick(View view)
        {
            Toast.makeText(getApplicationContext(),"HI LOGIN SUCCESSSFULL!!!!!!!",Toast.LENGTH_LONG).show();
        }

        });
    }
}
