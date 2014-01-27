package com.christopherbiscardi.robospicetest;

import com.christopherbiscardi.robospicetest.R;
import com.octo.android.robospice.persistence.DurationInMillis;
import com.octo.android.robospice.persistence.exception.SpiceException;
import com.octo.android.robospice.request.listener.RequestListener;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends BaseSpiceActivity {
	
	private SpiceRequestReddit spiceRequestReddit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		spiceRequestReddit = new SpiceRequestReddit( "Riak" );
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	protected void onStart() {
		super.onStart();

		setProgressBarIndeterminate( false );
		setProgressBarVisibility( true );

		getSpiceManager().execute( spiceRequestReddit, "json", DurationInMillis.ONE_MINUTE, new RedditSpiceRequestListener() );
	}

	// ============================================================================================
	// INNER CLASSES
	// ============================================================================================

	public final class RedditSpiceRequestListener implements RequestListener< Reddit > {

		@Override
		public void onRequestFailure( SpiceException spiceException ) {
			Toast.makeText( MainActivity.this, "failure", Toast.LENGTH_SHORT ).show();
		}

		@Override
		public void onRequestSuccess( final Reddit result ) {
			Toast.makeText( MainActivity.this, "success", Toast.LENGTH_SHORT ).show();
			Log.e("TEST",result.toString());
			Log.e("TEST",result.getData().getChildren().get(0).getData().getTitle());

		}
	}
	
}
