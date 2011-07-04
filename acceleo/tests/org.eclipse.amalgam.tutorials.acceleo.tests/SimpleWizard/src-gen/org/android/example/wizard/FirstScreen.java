package org.android.example.wizard;

import android.app.Activity;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;

public class FirstScreen extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

		setContentView(R.layout.first_screen);
    }


	//.onClick
	public void goToSecondScreen(View view) {
	    startActivityForResult(new Intent(view.getContext(), SecondScreen.class), 0);
	}
}
