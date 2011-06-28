package com.example.android.hellodroid;

import android.app.Activity;
import android.os.Bundle;

public class HelloDroid extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

		setContentView(R.layout.hellodroid_screen);
    }
}
