package nu.annat.statusbartest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	private static final boolean SHOW_UNDER_STATUS_BUT_RESCALE_FAILS = true;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (SHOW_UNDER_STATUS_BUT_RESCALE_FAILS) {
			getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
		}
		setContentView(R.layout.activity_main);
	}
}
