package com.github.javiersantos.appupdater;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class NotificationReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        new LibraryPreferences(context).setAppUpdaterShow(false);
    }
}
