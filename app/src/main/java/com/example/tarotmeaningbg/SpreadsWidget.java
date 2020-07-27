package com.example.tarotmeaningbg;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.RemoteViews;

import static android.content.Context.MODE_PRIVATE;
import static com.example.tarotmeaningbg.ConfigurationActivity.SHARED_PREFS;
import static com.example.tarotmeaningbg.ConfigurationActivity.TEXT;

/**
 * Implementation of App Widget functionality.
 */
public class SpreadsWidget extends AppWidgetProvider {

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        for (int appWidgetId : appWidgetIds) {
            //Widget opens ConfigurationActivity when clicked
            Intent intent = new Intent(context, ConfigurationActivity.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);

            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.spreads_widget);
            remoteViews.setOnClickPendingIntent(R.id.widget, pendingIntent);

            //Shared Preferences
            SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
            String text = sharedPreferences.getString(TEXT, "");

            //Changes Widget's Background Image
            if(text=="celtic_spread"){
                remoteViews.setImageViewResource(R.id.backgroundImage, R.drawable.celtic_spread);
            }
            if(text=="future_love_spread"){
                remoteViews.setImageViewResource(R.id.backgroundImage, R.drawable.future_love_spred);
            }
            else remoteViews.setImageViewResource(R.id.backgroundImage, R.drawable.p1);

            appWidgetManager.updateAppWidget(appWidgetId, remoteViews);
        }
    }
}

