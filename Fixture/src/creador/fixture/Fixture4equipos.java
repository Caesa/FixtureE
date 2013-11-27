package creador.fixture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Fixture4equipos extends Activity {
	EditText txtNomeq1;
	EditText txtNomeq2;
	EditText txtNomeq3;
	EditText txtNomeq4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fixture4equipos);
		txtNomeq1 = (EditText) findViewById(R.id.txtNombreeq1);
		txtNomeq2 = (EditText) findViewById(R.id.txtNombreeq2);
		txtNomeq3 = (EditText) findViewById(R.id.txtNombreeq3);
		txtNomeq4 = (EditText) findViewById(R.id.txtNombreeq4);
	}
	
	public void crearfix4eq (View view){
		Intent i = new Intent(this, Fixture4equiposcreado.class);
		i.putExtra("nombreequipo1", txtNomeq1.getText().toString());
		i.putExtra("nombreequipo2", txtNomeq2.getText().toString());
		i.putExtra("nombreequipo3", txtNomeq3.getText().toString());
		i.putExtra("nombreequipo4", txtNomeq4.getText().toString());
		startActivity(i);
	}

	
}
