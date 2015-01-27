package com.january.egavett.notyf;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class AddActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add, menu);
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

    /*
     * Collects all information from the activity,
     * Sends it to main activity to become notification
     */
    public void btnClick(View v){
        Intent intent = new Intent(this, MainActivity.class);

        EditText t = (EditText)this.findViewById(R.id.TfTitle);
        intent.putExtra("TITLE", t.getText().toString());

        EditText l1 = (EditText)this.findViewById(R.id.TfLine1);
        intent.putExtra("LINEONE", l1.getText().toString());

        EditText l2 = (EditText)this.findViewById(R.id.TfLine2);
        intent.putExtra("LINETWO", l2.getText().toString());

        EditText y = (EditText)this.findViewById(R.id.TfYear);
        intent.putExtra("YEAR", Integer.parseInt(y.getText().toString()));

        //Gregorian Calender sets January as 0, need to compensate
        EditText m = (EditText)this.findViewById(R.id.TfMonth);
        intent.putExtra("MONTH", Integer.parseInt(m.getText().toString()) - 1);

        EditText d = (EditText)this.findViewById(R.id.TfDay);
        intent.putExtra("DAY", Integer.parseInt(d.getText().toString()));

        EditText h = (EditText)this.findViewById(R.id.TfHour);
        intent.putExtra("HOUR", Integer.parseInt(h.getText().toString()));

        EditText n = (EditText)this.findViewById(R.id.TfMinute);
        intent.putExtra("MINUTE", Integer.parseInt(n.getText().toString()));

        RadioGroup pa = (RadioGroup)this.findViewById(R.id.RadGrpPeriod);
        RadioButton p = (RadioButton)this.findViewById(pa.getCheckedRadioButtonId());
        intent.putExtra("PERIOD", p.getText().toString());

        startActivity(intent);

    }
}
