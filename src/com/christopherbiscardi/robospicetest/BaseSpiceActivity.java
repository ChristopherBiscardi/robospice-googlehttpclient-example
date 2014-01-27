package com.christopherbiscardi.robospicetest;

import com.octo.android.robospice.JacksonGoogleHttpClientSpiceService;
import com.octo.android.robospice.SpiceManager;

import android.app.Activity;

public class BaseSpiceActivity extends Activity {
	private SpiceManager spiceManager = new SpiceManager(JacksonGoogleHttpClientSpiceService.class);

	@Override
	protected void onStart() {
		spiceManager.start(this);
		super.onStart();
	}

	@Override
	protected void onStop() {
		spiceManager.shouldStop();
		super.onStop();
	}

	protected SpiceManager getSpiceManager() {
		return spiceManager;
	}

}
