package com.january.egavett.notyf;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;


public class ViewActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        Bundle extras = getIntent().getExtras();
        updateLabels(extras);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_view, menu);
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
     * Updates the labels in ViewActivity
     * With the information in the bundle
     * @param Bundle extras
     */
    public void updateLabels(Bundle extras){
        TextView t = (TextView)this.findViewById(R.id.TxtTitle);
        t.setText(extras.getString("TITLE"));

        TextView l1 = (TextView)this.findViewById((R.id.TxtLine1));
        l1.setText(extras.getString("LINEONE"));

        TextView l2 = (TextView)this.findViewById((R.id.TxtLine2));
        l2.setText(extras.getString("LINETWO"));

        String d = extras.getInt("DAY") + "/" + (extras.getInt("MONTH") + 1) + "/" + extras.getInt("YEAR");
        TextView dView = (TextView)this.findViewById(R.id.TxtDate);
        dView.setText(d);

        String time = extras.getInt("HOUR") + ":" + extras.getInt("MINUTE");
        TextView timeView = (TextView)this.findViewById(R.id.TxtTime);
        timeView.setText(time);

        TextView p = (TextView)this.findViewById(R.id.TxtPeriod);
        p.setText("Period: " + extras.getString("PERIOD"));
    }
}
