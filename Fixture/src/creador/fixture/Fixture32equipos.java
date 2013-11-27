package creador.fixture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Fixture32equipos extends Activity {
	EditText txtNomeq1, txtNomeq2, txtNomeq3, txtNomeq4, txtNomeq5, txtNomeq6, txtNomeq7, txtNomeq8, txtNomeq9, txtNomeq10, txtNomeq11, txtNomeq12, txtNomeq13, txtNomeq14, txtNomeq15, txtNomeq16, txtNomeq17, txtNomeq18, txtNomeq19, txtNomeq20, txtNomeq21, txtNomeq22, txtNomeq23, txtNomeq24, txtNomeq25, txtNomeq26, txtNomeq27, txtNomeq28, txtNomeq29, txtNomeq30, txtNomeq31, txtNomeq32;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fixture32equipos);
		txtNomeq1 = (EditText) findViewById(R.id.txtNomeq1f32);
		txtNomeq2 = (EditText) findViewById(R.id.txtNomeq2f32);
		txtNomeq3 = (EditText) findViewById(R.id.txtNomeq3f32);
		txtNomeq4 = (EditText) findViewById(R.id.txtNomeq4f32);
		txtNomeq5 = (EditText) findViewById(R.id.txtNomeq5f32);
		txtNomeq6 = (EditText) findViewById(R.id.txtNomeq6f32);
		txtNomeq7 = (EditText) findViewById(R.id.txtNomeq7f32);
		txtNomeq8 = (EditText) findViewById(R.id.txtNomeq8f32);
		txtNomeq9 = (EditText) findViewById(R.id.txtNomeq9f32);
		txtNomeq10 = (EditText) findViewById(R.id.txtNomeq10f32);
		txtNomeq11 = (EditText) findViewById(R.id.txtNomeq11f32);
		txtNomeq12 = (EditText) findViewById(R.id.txtNomeq12f32);
		txtNomeq13 = (EditText) findViewById(R.id.txtNomeq13f32);
		txtNomeq14 = (EditText) findViewById(R.id.txtNomeq14f32);
		txtNomeq15 = (EditText) findViewById(R.id.txtNomeq15f32);
		txtNomeq16 = (EditText) findViewById(R.id.txtNomeq16f32);
		txtNomeq17 = (EditText) findViewById(R.id.txtNomeq17f32);
		txtNomeq18 = (EditText) findViewById(R.id.txtNomeq18f32);
		txtNomeq19 = (EditText) findViewById(R.id.txtNomeq19f32);
		txtNomeq20 = (EditText) findViewById(R.id.txtNomeq20f32);
		txtNomeq21 = (EditText) findViewById(R.id.txtNomeq21f32);
		txtNomeq22 = (EditText) findViewById(R.id.txtNomeq22f32);
		txtNomeq23 = (EditText) findViewById(R.id.txtNomeq23f32);
		txtNomeq24 = (EditText) findViewById(R.id.txtNomeq24f32);
		txtNomeq25 = (EditText) findViewById(R.id.txtNomeq25f32);
		txtNomeq26 = (EditText) findViewById(R.id.txtNomeq26f32);
		txtNomeq27 = (EditText) findViewById(R.id.txtNomeq27f32);
		txtNomeq28 = (EditText) findViewById(R.id.txtNomeq28f32);
		txtNomeq29 = (EditText) findViewById(R.id.txtNomeq29f32);
		txtNomeq30 = (EditText) findViewById(R.id.txtNomeq30f32);
		txtNomeq31 = (EditText) findViewById(R.id.txtNomeq31f32);
		txtNomeq32 = (EditText) findViewById(R.id.txtNomeq32f32);
	}
	
	public void crearfix32eq (View view){
		Intent i = new Intent(this, Fixture32equiposcreado.class);
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
		i.putExtra("nombreequipo17", txtNomeq17.getText().toString());
		i.putExtra("nombreequipo18", txtNomeq18.getText().toString());
		i.putExtra("nombreequipo19", txtNomeq19.getText().toString());
		i.putExtra("nombreequipo20", txtNomeq20.getText().toString());
		i.putExtra("nombreequipo21", txtNomeq21.getText().toString());
		i.putExtra("nombreequipo22", txtNomeq22.getText().toString());
		i.putExtra("nombreequipo23", txtNomeq23.getText().toString());
		i.putExtra("nombreequipo24", txtNomeq24.getText().toString());
		i.putExtra("nombreequipo25", txtNomeq25.getText().toString());
		i.putExtra("nombreequipo26", txtNomeq26.getText().toString());
		i.putExtra("nombreequipo27", txtNomeq27.getText().toString());
		i.putExtra("nombreequipo28", txtNomeq28.getText().toString());
		i.putExtra("nombreequipo29", txtNomeq29.getText().toString());
		i.putExtra("nombreequipo30", txtNomeq30.getText().toString());
		i.putExtra("nombreequipo31", txtNomeq31.getText().toString());
		i.putExtra("nombreequipo32", txtNomeq32.getText().toString());
		startActivity(i);
	}

	
}
