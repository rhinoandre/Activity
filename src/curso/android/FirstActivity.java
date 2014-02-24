package curso.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FirstActivity extends Activity {
	private Button b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Log.i("FirstActivit", "Iniciando aplicação");
		Log.d("FirstActivit", "Mensagem de DEBUG");
		Log.e("FirstActivit", "Mensangem de ERROR");
		
		b = new Button(getApplicationContext());
		b.setText("Clique Aqui");
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), SecondActivity.class);
				i.putExtra("msg", "Boa tarde inutil");
				startActivityForResult(i, 1);
			}
		});
		setContentView(b);
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == 1) {
			b.setText("Novo Texto");
		}
	}
}
