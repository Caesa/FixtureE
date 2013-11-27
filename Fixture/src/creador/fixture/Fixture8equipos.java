package creador.fixture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Fixture8equipos extends Activity {
	EditText txtNomeq1;
	EditText txtNomeq2;
	EditText txtNomeq3;
	EditText txtNomeq4;
	EditText txtNomeq5;
	EditText txtNomeq6;
	EditText txtNomeq7;
	EditText txtNomeq8;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fixture8equipos);
		txtNomeq1 = (EditText) findViewById(R.id.txtNombreeq1f8);
		txtNomeq2 = (EditText) findViewById(R.id.txtNombreeq2f8);
		txtNomeq3 = (EditText) findViewById(R.id.txtNombreeq3f8);
		txtNomeq4 = (EditText) findViewById(R.id.txtNombreeq4f8);
		txtNomeq5 = (EditText) findViewById(R.id.txtNombreeq5f8);
		txtNomeq6 = (EditText) findViewById(R.id.txtNombreeq6f8);
		txtNomeq7 = (EditText) findViewById(R.id.txtNombreeq7f8);
		txtNomeq8 = (EditText) findViewById(R.id.txtNombreeq8f8);
	}
	
	public void crearfix8eq (View view){
		Intent i = new Intent(this, Fixture8equiposcreado.class);
		i.putExtra("nombreequipo1", txtNomeq1.getText().toString());
		i.putExtra("nombreequipo2", txtNomeq2.getText().toString());
		i.putExtra("nombreequipo3", txtNomeq3.getText().toString());
		i.putExtra("nombreequipo4", txtNomeq4.getText().toString());
		i.putExtra("nombreequipo5", txtNomeq5.getText().toString());
		i.putExtra("nombreequipo6", txtNomeq6.getText().toString());
		i.putExtra("nombreequipo7", txtNomeq7.getText().toString());
		i.putExtra("nombreequipo8", txtNomeq8.getText().toString());
		startActivity(i);
	}

	
}