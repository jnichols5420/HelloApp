package com.teamtreehouse.funfacts;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class FunFactsActivity extends Activity implements DialogInterface.OnClickListener {
    @Override
    public void onClick(DialogInterface dialog, int which) {
        // button click listeners
        final Button response = (Button) findViewById(R.id.btnResponse);
        Button cancel = (Button) findViewById(R.id.btnCancel);
        //Text View
        TextView fact = (TextView) findViewById(R.id.responseView);


    response.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {
            //button "response" clicked

        }
    });

    cancel.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //button "cancel" clicked
                mTestArray =  getResources().getStringArray(R.array.random_fact_array);
                String r = mTestArray[rgenerator.nextInt(mTestArray.length)];
                response.setText(r);
            }
        });
}

    /** Called when the activity is first created. */
    private String[] mTestArray;
    private static final Random rgenerator = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);


        // Create an ArrayAdapter that will contain all list items
//        ArrayAdapter<String> adapter;

       // mTestArray = getResources().getStringArray(R.array.random_fact_array);

    /* Assign the name array to that adapter and
    also choose a simple layout for the list items */
//        adapter = new ArrayAdapter<String>(
//                this,
//                android.R.layout.simple_list_item_1,
//                mTestArray);

        // Assign the adapter to this ListActivity
//        setListAdapter(adapter);
    }

        public void getRand() {


        String randomStr = mTestArray[new Random().nextInt(mTestArray.length)];
        }

}
