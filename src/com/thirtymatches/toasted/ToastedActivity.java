package com.thirtymatches.toasted;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class ToastedActivity extends Activity {
	
	/**
	 * Example on how to use ToastExpander
	 * 1. Create a normal Toast using Toast.makeText
	 * 2. Hand this toast off to ToastExpander and define for how long to show it for
	 */
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Toast aToast = Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT);
        ToastExpander.showFor(aToast, 5000);
        
    }
}