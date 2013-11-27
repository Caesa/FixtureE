package creador.fixture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Fixture32equiposcreado extends Activity {
	String nomeq1, nomeq2, nomeq3, nomeq4, nomeq5, nomeq6, nomeq7, nomeq8, nomeq9, nomeq10, nomeq11, nomeq12, nomeq13, nomeq14, nomeq15, nomeq16, nomeq17, nomeq18, nomeq19, nomeq20, nomeq21, nomeq22, nomeq23, nomeq24, nomeq25, nomeq26, nomeq27, nomeq28, nomeq29, nomeq30, nomeq31, nomeq32;
	EditText txtpunteq1, txtpunteq2, txtpunteq3, txtpunteq4, txtpunteq5, txtpunteq6, txtpunteq7, txtpunteq8, txtpunteq9, txtpunteq10, txtpunteq11, txtpunteq12, txtpunteq13, txtpunteq14, txtpunteq15, txtpunteq16, txtpunteq17, txtpunteq18, txtpunteq19, txtpunteq20, txtpunteq21, txtpunteq22, txtpunteq23, txtpunteq24, txtpunteq25, txtpunteq26, txtpunteq27, txtpunteq28, txtpunteq29, txtpunteq30, txtpunteq31, txtpunteq32;
	String ganador, ganador2, ganador3, ganador4, ganador5, ganador6, ganador7, ganador8, ganador9, ganador10, ganador11, ganador12, ganador13, ganador14, ganador15, ganador16;
	int punteq1, punteq2, punteq3, punteq4, punteq5, punteq6, punteq7, punteq8, punteq9, punteq10, punteq11, punteq12, punteq13, punteq14, punteq15, punteq16, punteq17, punteq18, punteq19, punteq20, punteq21, punteq22, punteq23, punteq24, punteq25, punteq26, punteq27, punteq28, punteq29, punteq30, punteq31, punteq32;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fixture32equiposcreado);
		TextView lblNombreeq1 = (TextView) findViewById(R.id.lblNomeq1dff32);
		TextView lblNombreeq2 = (TextView) findViewById(R.id.lblNomeq2dff32);
		TextView lblNombreeq3 = (TextView) findViewById(R.id.lblNomeq3dff32);
		TextView lblNombreeq4 = (TextView) findViewById(R.id.lblNomeq4dff32);
		TextView lblNombreeq5 = (TextView) findViewById(R.id.lblNomeq5dff32);
		TextView lblNombreeq6 = (TextView) findViewById(R.id.lblNomeq6dff32);
		TextView lblNombreeq7 = (TextView) findViewById(R.id.lblNomeq7dff32);
		TextView lblNombreeq8 = (TextView) findViewById(R.id.lblNomeq8dff32);
		TextView lblNombreeq9 = (TextView) findViewById(R.id.lblNomeq9dff32);
		TextView lblNombreeq10 = (TextView) findViewById(R.id.lblNomeq10dff32);
		TextView lblNombreeq11 = (TextView) findViewById(R.id.lblNomeq11dff32);
		TextView lblNombreeq12 = (TextView) findViewById(R.id.lblNomeq12dff32);
		TextView lblNombreeq13 = (TextView) findViewById(R.id.lblNomeq13dff32);
		TextView lblNombreeq14 = (TextView) findViewById(R.id.lblNomeq14dff32);
		TextView lblNombreeq15 = (TextView) findViewById(R.id.lblNomeq15dff32);
		TextView lblNombreeq16 = (TextView) findViewById(R.id.lblNomeq16dff32);
		TextView lblNombreeq17 = (TextView) findViewById(R.id.lblNomeq17dff32);
		TextView lblNombreeq18 = (TextView) findViewById(R.id.lblNomeq18dff32);
		TextView lblNombreeq19 = (TextView) findViewById(R.id.lblNomeq19dff32);
		TextView lblNombreeq20 = (TextView) findViewById(R.id.lblNomeq20dff32);
		TextView lblNombreeq21 = (TextView) findViewById(R.id.lblNomeq21dff32);
		TextView lblNombreeq22 = (TextView) findViewById(R.id.lblNomeq22dff32);
		TextView lblNombreeq23 = (TextView) findViewById(R.id.lblNomeq23dff32);
		TextView lblNombreeq24 = (TextView) findViewById(R.id.lblNomeq24dff32);
		TextView lblNombreeq25 = (TextView) findViewById(R.id.lblNomeq25dff32);
		TextView lblNombreeq26 = (TextView) findViewById(R.id.lblNomeq26dff32);
		TextView lblNombreeq27 = (TextView) findViewById(R.id.lblNomeq27dff32);
		TextView lblNombreeq28 = (TextView) findViewById(R.id.lblNomeq28dff32);
		TextView lblNombreeq29 = (TextView) findViewById(R.id.lblNomeq29dff32);
		TextView lblNombreeq30 = (TextView) findViewById(R.id.lblNomeq30dff32);
		TextView lblNombreeq31 = (TextView) findViewById(R.id.lblNomeq31dff32);
		TextView lblNombreeq32 = (TextView) findViewById(R.id.lblNomeq32dff32);
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
		nomeq17 = extras.getString("nombreequipo17");
		nomeq18 = extras.getString("nombreequipo18");
		nomeq19 = extras.getString("nombreequipo19");
		nomeq20 = extras.getString("nombreequipo20");
		nomeq21 = extras.getString("nombreequipo21");
		nomeq22 = extras.getString("nombreequipo22");
		nomeq23 = extras.getString("nombreequipo23");
		nomeq24 = extras.getString("nombreequipo24");
		nomeq25 = extras.getString("nombreequipo25");
		nomeq26 = extras.getString("nombreequipo26");
		nomeq27 = extras.getString("nombreequipo27");
		nomeq28 = extras.getString("nombreequipo28");
		nomeq29 = extras.getString("nombreequipo29");
		nomeq30 = extras.getString("nombreequipo30");
		nomeq31 = extras.getString("nombreequipo31");
		nomeq32 = extras.getString("nombreequipo32");
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
		lblNombreeq17.setText(nomeq17);
		lblNombreeq18.setText(nomeq18);
		lblNombreeq19.setText(nomeq19);
		lblNombreeq20.setText(nomeq20);
		lblNombreeq21.setText(nomeq21);
		lblNombreeq22.setText(nomeq22);
		lblNombreeq23.setText(nomeq23);
		lblNombreeq24.setText(nomeq24);
		lblNombreeq25.setText(nomeq25);
		lblNombreeq26.setText(nomeq26);
		lblNombreeq27.setText(nomeq27);
		lblNombreeq28.setText(nomeq28);
		lblNombreeq29.setText(nomeq29);
		lblNombreeq30.setText(nomeq30);
		lblNombreeq31.setText(nomeq31);
		lblNombreeq32.setText(nomeq32);
		txtpunteq1 = (EditText) findViewById(R.id.txtPunteq1dff32);
		txtpunteq2 = (EditText) findViewById(R.id.txtPunteq2dff32);
		txtpunteq3 = (EditText) findViewById(R.id.txtPunteq3dff32);
		txtpunteq4 = (EditText) findViewById(R.id.txtPunteq4dff32);
		txtpunteq5 = (EditText) findViewById(R.id.txtPunteq5dff32);
		txtpunteq6 = (EditText) findViewById(R.id.txtPunteq6dff32);
		txtpunteq7 = (EditText) findViewById(R.id.txtPunteq7dff32);
		txtpunteq8 = (EditText) findViewById(R.id.txtPunteq8dff32);
		txtpunteq9 = (EditText) findViewById(R.id.txtPunteq9dff32);
		txtpunteq10 = (EditText) findViewById(R.id.txtPunteq10dff32);
		txtpunteq11 = (EditText) findViewById(R.id.txtPunteq11dff32);
		txtpunteq12 = (EditText) findViewById(R.id.txtPunteq12dff32);
		txtpunteq13 = (EditText) findViewById(R.id.txtPunteq13dff32);
		txtpunteq14 = (EditText) findViewById(R.id.txtPunteq14dff32);
		txtpunteq15 = (EditText) findViewById(R.id.txtPunteq15dff32);
		txtpunteq16 = (EditText) findViewById(R.id.txtPunteq16dff32);
		txtpunteq17 = (EditText) findViewById(R.id.txtPunteq17dff32);
		txtpunteq18 = (EditText) findViewById(R.id.txtPunteq18dff32);
		txtpunteq19 = (EditText) findViewById(R.id.txtPunteq19dff32);
		txtpunteq20 = (EditText) findViewById(R.id.txtPunteq20dff32);
		txtpunteq21 = (EditText) findViewById(R.id.txtPunteq21dff32);
		txtpunteq22 = (EditText) findViewById(R.id.txtPunteq22dff32);
		txtpunteq23 = (EditText) findViewById(R.id.txtPunteq23dff32);
		txtpunteq24 = (EditText) findViewById(R.id.txtPunteq24dff32);
		txtpunteq25 = (EditText) findViewById(R.id.txtPunteq25dff32);
		txtpunteq26 = (EditText) findViewById(R.id.txtPunteq26dff32);
		txtpunteq27 = (EditText) findViewById(R.id.txtPunteq27dff32);
		txtpunteq28 = (EditText) findViewById(R.id.txtPunteq28dff32);
		txtpunteq29 = (EditText) findViewById(R.id.txtPunteq29dff32);
		txtpunteq30 = (EditText) findViewById(R.id.txtPunteq30dff32);
		txtpunteq31 = (EditText) findViewById(R.id.txtPunteq31dff32);
		txtpunteq32 = (EditText) findViewById(R.id.txtPunteq32dff32);
	}
	
	public void octavosfixture32equipos (View view){
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
		punteq17 = Integer.parseInt(txtpunteq17.getText().toString());
		punteq18 = Integer.parseInt(txtpunteq18.getText().toString());
		punteq19 = Integer.parseInt(txtpunteq19.getText().toString());
		punteq20 = Integer.parseInt(txtpunteq20.getText().toString());
		punteq21 = Integer.parseInt(txtpunteq21.getText().toString());
		punteq22 = Integer.parseInt(txtpunteq22.getText().toString());
		punteq23 = Integer.parseInt(txtpunteq23.getText().toString());
		punteq24 = Integer.parseInt(txtpunteq24.getText().toString());
		punteq25 = Integer.parseInt(txtpunteq25.getText().toString());
		punteq26 = Integer.parseInt(txtpunteq26.getText().toString());
		punteq27 = Integer.parseInt(txtpunteq27.getText().toString());
		punteq28 = Integer.parseInt(txtpunteq28.getText().toString());
		punteq29 = Integer.parseInt(txtpunteq29.getText().toString());
		punteq30 = Integer.parseInt(txtpunteq30.getText().toString());
		punteq31 = Integer.parseInt(txtpunteq31.getText().toString());
		punteq32 = Integer.parseInt(txtpunteq32.getText().toString());
		
				
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
		if (punteq17 > punteq18){
			ganador9 = nomeq17;
		}
		if (punteq18 > punteq17){
			ganador9 = nomeq18;
		}
		if (punteq19 > punteq20){
			ganador10 = nomeq19;
		}
		if (punteq20 > punteq19){
			ganador10 = nomeq20;
		}
		if (punteq21 > punteq22){
			ganador11 = nomeq21;
		}
		if (punteq22 > punteq21){
			ganador11 = nomeq22;
		}
		if (punteq23 > punteq24){
			ganador12 = nomeq23;
		}
		if (punteq24 > punteq23){
			ganador12 = nomeq24;
		}
		if (punteq25 > punteq26){
			ganador13 = nomeq25;
		}
		if (punteq26 > punteq25){
			ganador13 = nomeq26;
		}
		if (punteq27 > punteq28){
			ganador14 = nomeq27;
		}
		if (punteq28 > punteq27){
			ganador14 = nomeq28;
		}
		if (punteq29 > punteq30){
			ganador15 = nomeq29;
		}
		if (punteq30 > punteq29){
			ganador15 = nomeq30;
		}
		if (punteq31 > punteq32){
			ganador16 = nomeq31;
		}
		if (punteq32 > punteq31){
			ganador16 = nomeq32;
		}
		Intent i = new Intent(this, Fixture32equiposoctavosdefinal.class);
		i.putExtra("equipoganador1", ganador);
		i.putExtra("equipoganador2", ganador2);
		i.putExtra("equipoganador3", ganador3);
		i.putExtra("equipoganador4", ganador4);
		i.putExtra("equipoganador5", ganador5);
		i.putExtra("equipoganador6", ganador6);
		i.putExtra("equipoganador7", ganador7);
		i.putExtra("equipoganador8", ganador8);
		i.putExtra("equipoganador9", ganador9);
		i.putExtra("equipoganador10", ganador10);
		i.putExtra("equipoganador11", ganador11);
		i.putExtra("equipoganador12", ganador12);
		i.putExtra("equipoganador13", ganador13);
		i.putExtra("equipoganador14", ganador14);
		i.putExtra("equipoganador15", ganador15);
		i.putExtra("equipoganador16", ganador16);
		
		startActivity(i);
	}
	
}
