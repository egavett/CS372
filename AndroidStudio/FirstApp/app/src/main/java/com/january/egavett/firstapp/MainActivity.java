package com.january.egavett.firstapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    * Toggles the "Hello World!" label from visible and invisible
    */
    public void toggleLabel(View v){
        TextView f = (TextView)this.findViewById(R.id.TxtHello);
        int visible = (f.getVisibility()) == View.VISIBLE ?
                        View.INVISIBLE : View.VISIBLE;
        f.setVisibility(visible);
    }

    public void toggleButton(View v){
        Button b1 = (Button)this.findViewById(R.id.BtnClick1);
        Button b2 = (Button)this.findViewById(R.id.BtnClick2);
        String s = (String)b1.getText();
        if(s.equals("@string/click_me")){
            b1.setText("@string/click_that");
            b2.setText("@string/click_me");
        }
        else{
            b1.setText("@string/click_me");
            b2.setText("@string/click_that");
        }
    }
}
