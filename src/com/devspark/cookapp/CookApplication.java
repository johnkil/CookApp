package com.devspark.cookapp;

import android.app.Application;
import android.util.Log;

public class CookApplication extends Application {
	private static final String LOG_TAG = CookApplication.class.getSimpleName();
	
	@Override
	public void onCreate() {
		Log.v(LOG_TAG, "onCreate() called");
		super.onCreate();
	}

}
