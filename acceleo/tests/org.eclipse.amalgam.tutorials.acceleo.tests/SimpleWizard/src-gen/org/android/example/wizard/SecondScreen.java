package org.android.example.wizard;

import android.app.Activity;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;

public class SecondScreen extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

		setContentView(R.layout.second_screen);
    }


	//.onClick
	public void goToFirstScreen(View view) {
	    startActivityForResult(new Intent(view.getContext(), FirstScreen.class), 0);
	}

	//.onClick
	public void goToThirdScreen(View view) {
	    startActivityForResult(new Intent(view.getContext(), ThirdScreen.class), 0);
	}
}
