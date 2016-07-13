package com.itheima52.doubleclick;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
/**
 * 模拟双击事件
 * @author Kevin
 *
 */
public class MainActivity extends Activity {

	private long firstClickTime;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void onClick(View view) {
		if (firstClickTime > 0) {// 发现之前点击过一次
			if (System.currentTimeMillis() - firstClickTime < 500) {// 判断两次点击是否小于500毫秒
				Toast.makeText(this, "双击啦!", Toast.LENGTH_SHORT).show();
				firstClickTime = 0;//重置时间, 重新开始
				return;
			}
		}

		firstClickTime = System.currentTimeMillis();
	}
}
