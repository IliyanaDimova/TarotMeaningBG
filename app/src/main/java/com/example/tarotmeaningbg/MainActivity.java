package com.example.tarotmeaningbg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonMajorArcana = (Button) findViewById(R.id.buttonMajorArcana);
        buttonMajorArcana.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent MajorArcana = new Intent(getApplicationContext(), MajorArcana.class);
                startActivity(MajorArcana);
            }
        });

        Button buttonMinorArcana = (Button) findViewById(R.id.buttonMinorArcana);
        buttonMinorArcana.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent MinorArcana = new Intent(getApplicationContext(), MinorArcana.class);
                startActivity(MinorArcana);
            }
        });
    }
}
