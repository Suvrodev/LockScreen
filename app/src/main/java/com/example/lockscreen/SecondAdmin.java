package com.example.lockscreen;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class SecondAdmin extends DeviceAdminReceiver {

    @Override
    public void onEnabled(@NonNull Context context,  Intent intent) {
        //  super.onEnabled(context, intent);
        Toast.makeText(context,"Admin Enable",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onDisabled(@NonNull Context context, Intent intent) {
        // super.onDisabled(context, intent);
        Toast.makeText(context,"Admin Disable",Toast.LENGTH_LONG).show();
    }
}
