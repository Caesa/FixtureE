package creador.fixture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Fixture16equipos extends Activity {
	EditText txtNomeq1;
	EditText txtNomeq2;
	EditText txtNomeq3;
	EditText txtNomeq4;
	EditText txtNomeq5;
	EditText txtNomeq6;
	EditText txtNomeq7;
	EditText txtNomeq8;
	EditText txtNomeq9;
	EditText txtNomeq10;
	EditText txtNomeq11;
	EditText txtNomeq12;
	EditText txtNomeq13;
	EditText txtNomeq14;
	EditText txtNomeq15;
	EditText txtNomeq16;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fixture16equipos);
		txtNomeq1 = (EditText) findViewById(R.id.txtNombreeq1f16);
		txtNomeq2 = (EditText) findViewById(R.id.txtNombreeq2f16);
		txtNomeq3 = (EditText) findViewById(R.id.txtNombreeq3f16);
		txtNomeq4 = (EditText) findViewById(R.id.txtNombreeq4f16);
		txtNomeq5 = (EditText) findViewById(R.id.txtNombreeq5f16);
		txtNomeq6 = (EditText) findViewById(R.id.txtNombreeq6f16);
		txtNomeq7 = (EditText) findViewById(R.id.txtNombreeq7f16);
		txtNomeq8 = (EditText) findViewById(R.id.txtNombreeq8f16);
		txtNomeq9 = (EditText) findViewById(R.id.txtNombreeq9f16);
		txtNomeq10 = (EditText) findViewById(R.id.txtNombreeq10f16);
		txtNomeq11 = (EditText) findViewById(R.id.txtNombreeq11f16);
		txtNomeq12 = (EditText) findViewById(R.id.txtNombreeq12f16);
		txtNomeq13 = (EditText) findViewById(R.id.txtNombreeq13f16);
		txtNomeq14 = (EditText) findViewById(R.id.txtNombreeq14f16);
		txtNomeq15 = (EditText) findViewById(R.id.txtNombreeq15f16);
		txtNomeq16 = (EditText) findViewById(R.id.txtNombreeq16f16);
	}
	
	public void crearfix16eq (View view){
		Intent i = new Intent(this, Fixture16equiposcreado.class);
		i.putExtra("nombreequipo1", txtNomeq1.getText().toString());
		i.putExtra("nombreequipo2", txtNomeq2.getText().toString());
		i.putExtra("nombreequipo3", txtNomeq3.getText().toString());
		i.putExtra("nombreequipo4", txtNomeq4.getText().toString());
		i.putExtra("nombreequipo5", txtNomeq5.getText().toString());
		i.putExtra("nombreequipo6", txtNomeq6.getText().toString());
		i.putExtra("nombreequipo7", txtNomeq7.getText().toString());
		i.putExtra("nombreequipo8", txtNomeq8.getText().toString());
		i.putExtra("nombreequipo9", txtNomeq9.getText().toString());
		i.putExtra("nombreequipo10", txtNomeq10.getText().toString());
		i.putExtra("nombreequipo11", txtNomeq11.getText().toString());
		i.putExtra("nombreequipo12", txtNomeq12.getText().toString());
		i.putExtra("nombreequipo13", txtNomeq13.getText().toString());
		i.putExtra("nombreequipo14", txtNomeq14.getText().toString());
		i.putExtra("nombreequipo15", txtNomeq15.getText().toString());
		i.putExtra("nombreequipo16", txtNomeq16.getText().toString());
		startActivity(i);
	}

	
}
