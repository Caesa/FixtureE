package creador.fixture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Fixture8equiposcreado extends Activity {
	String nomeq1 = "";
	String nomeq2 = "";
	String nomeq3 = "";
	String nomeq4 = "";
	String nomeq5 = "";
	String nomeq6 = "";
	String nomeq7 = "";
	String nomeq8 = "";
	EditText txtpunteq1;
	EditText txtpunteq2;
	EditText txtpunteq3;
	EditText txtpunteq4;
	EditText txtpunteq5;
	EditText txtpunteq6;
	EditText txtpunteq7;
	EditText txtpunteq8;
	String ganador = "";
	String ganador2 = "";
	String ganador3 = "";
	String ganador4 = "";
	int punteq1 = 0;
	int punteq2 = 0;
	int punteq3 = 0;
	int punteq4 = 0;
	int punteq5 = 0;
	int punteq6 = 0;
	int punteq7 = 0;
	int punteq8 = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fixture8equiposcreado);
		TextView lblNombreeq1 = (TextView) findViewById(R.id.lblNombreeq1f8cf);
		TextView lblNombreeq2 = (TextView) findViewById(R.id.lblNombreeq2f8cf);
		TextView lblNombreeq3 = (TextView) findViewById(R.id.lblNombreeq3f8cf);
		TextView lblNombreeq4 = (TextView) findViewById(R.id.lblNombreeq4f8cf);
		TextView lblNombreeq5 = (TextView) findViewById(R.id.lblNombreeq5f8cf);
		TextView lblNombreeq6 = (TextView) findViewById(R.id.lblNombreeq6f8cf);
		TextView lblNombreeq7 = (TextView) findViewById(R.id.lblNombreeq7f8cf);
		TextView lblNombreeq8 = (TextView) findViewById(R.id.lblNombreeq8f8cf);
		Bundle extras = getIntent().getExtras();
		nomeq1 = extras.getString("nombreequipo1");
		nomeq2 = extras.getString("nombreequipo2");
		nomeq3 = extras.getString("nombreequipo3");
		nomeq4 = extras.getString("nombreequipo4");
		nomeq5 = extras.getString("nombreequipo5");
		nomeq6 = extras.getString("nombreequipo6");
		nomeq7 = extras.getString("nombreequipo7");
		nomeq8 = extras.getString("nombreequipo8");
		lblNombreeq1.setText(nomeq1);
		lblNombreeq2.setText(nomeq2);
		lblNombreeq3.setText(nomeq3);
		lblNombreeq4.setText(nomeq4);
		lblNombreeq5.setText(nomeq5);
		lblNombreeq6.setText(nomeq6);
		lblNombreeq7.setText(nomeq7);
		lblNombreeq8.setText(nomeq8);
		txtpunteq1 = (EditText) findViewById(R.id.txtPunteq1f8);
		txtpunteq2 = (EditText) findViewById(R.id.txtPunteq2f8);
		txtpunteq3 = (EditText) findViewById(R.id.txtPunteq3f8);
		txtpunteq4 = (EditText) findViewById(R.id.txtPunteq4f8);
		txtpunteq5 = (EditText) findViewById(R.id.txtPunteq5f8);
		txtpunteq6 = (EditText) findViewById(R.id.txtPunteq6f8);
		txtpunteq7 = (EditText) findViewById(R.id.txtPunteq7f8);
		txtpunteq8 = (EditText) findViewById(R.id.txtPunteq8f8);
	}
	
	public void semifinalfixture8equipos (View view){
		punteq1 = Integer.parseInt(txtpunteq1.getText().toString());
		punteq2 = Integer.parseInt(txtpunteq2.getText().toString());
		punteq3 = Integer.parseInt(txtpunteq3.getText().toString());
		punteq4 = Integer.parseInt(txtpunteq4.getText().toString());
		punteq5 = Integer.parseInt(txtpunteq5.getText().toString());
		punteq6 = Integer.parseInt(txtpunteq6.getText().toString());
		punteq7 = Integer.parseInt(txtpunteq7.getText().toString());
		punteq8 = Integer.parseInt(txtpunteq8.getText().toString());
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
		Intent i = new Intent(this, Fixture8equipossemifinal.class);
		i.putExtra("equipoganador1", ganador);
		i.putExtra("equipoganador2", ganador2);
		i.putExtra("equipoganador3", ganador3);
		i.putExtra("equipoganador4", ganador4);
		startActivity(i);
	}
	
}
