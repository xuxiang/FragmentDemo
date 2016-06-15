package com.fragment.demo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragementdemo.R;

public class MainFragment1 extends BaseFragment {

	private static MainFragment1 ins = null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ins = MainFragment1.this;
	}

	public static MainFragment1 getInstance() {
		return ins;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.main_fragment1, container, false);
		PagerSlidingTabStrip tab = (PagerSlidingTabStrip)view.findViewById(R.id.tabs);
		ViewPager pager = (ViewPager) view.findViewById(R.id.pager);
		MyPagerAdapter adapter = new MyPagerAdapter(getFragmentManager());
		pager.setAdapter(adapter);
		tab.setViewPager(pager);
		return view;
	}
	
	public class MyPagerAdapter extends FragmentPagerAdapter {

		private final String[] TITLES = { "SubFragment0", "SubFragment1", "SubFragment2", 
				"SubFragment3", "SubFragment4", "SubFragment5",
				"SubFragment6"};

		public MyPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public CharSequence getPageTitle(int position) {
			return TITLES[position];
		}

		@Override
		public int getCount() {
			return TITLES.length;
		}

		@Override
		public Fragment getItem(int position) {
			if (0 == position){
				return SubFragment0.getInstance();
			} else if (1 == position){
				return SubFragment1.getInstance();
			} else if (2 == position){
				return SubFragment2.getInstance();
			} else if (3 == position){
				return SubFragment3.getInstance();
			} else if (4 == position){
				return SubFragment4.getInstance();
			} else if (5 == position){
				return SubFragment5.getInstance();
			} else if (6 == position){
				return SubFragment6.getInstance();
			} else{
				return SubFragment0.getInstance();
			}
		}

	}

}
