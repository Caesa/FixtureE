package creador.fixture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Fixture32equiposoctavosdefinal extends Activity {
	String nomeq1, nomeq2, nomeq3, nomeq4, nomeq5, nomeq6, nomeq7, nomeq8, nomeq9, nomeq10, nomeq11, nomeq12, nomeq13, nomeq14, nomeq15, nomeq16;
	EditText txtpunteq1, txtpunteq2, txtpunteq3, txtpunteq4, txtpunteq5, txtpunteq6, txtpunteq7, txtpunteq8, txtpunteq9, txtpunteq10, txtpunteq11, txtpunteq12, txtpunteq13, txtpunteq14, txtpunteq15, txtpunteq16;
	String ganador, ganador2, ganador3, ganador4, ganador5, ganador6, ganador7, ganador8;
	int punteq1, punteq2, punteq3, punteq4, punteq5, punteq6, punteq7, punteq8, punteq9, punteq10, punteq11, punteq12, punteq13, punteq14, punteq15, punteq16;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fixture32equiposoctavosdefinal);
		TextView lblNombreeq1 = (TextView) findViewById(R.id.lblNomeq1f32of);
		TextView lblNombreeq2 = (TextView) findViewById(R.id.lblNomeq2f32of);
		TextView lblNombreeq3 = (TextView) findViewById(R.id.lblNomeq3f32of);
		TextView lblNombreeq4 = (TextView) findViewById(R.id.lblNomeq4f32of);
		TextView lblNombreeq5 = (TextView) findViewById(R.id.lblNomeq5f32of);
		TextView lblNombreeq6 = (TextView) findViewById(R.id.lblNomeq6f32of);
		TextView lblNombreeq7 = (TextView) findViewById(R.id.lblNomeq7f32of);
		TextView lblNombreeq8 = (TextView) findViewById(R.id.lblNomeq8f32of);
		TextView lblNombreeq9 = (TextView) findViewById(R.id.lblNomeq9f32of);
		TextView lblNombreeq10 = (TextView) findViewById(R.id.lblNomeq10f32of);
		TextView lblNombreeq11 = (TextView) findViewById(R.id.lblNomeq11f32of);
		TextView lblNombreeq12 = (TextView) findViewById(R.id.lblNomeq12f32of);
		TextView lblNombreeq13 = (TextView) findViewById(R.id.lblNomeq13f32of);
		TextView lblNombreeq14 = (TextView) findViewById(R.id.lblNomeq14f32of);
		TextView lblNombreeq15 = (TextView) findViewById(R.id.lblNomeq15f32of);
		TextView lblNombreeq16 = (TextView) findViewById(R.id.lblNomeq16f32of);
		Bundle extras = getIntent().getExtras();
		nomeq1 = extras.getString("equipoganador1");
		nomeq2 = extras.getString("equipoganador2");
		nomeq3 = extras.getString("equipoganador3");
		nomeq4 = extras.getString("equipoganador4");
		nomeq5 = extras.getString("equipoganador5");
		nomeq6 = extras.getString("equipoganador6");
		nomeq7 = extras.getString("equipoganador7");
		nomeq8 = extras.getString("equipoganador8");
		nomeq9 = extras.getString("equipoganador9");
		nomeq10 = extras.getString("equipoganador10");
		nomeq11 = extras.getString("equipoganador11");
		nomeq12 = extras.getString("equipoganador12");
		nomeq13 = extras.getString("equipoganador13");
		nomeq14 = extras.getString("equipoganador14");
		nomeq15 = extras.getString("equipoganador15");
		nomeq16 = extras.getString("equipoganador16");
		lblNombreeq1.setText(nomeq1);
		lblNombreeq2.setText(nomeq2);
		lblNombreeq3.setText(nomeq3);
		lblNombreeq4.setText(nomeq4);
		lblNombreeq5.setText(nomeq5);
		lblNombreeq6.setText(nomeq6);
		lblNombreeq7.setText(nomeq7);
		lblNombreeq8.setText(nomeq8);
		lblNombreeq9.setText(nomeq9);
		lblNombreeq10.setText(nomeq10);
		lblNombreeq11.setText(nomeq11);
		lblNombreeq12.setText(nomeq12);
		lblNombreeq13.setText(nomeq13);
		lblNombreeq14.setText(nomeq14);
		lblNombreeq15.setText(nomeq15);
		lblNombreeq16.setText(nomeq16);
		txtpunteq1 = (EditText) findViewById(R.id.txtPunteq1f32of);
		txtpunteq2 = (EditText) findViewById(R.id.txtPunteq2f32of);
		txtpunteq3 = (EditText) findViewById(R.id.txtPunteq3f32of);
		txtpunteq4 = (EditText) findViewById(R.id.txtPunteq4f32of);
		txtpunteq5 = (EditText) findViewById(R.id.txtPunteq5f32of);
		txtpunteq6 = (EditText) findViewById(R.id.txtPunteq6f32of);
		txtpunteq7 = (EditText) findViewById(R.id.txtPunteq7f32of);
		txtpunteq8 = (EditText) findViewById(R.id.txtPunteq8f32of);
		txtpunteq9 = (EditText) findViewById(R.id.txtPunteq9f32of);
		txtpunteq10 = (EditText) findViewById(R.id.txtPunteq10f32of);
		txtpunteq11 = (EditText) findViewById(R.id.txtPunteq11f32of);
		txtpunteq12 = (EditText) findViewById(R.id.txtPunteq12f32of);
		txtpunteq13 = (EditText) findViewById(R.id.txtPunteq13f32of);
		txtpunteq14 = (EditText) findViewById(R.id.txtPunteq14f32of);
		txtpunteq15 = (EditText) findViewById(R.id.txtPunteq15f32of);
		txtpunteq16 = (EditText) findViewById(R.id.txtPunteq16f32of);
	}
	
	public void cuartosfixture16equipos (View view){
		punteq1 = Integer.parseInt(txtpunteq1.getText().toString());
		punteq2 = Integer.parseInt(txtpunteq2.getText().toString());
		punteq3 = Integer.parseInt(txtpunteq3.getText().toString());
		punteq4 = Integer.parseInt(txtpunteq4.getText().toString());
		punteq5 = Integer.parseInt(txtpunteq5.getText().toString());
		punteq6 = Integer.parseInt(txtpunteq6.getText().toString());
		punteq7 = Integer.parseInt(txtpunteq7.getText().toString());
		punteq8 = Integer.parseInt(txtpunteq8.getText().toString());
		punteq9 = Integer.parseInt(txtpunteq9.getText().toString());
		punteq10 = Integer.parseInt(txtpunteq10.getText().toString());
		punteq11 = Integer.parseInt(txtpunteq11.getText().toString());
		punteq12 = Integer.parseInt(txtpunteq12.getText().toString());
		punteq13 = Integer.parseInt(txtpunteq13.getText().toString());
		punteq14 = Integer.parseInt(txtpunteq14.getText().toString());
		punteq15 = Integer.parseInt(txtpunteq15.getText().toString());
		punteq16 = Integer.parseInt(txtpunteq16.getText().toString());
		
				
		if (punteq1 > punteq2){
			ganador = nomeq1;
		}
		if (punteq2 > punteq1){
			ganador = nomeq2;
		}
		if (punteq3 > punteq4){
			ganador2 = nomeq3;
		}
		if (punteq4 > punteq3){
			ganador2 = nomeq4;
		}
		if (punteq5 > punteq6){
			ganador3 = nomeq5;
		}
		if (punteq6 > punteq5){
			ganador3 = nomeq6;
		}
		if (punteq7 > punteq8){
			ganador4 = nomeq7;
		}
		if (punteq8 > punteq7){
			ganador4 = nomeq8;
		}
		if (punteq9 > punteq10){
			ganador5 = nomeq9;
		}
		if (punteq10 > punteq9){
			ganador5 = nomeq10;
		}
		if (punteq11 > punteq12){
			ganador6 = nomeq11;
		}
		if (punteq12 > punteq11){
			ganador6 = nomeq12;
		}
		if (punteq13 > punteq14){
			ganador7 = nomeq13;
		}
		if (punteq14 > punteq13){
			ganador7 = nomeq14;
		}
		if (punteq15 > punteq16){
			ganador8 = nomeq15;
		}
		if (punteq16 > punteq15){
			ganador8 = nomeq16;
		}
		Intent i = new Intent(this, Fixture32equiposcuartosdefinal.class);
		i.putExtra("equipoganador1", ganador);
		i.putExtra("equipoganador2", ganador2);
		i.putExtra("equipoganador3", ganador3);
		i.putExtra("equipoganador4", ganador4);
		i.putExtra("equipoganador5", ganador5);
		i.putExtra("equipoganador6", ganador6);
		i.putExtra("equipoganador7", ganador7);
		i.putExtra("equipoganador8", ganador8);
		startActivity(i);
	}
	
}
