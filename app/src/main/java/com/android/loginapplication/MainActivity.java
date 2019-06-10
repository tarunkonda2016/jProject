package com.android.loginapplication;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private com.android.loginapplication.databinding.ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

//        setContentView(R.layout.activity_main);
    }
    public void signUP(View view){
        startActivity(new Intent(this,RegistrationActivity.class));
    }

}
