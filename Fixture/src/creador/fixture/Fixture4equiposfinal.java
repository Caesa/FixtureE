package creador.fixture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Fixture4equiposfinal extends Activity {
	String nomeq1 = "";
	String nomeq2 = "";
	EditText txtpunteq1;
	EditText txtpunteq2;
	String ganador = "";
	int punteq1 = 0;
	int punteq2 = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fixture4equiposfinal);
		TextView lblNombreeq1 = (TextView) findViewById(R.id.lblNombreeq1f4);
		TextView lblNombreeq2 = (TextView) findViewById(R.id.lblNombreeq2f4);
		Bundle extras = getIntent().getExtras();
		nomeq1 = extras.getString("equipoganador1");
		nomeq2 = extras.getString("equipoganador2");
		lblNombreeq1.setText(nomeq1);
		lblNombreeq2.setText(nomeq2);
		txtpunteq1 = (EditText) findViewById(R.id.txtPunteq1f4);
		txtpunteq2 = (EditText) findViewById(R.id.txtPunteq2f4);
	}
	
	public void finalizarfixture4equipos (View view){
		punteq1 = Integer.parseInt(txtpunteq1.getText().toString());
		punteq2 = Integer.parseInt(txtpunteq2.getText().toString());
		if (punteq1 > punteq2){
			ganador = nomeq1;
		}
		if (punteq2 > punteq1){
			ganador = nomeq2;
		}
		Intent i = new Intent(this, Fixture4equiposfinalizado.class);
		i.putExtra("equipoganador", ganador);
		startActivity(i);
	}
}
