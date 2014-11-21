package com.teamtreehouse.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends Activity {
//Activity -

    /** Called when the activity is first created. */
    private String[] mTestArray;
    private static final Random rgenerator = new Random();



    public int sum(int x, int y) {
        return x + y;
    }
    //Unit Testing Example
    public void test() {
        myassert(sum(4, 7) == 11, "4 + 7 must equal 11");
        myassert(sum(4, -7) == -3, "4 + 7 must equal 11");
        myassert(sum(100, -7) == -93, "4 + 7 must equal 11");
    }
    //
    public void myassert(boolean isCorrect, String msg) {
       if (isCorrect) {

       }
       else {
            //throw new Exception(msg);
           ;
       }
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("TEST", "onCreate called");

        //Lifecycle Methods
        //on start(), on stop(do something else), on resume(reaquire resources), on pause()
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // button click listeners
        final Button response = (Button) findViewById(R.id.btnResponse);
        final Button cancel = (Button) findViewById(R.id.btnCancel);
        //Text View
        final TextView fact = (TextView) findViewById(R.id.responseView);

        cancel.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //button "response" clicked
                Log.d("TEST", "Button Clicked");
            }
        });

        response.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //button "cancel" clicked
                mTestArray =  getResources().getStringArray(R.array.random_fact_array);
                String r = mTestArray[rgenerator.nextInt(mTestArray.length)];
                fact.setText(r);
            }
        });

    }}


