package org.android.example.wizard;

import android.app.Activity;
import android.os.Bundle;

public class First extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

		setContentView(R.layout.first_screen);
    }
}
