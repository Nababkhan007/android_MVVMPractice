package com.example.mvvmpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import com.example.mvvmpractice.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;
    private String firstName, lastName, phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        onClick();

    }

    private void onClick() {
        activityMainBinding.showTextBtnId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPersonDetails();

                showPersonDetails();
            }
        });
    }

    @SuppressLint("SetTextI18n")
    private void showPersonDetails() {
        activityMainBinding.firstNameTvId.setText("");
        activityMainBinding.lastNameTvId.setText("");
        activityMainBinding.phoneNumberTvId.setText("");

        activityMainBinding.showDetailsTvId.setText(firstName + " "+lastName + "\n" + phoneNumber);
    }

    private void getPersonDetails() {
        firstName = activityMainBinding.firstNameTvId.getText().toString();
        lastName = activityMainBinding.lastNameTvId.getText().toString();
        phoneNumber = activityMainBinding.phoneNumberTvId.getText().toString();
    }
}
