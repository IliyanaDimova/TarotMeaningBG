package com.example.tarotmeaningbg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ReadCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_card);

        //TextView text = (TextView) findViewById(R.id.CardsMeaning);

        //Gets text for card's meaning
        String meaning = getIntent().getStringExtra("my_key");
        //Gets text for card's name
        String name = getIntent().getStringExtra("name");

        //Sets TextView for card's meaning
        TextView cardMeaning = (TextView)findViewById(R.id.CardsMeaning);
        cardMeaning.setText(meaning);

        //getActionBar().setTitle(name);
        getSupportActionBar().setTitle(name);

        //Sets Background image
        setBackground(name);
    }

    private void setBackground(String name){
        ImageView iv = (ImageView) findViewById(R.id.read_card_background);
        switch(name) {
            case "0  ГЛУПАКЪТ":
                iv.setBackgroundResource(R.drawable.ma_0);
                break;
            case "I  МАГЬОСНИКЪТ":
                iv.setBackgroundResource(R.drawable.ma_1);
                break;
            case "II  ВИСШАТА ЖРИЦА":
                iv.setBackgroundResource(R.drawable.ma_2);
                break;
            case "III  ИМПЕРАТРИЦАТА":
                iv.setBackgroundResource(R.drawable.ma_3);
                break;
            case "IV  ИМПЕРАТОРЪТ":
                iv.setBackgroundResource(R.drawable.ma_4);
                break;
            case "V  ЖРЕЦЪТ":
                iv.setBackgroundResource(R.drawable.ma_5);
                break;
            case "VI  ЛЮБОВНИЦИТЕ":
                iv.setBackgroundResource(R.drawable.ma_6);
                break;
            case "VII  КОЛЕСНИЦАТА":
                iv.setBackgroundResource(R.drawable.ma_7);
                break;
            case "VIII  СИЛА":
                iv.setBackgroundResource(R.drawable.ma_8);
                break;
            case "IX  ОТШЕЛНИКЪТ":
                iv.setBackgroundResource(R.drawable.ma_9);
                break;
            case "X  КОЛЕЛОТО НА СЪДБАТА":
                iv.setBackgroundResource(R.drawable.ma_10);
                break;
            case "XI  СПРАВЕДЛИВОСТ":
                iv.setBackgroundResource(R.drawable.ma_11);
                break;
            case "XII  ОБЕСЕНИЯТ":
                iv.setBackgroundResource(R.drawable.ma_12);
                break;
            case "XIII  СМЪРТ":
                iv.setBackgroundResource(R.drawable.ma_13);
                break;
            case "XIV  УМЕРЕНОСТ":
                iv.setBackgroundResource(R.drawable.ma_14);
                break;
            case "XV  ДЯВОЛЪТ":
                iv.setBackgroundResource(R.drawable.ma_15);
                break;
            case "XVI  КУЛАТА":
                iv.setBackgroundResource(R.drawable.ma_16);
                break;
            case "XVII  ЗВЕЗДАТА":
                iv.setBackgroundResource(R.drawable.ma_17);
                break;
            case "XVIII  ЛУНАТА":
                iv.setBackgroundResource(R.drawable.ma_18);
                break;
            case "XIX  СЛЪНЦЕТО":
                iv.setBackgroundResource(R.drawable.ma_19);
                break;
            case "XX  СТРАШНИЯТ СЪД":
                iv.setBackgroundResource(R.drawable.ma_20);
                break;
            case "XXI  СВЕТЪТ":
                iv.setBackgroundResource(R.drawable.ma_21);
                break;
            case "АСО ЖЕЗЛИ":
                iv.setBackgroundResource(R.drawable.w1);
                break;
            case "II ЖЕЗЛИ":
                iv.setBackgroundResource(R.drawable.w2);
                break;
            case "III ЖЕЗЛИ":
                iv.setBackgroundResource(R.drawable.w3);
                break;
            case "IV ЖЕЗЛИ":
                iv.setBackgroundResource(R.drawable.w4);
                break;
            case "V ЖЕЗЛИ":
                iv.setBackgroundResource(R.drawable.w5);
                break;
            case "VI ЖЕЗЛИ":
                iv.setBackgroundResource(R.drawable.w6);
                break;
            case "VII ЖЕЗЛИ":
                iv.setBackgroundResource(R.drawable.w7);
                break;
            case "VIII ЖЕЗЛИ":
                iv.setBackgroundResource(R.drawable.w8);
                break;
            case "IX ЖЕЗЛИ":
                iv.setBackgroundResource(R.drawable.w9);
                break;
            case "X ЖЕЗЛИ":
                iv.setBackgroundResource(R.drawable.w10);
                break;
            case "ПАЖ ЖЕЗЛИ":
                iv.setBackgroundResource(R.drawable.w11);
                break;
            case "РИЦАР ЖЕЗЛИ":
                iv.setBackgroundResource(R.drawable.w12);
                break;
            case "КРАЛИЦА ЖЕЗЛИ":
                iv.setBackgroundResource(R.drawable.w13);
                break;
            case "КРАЛ ЖЕЗЛИ":
                iv.setBackgroundResource(R.drawable.w14);
                break;
            case "АСО ЧАШИ":
                iv.setBackgroundResource(R.drawable.c1);
                break;
            case "II ЧАШИ":
                iv.setBackgroundResource(R.drawable.c2);
                break;
            case "III ЧАШИ":
                iv.setBackgroundResource(R.drawable.c3);
                break;
            case "IV ЧАШИ":
                iv.setBackgroundResource(R.drawable.c4);
                break;
            case "V ЧАШИ":
                iv.setBackgroundResource(R.drawable.c5);
                break;
            case "VI ЧАШИ":
                iv.setBackgroundResource(R.drawable.c6);
                break;
            case "VII ЧАШИ":
                iv.setBackgroundResource(R.drawable.c7);
                break;
            case "VIII ЧАШИ":
                iv.setBackgroundResource(R.drawable.c8);
                break;
            case "IX ЧАШИ":
                iv.setBackgroundResource(R.drawable.c9);
                break;
            case "X ЧАШИ":
                iv.setBackgroundResource(R.drawable.c10);
                break;
            case "ПАЖ ЧАШИ":
                iv.setBackgroundResource(R.drawable.c11);
                break;
            case "РИЦАР ЧАШИ":
                iv.setBackgroundResource(R.drawable.c12);
                break;
            case "КРАЛИЦА ЧАШИ":
                iv.setBackgroundResource(R.drawable.c13);
                break;
            case "КРАЛ ЧАШИ":
                iv.setBackgroundResource(R.drawable.c14);
                break;
            case "АСО МЕЧОВЕ":
                iv.setBackgroundResource(R.drawable.s1);
                break;
            case "II МЕЧОВЕ":
                iv.setBackgroundResource(R.drawable.s2);
                break;
            case "III МЕЧОВЕ":
                iv.setBackgroundResource(R.drawable.s3);
                break;
            case "IV МЕЧОВЕ":
                iv.setBackgroundResource(R.drawable.s4);
                break;
            case "V МЕЧОВЕ":
                iv.setBackgroundResource(R.drawable.s5);
                break;
            case "VI МЕЧОВЕ":
                iv.setBackgroundResource(R.drawable.s6);
                break;
            case "VII МЕЧОВЕ":
                iv.setBackgroundResource(R.drawable.s7);
                break;
            case "VIII МЕЧОВЕ":
                iv.setBackgroundResource(R.drawable.s8);
                break;
            case "IX МЕЧОВЕ":
                iv.setBackgroundResource(R.drawable.s9);
                break;
            case "X МЕЧОВЕ":
                iv.setBackgroundResource(R.drawable.s10);
                break;
            case "ПАЖ МЕЧОВЕ":
                iv.setBackgroundResource(R.drawable.s11);
                break;
            case "РИЦАР МЕЧОВЕ":
                iv.setBackgroundResource(R.drawable.s12);
                break;
            case "КРАЛИЦА МЕЧОВЕ":
                iv.setBackgroundResource(R.drawable.s13);
                break;
            case "КРАЛ МЕЧОВЕ":
                iv.setBackgroundResource(R.drawable.s14);
                break;
            case "АСО ПЕНТАКЛИ":
                iv.setBackgroundResource(R.drawable.p1);
                break;
            case "II ПЕНТАКЛИ":
                iv.setBackgroundResource(R.drawable.p2);
                break;
            case "III ПЕНТАКЛИ":
                iv.setBackgroundResource(R.drawable.p3);
                break;
            case "IV ПЕНТАКЛИ":
                iv.setBackgroundResource(R.drawable.p4);
                break;
            case "V ПЕНТАКЛИ":
                iv.setBackgroundResource(R.drawable.p5);
                break;
            case "VI ПЕНТАКЛИ":
                iv.setBackgroundResource(R.drawable.p6);
                break;
            case "VII ПЕНТАКЛИ":
                iv.setBackgroundResource(R.drawable.p7);
                break;
            case "VIII ПЕНТАКЛИ":
                iv.setBackgroundResource(R.drawable.p8);
                break;
            case "IX ПЕНТАКЛИ":
                iv.setBackgroundResource(R.drawable.p9);
                break;
            case "X ПЕНТАКЛИ":
                iv.setBackgroundResource(R.drawable.p10);
                break;
            case "ПАЖ ПЕНТАКЛИ":
                iv.setBackgroundResource(R.drawable.p11);
                break;
            case "РИЦАР ПЕНТАКЛИ":
                iv.setBackgroundResource(R.drawable.p12);
                break;
            case "КРАЛИЦА ПЕНТАКЛИ":
                iv.setBackgroundResource(R.drawable.p13);
                break;
            case "КРАЛ ПЕНТАКЛИ":
                iv.setBackgroundResource(R.drawable.p14);
                break;
        }
    }
}
