package com.example.mvvmpractice;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.mvvmpractice.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        setData();

        onClick();

    }

    private void onClick() {
        activityMainBinding.setEventHandler(new EventHandler());
    }

    private void setData() {
        activityMainBinding.setPerson(new Person("Khan Shaheb", 26, "Dhaka"));
    }
}
