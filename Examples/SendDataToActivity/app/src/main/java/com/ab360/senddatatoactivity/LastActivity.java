package com.ab360.senddatatoactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LastActivity extends Activity {

    private TextView open_login;
    private TextView open_pass;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.last_layout);

        open_login = (TextView) findViewById(R.id.open_login);
        open_pass = (TextView) findViewById(R.id.open_pass);

        open_login.setText(getIntent().getStringExtra("login"));
        open_pass.setText(getIntent().getStringExtra("password"));


    }


    public void back(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);

    }
}
