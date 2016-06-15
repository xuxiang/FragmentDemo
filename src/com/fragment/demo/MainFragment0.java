package com.fragment.demo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragementdemo.R;

public class MainFragment0 extends BaseFragment {

	private static MainFragment0 ins = null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ins = MainFragment0.this;
	}

	public static MainFragment0 getInstance() {
		return ins;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.main_fragment0, container, false);
		return view;
	}

}
