package com.example.ud2_9intercambiodemensajesdetextosms;

import static com.example.ud2_9intercambiodemensajesdetextosms.MainActivity.tv;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.util.Log;

public class MySmSReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getAction() == Telephony.Sms.Intents.SMS_RECEIVED_ACTION) {
            for(SmsMessage message : Telephony.Sms.Intents.getMessagesFromIntent(intent)) {

                tv.setText(message.getDisplayMessageBody());

            }
        }

    }
}
