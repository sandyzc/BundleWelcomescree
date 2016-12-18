package com.sandyz.bundlewelcomescree;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;



/**
 * Created by santosh on 18-12-2016.
 */

public class Activity2 extends Activity {

    TextView tx;
    TextView tx1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        tx= (TextView)findViewById(R.id.tx2);
        tx1= (TextView)findViewById(R.id.txt1);


        String user = getIntent().getExtras().getString("username");
        tx.setText(user);


    }
}
