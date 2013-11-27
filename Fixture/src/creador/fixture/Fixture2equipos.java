package creador.fixture;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;

public class Fixture2equipos extends Activity {
	EditText txtNomeq1;
	EditText txtNomeq2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fixture2equipos);
		txtNomeq1 = (EditText) findViewById(R.id.txtNomeq1);
		txtNomeq2 = (EditText) findViewById(R.id.txtNomeq2);
	}

	public void ejecutar(View view){
		Intent i = new Intent(this, Fixture2equiposcreado.class);
		i.putExtra("nombreequipo1", txtNomeq1.getText().toString());
		i.putExtra("nombreequipo2", txtNomeq2.getText().toString());
		startActivity(i);
	}
}