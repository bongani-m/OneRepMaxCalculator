package com.bonganimbigi.onerepmaxcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return false;
    }

    public void onClickHander(View view) {
        double reps;
        double weight;
        EditText repsEditText = (EditText) findViewById(R.id.repsEditText);
        EditText lbEditText = (EditText) findViewById(R.id.lbEditText);
        TextView result = (TextView) findViewById(R.id.resultTextView);
        if(repsEditText.getText().toString().equals("")){
            reps = 0;
        } else {
            reps = Double.parseDouble(repsEditText.getText().toString());
        }
        if(lbEditText.getText().toString().equals("")){
            weight = 0;
        } else {
            weight = Double.parseDouble(lbEditText.getText().toString());
        }

        double max = Math.round(weight * Math.pow(reps,.10));
        result.setText(max + "");
    }

}
