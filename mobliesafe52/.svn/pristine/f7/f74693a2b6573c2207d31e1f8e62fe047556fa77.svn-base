package com.itheima52.location;

import java.util.List;

import android.app.Activity;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView tvLocation;
	private LocationManager lm;
	private MyLocationListener listener;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		tvLocation = (TextView) findViewById(R.id.tv_location);

		lm = (LocationManager) getSystemService(LOCATION_SERVICE);
		List<String> allProviders = lm.getAllProviders();// 获取所有位置提供者
		System.out.println(allProviders);

		listener = new MyLocationListener();
		lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, listener);// 参1表示位置提供者,参2表示最短更新时间,参3表示最短更新距离
	}

	class MyLocationListener implements LocationListener {

		// 位置发生变化
		@Override
		public void onLocationChanged(Location location) {
			String j = "经度:" + location.getLongitude();
			String w = "纬度:" + location.getLatitude();
			String accuracy = "精确度:" + location.getAccuracy();
			String altitude = "海拔:" + location.getAltitude();

			tvLocation
					.setText(j + "\n" + w + "\n" + accuracy + "\n" + altitude);
		}

		// 位置提供者状态发生变化
		@Override
		public void onStatusChanged(String provider, int status, Bundle extras) {
			System.out.println("onStatusChanged");
		}

		// 用户打开gps
		@Override
		public void onProviderEnabled(String provider) {
			System.out.println("onProviderEnabled");
		}

		// 用户关闭gps
		@Override
		public void onProviderDisabled(String provider) {
			System.out.println("onProviderDisabled");
		}

	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		lm.removeUpdates(listener);// 当activity销毁时,停止更新位置, 节省电量
	}

}
