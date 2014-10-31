package com.teamtreehouse.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Random;


public class FunFactsActivity extends Activity {
    /** Called when the activity is first created. */

    private String[] mTestArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Create an ArrayAdapter that will contain all list items
//        ArrayAdapter<String> adapter;

        mTestArray = getResources().getStringArray(R.array.random_fact_array);

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
