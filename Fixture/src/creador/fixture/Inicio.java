package creador.fixture;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Inicio extends Activity {
	int cantequip = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inicio);
		Button btnCrear = (Button) findViewById(R.id.btnCrear);		
		ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.Cantdeequipos, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		Spinner cmbxCantequip = (Spinner) findViewById(R.id.cmbxCantdeequip);
		cmbxCantequip.setAdapter(adapter);
		cmbxCantequip.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parentView, View selectedItemView,
					int position, long id) {
				// TODO Auto-generated method stub
				cantequip = Integer.parseInt(parentView.getItemAtPosition(position).toString());
				Toast.makeText(parentView.getContext(), "Seleccionaste "+cantequip+" equipos.", Toast.LENGTH_LONG).show();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.inicio, menu);
		return true;
	}
	
	public void cambiarventana (View view) {
		if(cantequip==2){
			Intent i = new Intent(this, Fixture2equipos.class);
			startActivity(i);
		}
		if(cantequip==4){
			Intent i = new Intent(this, Fixture4equipos.class);
			startActivity(i);
		}
		if(cantequip==8){
			Intent i = new Intent(this, Fixture8equipos.class);
			startActivity(i);
		}
		if(cantequip==16){
			Intent i = new Intent(this, Fixture16equipos.class);
			startActivity(i);
		}
		if(cantequip==32){
			Intent i = new Intent(this, Fixture32equipos.class);
			startActivity(i);
		}
	}

}
