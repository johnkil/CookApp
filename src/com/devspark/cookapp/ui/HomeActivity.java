package com.devspark.cookapp.ui;

import com.devspark.cookapp.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;

public class HomeActivity extends FragmentActivity {
	private static final String LOG_TAG = HomeActivity.class.getSimpleName();
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	Log.v(LOG_TAG, "onCreate() called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    
    public void onSelectCategory(View v) {
    	int category = Integer.parseInt((String) v.getTag());
    	Log.v(LOG_TAG, String.format("onSelectCategory() called: category=[%d]", category));
    	Intent intent = new Intent(HomeActivity.this, CategoriesActivity.class);
    	startActivity(intent);
    }
}