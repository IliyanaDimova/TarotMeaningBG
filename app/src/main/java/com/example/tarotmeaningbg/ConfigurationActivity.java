package com.example.tarotmeaningbg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ConfigurationActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT = "text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);

        Button celtic_cross = (Button)findViewById(R.id.celtic_cross);
        Button future_love_spread = (Button)findViewById(R.id.future_love_spread);

        celtic_cross.setOnClickListener(this);
        future_love_spread.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();


        Intent changeWidget = new Intent(getApplicationContext(), SpreadsWidget.class);
        switch(v.getId()) {
            case R.id.celtic_cross:
                editor.putString(TEXT, "celtic_spread");
                break;
            case R.id.future_love_spread:
                editor.putString(TEXT, "future_love_spread");
                break;
        }

        editor.apply();

        //Shows "Spread is set!" message
        Context context = getApplicationContext();
        CharSequence text = "Spread is set!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        //Goes to HomeScreen
        Intent startMain = new Intent(Intent.ACTION_MAIN);
        startMain.addCategory(Intent.CATEGORY_HOME);
        startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(startMain);
    }
}
