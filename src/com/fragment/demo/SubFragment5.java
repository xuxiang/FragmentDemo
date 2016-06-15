package com.fragment.demo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragementdemo.R;

public class SubFragment5 extends BaseFragment {

	private static SubFragment5 ins = null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	public static SubFragment5 getInstance() {
		ins = new SubFragment5();
		return ins;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.sub_fragment5, container, false);
		return view;
	}


}
