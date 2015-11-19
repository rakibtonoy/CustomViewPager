package com.androidbegin.viewpagertutorial;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
 
public class MainActivity extends Activity {
 
	// Declare Variables
	ViewPager viewPager;
	PagerAdapter adapter;
	String[] rank;
	int[] flag;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Get the view from viewpager_main.xml
		setContentView(R.layout.viewpager_main);
 
		// Generate sample data
		rank = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
 
		flag = new int[] { R.drawable.china, R.drawable.india,
				R.drawable.unitedstates, R.drawable.indonesia,
				R.drawable.brazil, R.drawable.pakistan, R.drawable.nigeria,
				R.drawable.bangladesh, R.drawable.russia, R.drawable.japan };
 
		// Locate the ViewPager in viewpager_main.xml
		viewPager = (ViewPager) findViewById(R.id.pager);
		// Pass results to ViewPagerAdapter Class
		adapter = new ViewPagerAdapter(MainActivity.this, rank, flag);
		// Binds the Adapter to the ViewPager
		viewPager.setAdapter(adapter);
 
	}
}