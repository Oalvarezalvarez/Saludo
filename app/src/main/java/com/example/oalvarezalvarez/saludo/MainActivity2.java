package com.example.oalvarezalvarez.saludo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        Bundle reco=getIntent().getExtras();
        TextView t= (TextView) findViewById(R.id.texto);
        t.setText(reco.getString("nombre"));
        Button btnhola = (Button)findViewById(R.id.btnhola);
        Button btnadios = (Button)findViewById(R.id.btnadios);
        btnhola.setOnClickListener(new View.OnClickListener ()
        {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra("respuesta", "hola");
                setResult(RESULT_OK, i);
                finish();
            }});
        btnadios.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra("respuesta", "adios");
                setResult(RESULT_OK, i);
                finish();
            }});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
