package com.itheima52.moreclick;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	long[] mHits = new long[3];// 数组长度表示要点击的次数

	public void onClick(View view) {
		System.arraycopy(mHits, 1, mHits, 0, mHits.length - 1);
		mHits[mHits.length - 1] = SystemClock.uptimeMillis();// 开机后开始计算的时间
		if (mHits[0] >= (SystemClock.uptimeMillis() - 500)) {
			Toast.makeText(this, "是男人!!!", Toast.LENGTH_SHORT).show();
		}
	}
}
