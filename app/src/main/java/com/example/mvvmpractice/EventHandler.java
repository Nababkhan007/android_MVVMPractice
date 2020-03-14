package com.example.mvvmpractice;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class EventHandler {
    public void handleClick1(View view, Context context) {
        Toast.makeText(context, "Clicked", Toast.LENGTH_LONG).show();
    }

    public void handleClick2(Context context, String name) {
        Toast.makeText(context, name, Toast.LENGTH_LONG).show();
    }

    public void handleClick3(Context context, String age) {
        if (age.equals("23")) {
            Toast.makeText(context, "Oho, you are so younger!", Toast.LENGTH_LONG).show();

        } else if (age.equals("26")) {
            Toast.makeText(context, "You are elder from me!", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(context, age, Toast.LENGTH_LONG).show();
        }
    }

    public void handleClick4(Context context, String address) {
        Toast.makeText(context, address, Toast.LENGTH_LONG).show();
    }
}
