package creador.fixture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Fixture16equipossemifinal extends Activity {
	String nomeq1 = "";
	String nomeq2 = "";
	String nomeq3 = "";
	String nomeq4 = "";
	EditText txtpunteq1;
	EditText txtpunteq2;
	EditText txtpunteq3;
	EditText txtpunteq4;
	String ganador = "";
	String ganador2 = "";
	int punteq1 = 0;
	int punteq2 = 0;
	int punteq3 = 0;
	int punteq4 = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fixture16equipossemifinal);
		TextView lblNombreeq1 = (TextView) findViewById(R.id.lblNombreeq1f16sf);
		TextView lblNombreeq2 = (TextView) findViewById(R.id.lblNombreeq2f16sf);
		TextView lblNombreeq3 = (TextView) findViewById(R.id.lblNombreeq3f16sf);
		TextView lblNombreeq4 = (TextView) findViewById(R.id.lblNombreeq4f16sf);
		Bundle extras = getIntent().getExtras();
		nomeq1 = extras.getString("equipoganador1");
		nomeq2 = extras.getString("equipoganador2");
		nomeq3 = extras.getString("equipoganador3");
		nomeq4 = extras.getString("equipoganador4");
		lblNombreeq1.setText(nomeq1);
		lblNombreeq2.setText(nomeq2);
		lblNombreeq3.setText(nomeq3);
		lblNombreeq4.setText(nomeq4);
		txtpunteq1 = (EditText) findViewById(R.id.txtPunteq1f16sf);
		txtpunteq2 = (EditText) findViewById(R.id.txtPunteq2f16sf);
		txtpunteq3 = (EditText) findViewById(R.id.txtPunteq3f16sf);
		txtpunteq4 = (EditText) findViewById(R.id.txtPunteq4f16sf);
	}
	
	public void finalfixture16equipos (View view){
		punteq1 = Integer.parseInt(txtpunteq1.getText().toString());
		punteq2 = Integer.parseInt(txtpunteq2.getText().toString());
		punteq3 = Integer.parseInt(txtpunteq3.getText().toString());
		punteq4 = Integer.parseInt(txtpunteq4.getText().toString());
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
		Intent i = new Intent(this, Fixture16equiposfinal.class);
		i.putExtra("equipoganador1", ganador);
		i.putExtra("equipoganador2", ganador2);
		startActivity(i);
	}
	
}
