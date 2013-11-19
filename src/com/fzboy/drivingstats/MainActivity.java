package com.fzboy.drivingstats;

import java.util.List;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.util.Log;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		m_sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
		List<Sensor> deviceSensors = m_sensorManager.getSensorList(Sensor.TYPE_ACCELEROMETER);
		for (int i = 0; i < deviceSensors.size(); ++i)
		{
			Log.d("Sensor List", deviceSensors.get(i).getName());
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private SensorManager m_sensorManager;

}
