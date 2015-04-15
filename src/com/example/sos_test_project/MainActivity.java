package com.example.sos_test_project;

import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

//Extending ActoinBar Activity enables App Compatibility
public class MainActivity extends ActionBarActivity implements OnClickListener {

	ImageView imageview;	//An Image view to show a picture
	boolean mDualPane;		//This can be a boolean check for landscape / or large screen sizes.
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);//XML layout to show
		
		imageview = (ImageView) findViewById(R.id.theimage);
		imageview.setBackgroundResource(R.drawable.bear);
		imageview.setOnClickListener(this);
		
		
		//We overrode the native toolbar, so lets add this customizable one.
		Toolbar toolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);
		setSupportActionBar(toolbar);
		getSupportActionBar().setTitle("Im the Toolbar!");

		
		//Fragment manager handles transition between different fragments
		//getSupportFragmentManager().beginTransaction()
		//.add(R.id.main_fragment_container, new Fragment()).commit();
		
		Toast.makeText(this, "Hello Android. Click on the Image...", Toast.LENGTH_SHORT).show();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		//Menu button functionality, Customize main.xml in menu folder to edit
		getMenuInflater().inflate(R.menu.main, menu);	
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		
		//Show toast when clicked
		Toast.makeText(this, "I gotta get to sleep....", Toast.LENGTH_SHORT).show();
		
	}

	/*
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}*/
}
