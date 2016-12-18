package com.sandyz.bundlewelcomescree;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    EditText et;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et= (EditText)findViewById(R.id.username);

    }

    public void loginClick(View v){

        String q = et.getText().toString();
        Intent newactivity = new Intent(getApplicationContext(),Activity2.class);

        Bundle bd = new Bundle();

        bd.putString("username",q);
        newactivity.putExtras(bd);
        startActivity(newactivity);





    }


}
