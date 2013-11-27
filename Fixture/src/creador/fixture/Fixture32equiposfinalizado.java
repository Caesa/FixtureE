package creador.fixture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Fixture32equiposfinalizado extends Activity {
	String ganador = "";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fixture32equiposfinalizado);
		Bundle extras = getIntent().getExtras();
		ganador = extras.getString("equipoganador");
		TextView lblGanador = (TextView)findViewById(R.id.lblCampeonf32);
		lblGanador.setText(ganador);
	}
	
	public void reset(View view){
		Intent i = new Intent(this, Inicio.class);
		startActivity(i);
	}
}
