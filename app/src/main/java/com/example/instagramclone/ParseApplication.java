package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("jMAXadq1YCxyIiHpnI18sJSwBOxx8N0nPT2Gtyqm")
                .clientKey("uJIvni0Da2uPMAuzSImStaQ4kNJy62FYXqh4m4rC")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
