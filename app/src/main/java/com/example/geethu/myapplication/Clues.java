package com.example.geethu.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class Clues extends ActionBarActivity {

  public static String EXTRA_MESSAGE="NONE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent=getIntent();
        setContentView(R.layout.activity_clues);
    }

    public void changeToClue1(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Clue1.class);
        EditText editText = (EditText) findViewById(R.id.password);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
    public void changeToClue2(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, Clue2.class);
        EditText editText = (EditText) findViewById(R.id.password2);
        String message2 = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message2);
        startActivity(intent);

    }
    public void changeToClue3(View view)
    {
        Intent intent = new Intent(this, Clue3.class);
        EditText editText = (EditText) findViewById(R.id.password3);
        String message2 = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message2);
        startActivity(intent);
    }
    public void changeToClue4(View view)
    {
        Intent intent = new Intent(this, Clue4.class);
        EditText editText = (EditText) findViewById(R.id.password4);
        String message2 = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message2);
        startActivity(intent);
    }

    public void changeToClue7(View view)
    {
        Intent intent = new Intent(this, Clue7.class);
        EditText editText = (EditText) findViewById(R.id.password7);
        String message2 = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message2);
        startActivity(intent);
    }
    public void changeToClue8(View view)
    {
        Intent intent = new Intent(this, Clue8.class);
        EditText editText = (EditText) findViewById(R.id.password8);
        String message2 = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message2);
        startActivity(intent);
    }
    public void changeToClue9(View view)
    {
        Intent intent = new Intent(this, Clue9.class);
        EditText editText = (EditText) findViewById(R.id.password9);
        String message2 = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message2);
        startActivity(intent);
    }
    public void changeToClue10(View view)
    {
        Intent intent = new Intent(this, Clue10.class);
        EditText editText = (EditText) findViewById(R.id.password10);
        String message2 = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message2);
        startActivity(intent);
    }
    public void changeToClue11(View view)
    {
        Intent intent = new Intent(this, Clue11.class);
        EditText editText = (EditText) findViewById(R.id.password11);
        String message2 = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message2);
        startActivity(intent);
    }
    public void changeToClue12(View view)
    {
        Intent intent = new Intent(this, Clue12.class);
        EditText editText = (EditText) findViewById(R.id.password12);
        String message2 = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message2);
        startActivity(intent);
    }


    public void password(View view)
    {
        Intent intent=getIntent();
        setContentView(R.layout.activity_password1);
    }
    public void password2(View view)
    {
        Intent intent=getIntent();
        setContentView(R.layout.activity_password2);
    }
    public void password3(View view)
    {
        Intent intent=getIntent();
        setContentView(R.layout.activity_password3);
    }
    public void password4(View view)
    {
        Intent intent=getIntent();
        setContentView(R.layout.activity_password4);
    }

    public void password7(View view)
    {
        Intent intent=getIntent();
        setContentView(R.layout.activity_password7);
    }
    public void password8(View view)
    {
        Intent intent=getIntent();
        setContentView(R.layout.activity_password8);
    }
    public void password9(View view)
    {
        Intent intent=getIntent();
        setContentView(R.layout.activity_password9);
    }
    public void password10(View view)
    {
        Intent intent=getIntent();
        setContentView(R.layout.activity_password10);
    }
    public void password11(View view)
    {
        Intent intent=getIntent();
        setContentView(R.layout.activity_password11);
    }

    public void password12(View view)
    {
        Intent intent=getIntent();
        setContentView(R.layout.activity_password12);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_clues, menu);
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
