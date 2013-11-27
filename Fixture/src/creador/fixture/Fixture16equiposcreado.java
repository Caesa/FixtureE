package creador.fixture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Fixture16equiposcreado extends Activity {
	String nomeq1 = "";
	String nomeq2 = "";
	String nomeq3 = "";
	String nomeq4 = "";
	String nomeq5 = "";
	String nomeq6 = "";
	String nomeq7 = "";
	String nomeq8 = "";
	String nomeq9 = "";
	String nomeq10 = "";
	String nomeq11 = "";
	String nomeq12 = "";
	String nomeq13 = "";
	String nomeq14 = "";
	String nomeq15 = "";
	String nomeq16 = "";
	EditText txtpunteq1;
	EditText txtpunteq2;
	EditText txtpunteq3;
	EditText txtpunteq4;
	EditText txtpunteq5;
	EditText txtpunteq6;
	EditText txtpunteq7;
	EditText txtpunteq8;
	EditText txtpunteq9;
	EditText txtpunteq10;
	EditText txtpunteq11;
	EditText txtpunteq12;
	EditText txtpunteq13;
	EditText txtpunteq14;
	EditText txtpunteq15;
	EditText txtpunteq16;
	String ganador = "";
	String ganador2 = "";
	String ganador3 = "";
	String ganador4 = "";
	String ganador5 = "";
	String ganador6 = "";
	String ganador7 = "";
	String ganador8 = "";
	int punteq1 = 0;
	int punteq2 = 0;
	int punteq3 = 0;
	int punteq4 = 0;
	int punteq5 = 0;
	int punteq6 = 0;
	int punteq7 = 0;
	int punteq8 = 0;
	int punteq9 = 0;
	int punteq10 = 0;
	int punteq11 = 0;
	int punteq12 = 0;
	int punteq13 = 0;
	int punteq14 = 0;
	int punteq15 = 0;
	int punteq16 = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fixture16equiposcreado);
		TextView lblNombreeq1 = (TextView) findViewById(R.id.lblNombreeq1f16of);
		TextView lblNombreeq2 = (TextView) findViewById(R.id.lblNombreeq2f16of);
		TextView lblNombreeq3 = (TextView) findViewById(R.id.lblNombreeq3f16of);
		TextView lblNombreeq4 = (TextView) findViewById(R.id.lblNombreeq4f16of);
		TextView lblNombreeq5 = (TextView) findViewById(R.id.lblNombreeq5f16of);
		TextView lblNombreeq6 = (TextView) findViewById(R.id.lblNombreeq6f16of);
		TextView lblNombreeq7 = (TextView) findViewById(R.id.lblNombreeq7f16of);
		TextView lblNombreeq8 = (TextView) findViewById(R.id.lblNombreeq8f16of);
		TextView lblNombreeq9 = (TextView) findViewById(R.id.lblNombreeq9f16of);
		TextView lblNombreeq10 = (TextView) findViewById(R.id.lblNombreeq10f16of);
		TextView lblNombreeq11 = (TextView) findViewById(R.id.lblNombreeq11f16of);
		TextView lblNombreeq12 = (TextView) findViewById(R.id.lblNombreeq12f16of);
		TextView lblNombreeq13 = (TextView) findViewById(R.id.lblNombreeq13f16of);
		TextView lblNombreeq14 = (TextView) findViewById(R.id.lblNombreeq14f16of);
		TextView lblNombreeq15 = (TextView) findViewById(R.id.lblNombreeq15f16of);
		TextView lblNombreeq16 = (TextView) findViewById(R.id.lblNombreeq16f16of);
		Bundle extras = getIntent().getExtras();
		nomeq1 = extras.getString("nombreequipo1");
		nomeq2 = extras.getString("nombreequipo2");
		nomeq3 = extras.getString("nombreequipo3");
		nomeq4 = extras.getString("nombreequipo4");
		nomeq5 = extras.getString("nombreequipo5");
		nomeq6 = extras.getString("nombreequipo6");
		nomeq7 = extras.getString("nombreequipo7");
		nomeq8 = extras.getString("nombreequipo8");
		nomeq9 = extras.getString("nombreequipo9");
		nomeq10 = extras.getString("nombreequipo10");
		nomeq11 = extras.getString("nombreequipo11");
		nomeq12 = extras.getString("nombreequipo12");
		nomeq13 = extras.getString("nombreequipo13");
		nomeq14 = extras.getString("nombreequipo14");
		nomeq15 = extras.getString("nombreequipo15");
		nomeq16 = extras.getString("nombreequipo16");
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
		txtpunteq1 = (EditText) findViewById(R.id.txtPunteq1f16of);
		txtpunteq2 = (EditText) findViewById(R.id.txtPunteq2f16of);
		txtpunteq3 = (EditText) findViewById(R.id.txtPunteq3f16of);
		txtpunteq4 = (EditText) findViewById(R.id.txtPunteq4f16of);
		txtpunteq5 = (EditText) findViewById(R.id.txtPunteq5f16of);
		txtpunteq6 = (EditText) findViewById(R.id.txtPunteq6f16of);
		txtpunteq7 = (EditText) findViewById(R.id.txtPunteq7f16of);
		txtpunteq8 = (EditText) findViewById(R.id.txtPunteq8f16of);
		txtpunteq9 = (EditText) findViewById(R.id.txtPunteq9f16of);
		txtpunteq10 = (EditText) findViewById(R.id.txtPunteq10f16of);
		txtpunteq11 = (EditText) findViewById(R.id.txtPunteq11f16of);
		txtpunteq12 = (EditText) findViewById(R.id.txtPunteq12f16of);
		txtpunteq13 = (EditText) findViewById(R.id.txtPunteq13f16of);
		txtpunteq14 = (EditText) findViewById(R.id.txtPunteq14f16of);
		txtpunteq15 = (EditText) findViewById(R.id.txtPunteq15f16of);
		txtpunteq16 = (EditText) findViewById(R.id.txtPunteq16f16of);
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
		Intent i = new Intent(this, Fixture16equiposcuartosdefinal.class);
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
