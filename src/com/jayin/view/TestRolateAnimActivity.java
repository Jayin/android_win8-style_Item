package com.jayin.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.jayin.view.*;
import com.ljp.ani.R;
public class TestRolateAnimActivity extends Activity {
	MyImageView joke;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		joke = (MyImageView) findViewById(R.id.c_joke);
		joke.setOnClickIntent(new MyImageView.OnViewClick() {

			public void onClick() {
				Toast.makeText(TestRolateAnimActivity.this, "µã»÷ÊÂ¼þ....", 1000)
						.show();
				System.out.println("1");
				startActivity(new Intent(TestRolateAnimActivity.this,Test.class));
			}
		});
	}
}