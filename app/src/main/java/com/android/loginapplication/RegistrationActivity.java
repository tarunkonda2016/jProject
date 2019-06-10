package com.android.loginapplication;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.loginapplication.databinding.ActivityRegistrationBinding;

public class RegistrationActivity extends AppCompatActivity {
    private ActivityRegistrationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_registration);
        //setContentView(R.layout.activity_registration);
        DatabaseInitializer.populateAsync(AppDatabase.getAppDatabase(this));
        AppDatabase appDatabase= AppDatabase.getAppDatabase(this);

        addUser(appDatabase,new User(binding.edtName.getText().toString(),binding.edtPassword.getText().toString(),0));

        //
        //for logout option
        appDatabase.userDao().delete();
    }

    private  User addUser(final AppDatabase db, User user) {
        db.userDao().insertAll(user);
        return user;
    }




}
