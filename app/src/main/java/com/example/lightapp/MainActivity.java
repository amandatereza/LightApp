package com.example.lightapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostaMensagem(View view) {
        intent intent = new intent (this, mostra mensagem.class);
        startMostraMensagem(intent)
    }

    NotificationChannel channel = new NotificationChannel ("meu_canal_id","meu_canal_id"
            otificationManager.IMPORTANCE_DEFAULT);
NotificationManager nm = (NotificationManager) getSystemService (Context . NOTIFICATION_SERVICE);
nm.createNotificationChannel (channel);
}

