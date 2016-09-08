package com.james.li.mvvmexample.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.james.li.mvvmexample.R;
import com.james.li.mvvmexample.databinding.ActivityMainBinding;
import com.james.li.mvvmexample.view_model.MainViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(new MainViewModel(binding));
    }
}
