package com.ecs.google.maps.v2.actionbarsherlock;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;

public class SimpleSherlockFragmentActivity extends SherlockFragmentActivity {

	private SupportMapFragment mapFragment;
	private GoogleMap googleMap;

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.simple_sherlock_map_fragment);
		
		mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        googleMap = mapFragment.getMap();
        googleMap.setMyLocationEnabled(true);

	}
	
	  @Override
	  public boolean onCreateOptionsMenu(Menu menu) {
		  getSupportMenuInflater().inflate(R.menu.main_menu, menu);
	      return true;
	  } 
}
