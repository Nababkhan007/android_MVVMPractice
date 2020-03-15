package com.example.mvvmpractice;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.mvvmpractice.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        setData();

        onClick();

        Person khan = new Person("Khan", 23, "Mirpur");
        List<Person> personList = new ArrayList<>();
        personList.add(khan);

        Map<String, Integer> personMap = new HashMap<>();
        personMap.put(khan.getPersonName(), khan.getPersonAge());

        activityMainBinding.setPersons(personList);
        activityMainBinding.setPersonMap(personMap);
    }

    private void onClick() {
        activityMainBinding.setEventHandler(new EventHandler());
    }

    private void setData() {
        activityMainBinding.setPerson(new Person(null, 26, "Dhaka"));
    }
}
