package com.jayin.view;

import com.ljp.ani.R;

import android.app.Activity;

public class Test extends Activity {
	@Override
	protected void onChildTitleChanged(Activity childActivity,
			CharSequence title) {
		// TODO Auto-generated method stub
		super.onChildTitleChanged(childActivity, title);
		setContentView(R.layout.test);

	}
}
