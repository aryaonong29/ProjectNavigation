package com.arianasp.projectnavigation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Ariana on 9/11/2016.
 */
public class Contact extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);
    }

    public static void startThisActivity(Context context){
        Intent i = new Intent(context,Contact.class);
        context.startActivity(i);
    }
}
