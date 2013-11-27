package creador.fixture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fixture2equiposcreado extends Activity {
	String nomeq1 = "";
	String nomeq2 = "";
	EditText txtpunteq1;
	EditText txtpunteq2;
	EditText penaleseq1;
	EditText penaleseq2;
	String ganador = "";
	int punteq1 = 0;
	int punteq2 = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fixture2equiposcreado);
		TextView lblNombreeq1 = (TextView) findViewById(R.id.lblNombreeq1);
		TextView lblNombreeq2 = (TextView) findViewById(R.id.lblNombreeq2);
		Bundle extras = getIntent().getExtras();
		nomeq1 = extras.getString("nombreequipo1");
		nomeq2 = extras.getString("nombreequipo2");
		lblNombreeq1.setText(nomeq1);
		lblNombreeq2.setText(nomeq2);
		txtpunteq1 = (EditText) findViewById(R.id.txtPunteq1);
		txtpunteq2 = (EditText) findViewById(R.id.txtPunteq2);
	}
	
	public void finalizarfixture2equipos (View view){
		punteq1 = Integer.parseInt(txtpunteq1.getText().toString());
		punteq2 = Integer.parseInt(txtpunteq2.getText().toString());
		if (punteq1 > punteq2){
			ganador = nomeq1;
		}
		if (punteq2 > punteq1){
			ganador = nomeq2;
		}
		Intent i = new Intent(this, Fixture2equiposfinalizado.class);
		i.putExtra("equipoganador", ganador);
		startActivity(i);
	}
}
