package com.ranita.amqtt;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class MqttService extends Service {
    public static final String TAG = MqttService.class.getSimpleName();
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
