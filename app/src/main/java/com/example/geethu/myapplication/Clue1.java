package com.example.geethu.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Clue1 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent=getIntent();
        String message = intent.getStringExtra(Clues.EXTRA_MESSAGE);
        if(message.equals("01783")) {
            //super.onCreate(savedInstanceState);
            Intent intent2=getIntent();
            TouchImageView img = new TouchImageView(this);
            img.setImageResource(R.drawable.aamul);
            img.setMaxZoom(4f);
            setContentView(img);

        }
        else
        {
            Intent intent2=getIntent();
            setContentView(R.layout.activity_clues);
        }
         //setContentView(R.layout.activity_clue1);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_clue1, menu);
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
