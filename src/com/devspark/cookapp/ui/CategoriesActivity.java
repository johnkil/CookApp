package com.devspark.cookapp.ui;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.MenuItem;
import com.devspark.cookapp.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;

public class CategoriesActivity extends SherlockFragmentActivity implements ActionBar.TabListener {
	private static final String LOG_TAG = CategoriesActivity.class.getSimpleName();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.v(LOG_TAG, "onCreate() called");
		super.onCreate(savedInstanceState);
		
		getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		String[] categories = getResources().getStringArray(R.array.categories);
		for (int i = 0; i < categories.length; i++) {
			ActionBar.Tab tab = getSupportActionBar().newTab();
			tab.setText(categories[i]);
			tab.setTabListener(this);
			getSupportActionBar().addTab(tab);
		}
		
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Log.v(LOG_TAG, "onOptionsItemSelected() called");
		switch (item.getItemId()) {
		case android.R.id.home:
			Intent homeIntent = new Intent(CategoriesActivity.this, HomeActivity.class);
			homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(homeIntent);
			break;

		default:
			return super.onOptionsItemSelected(item);
		}
		return true;
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

}
