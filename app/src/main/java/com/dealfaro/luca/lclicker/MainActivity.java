package com.dealfaro.luca.lclicker;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickButton(View v) {
        Button b = (Button) v;
        String t = b.getText().toString();
        TextView tv = (TextView) findViewById(R.id.textView);
        //Check to make sure there aren't 12 numbers already
        if((tv.getText().toString().length()) < 12) {
            //Add number to string
            tv.setText(tv.getText().toString() + t);
        }
    }

    public void clickDELButton(View v) {
        TextView tv = (TextView) findViewById(R.id.textView);
        //Check to see that numbers are not at 0
        if((tv.getText().toString().length()) > 0) {
            //Subtract a number
            tv.setText(tv.getText().toString().substring(0, (tv.getText().toString().length()) - 1));
        }
    }

    public void clickCALLButton(View v) {
        String t = "";
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(t);
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

}
