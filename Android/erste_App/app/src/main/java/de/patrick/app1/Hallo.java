package de.patrick.app1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



/**
 * Created by Patrick on 15.08.2015.
 */
public class Hallo extends Activity {
    private  TextView nachricht;
    private  EditText eingabe;
    private Button weiter_fertig;

    private  boolean erster_klick;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nachricht = (TextView) findViewById(R.id.nachricht);
        eingabe = (EditText) findViewById(R.id.eingabe);
        weiter_fertig = (Button) findViewById(R.id.weiter_fertig);

        erster_klick = true;
        nachricht.setText(R.string.gruss);
        weiter_fertig.setText(R.string.weiter);

        weiter_fertig.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (erster_klick)
                {
                    nachricht.setText(getString(R.string.reaktion, eingabe.getText()));
                    eingabe.setVisibility(View.INVISIBLE);
                    weiter_fertig.setText(R.string.ende);
                    erster_klick = false;
                }
                else
                {
                    finish();
                }
            }
        });






    }
}
