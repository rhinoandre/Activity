package curso.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Button b = new Button(getApplicationContext());
		b.setText("Retornar");
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				setResult(100);
				finish();
			}
		});
		setContentView(b);
	}
}
