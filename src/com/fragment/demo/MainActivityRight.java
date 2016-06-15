package com.fragment.demo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.example.fragementdemo.R;

public class MainActivityRight extends FragmentActivity {

	private final String[] titles = new String[] { "按钮1", "按钮2", "按钮3", "按钮4" };
	private final Integer[] icons = new Integer[] { R.drawable.app_host_img0_selector, R.drawable.app_host_img1_selector,
			R.drawable.app_host_img2_selector, R.drawable.app_host_img3_selector };
	private final Integer[] fragments = new Integer[] { R.id.fragment0, R.id.fragment1, R.id.fragment2, R.id.fragment3 };
	private final String[] tabs = new String[] { "tab0", "tab1", "tab2", "tab3" };

	private TabHost tabHost;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main_right);

		tabHost = (TabHost) findViewById(android.R.id.tabhost);
		tabHost.setup();

		for (int i = 0; i < titles.length; i++) {
			View view = LayoutInflater.from(this).inflate(R.layout.tab_item, null);
			((ImageView) view.findViewById(R.id.tab_image)).setBackgroundResource(icons[i]);
			((TextView) view.findViewById(R.id.tab_text)).setText(titles[i]);
			tabHost.addTab(tabHost.newTabSpec(tabs[i]).setIndicator(view).setContent(fragments[i]));
		}

		tabHost.setCurrentTab(this.getIntent().getIntExtra("tab", 0));
	}

}
