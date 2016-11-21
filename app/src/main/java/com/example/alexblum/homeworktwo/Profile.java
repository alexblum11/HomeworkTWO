package com.example.alexblum.homeworktwo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends Activity implements View.OnClickListener{

    private Button button_logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        button_logout = (Button) findViewById(R.id.button_logout);
        button_logout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}
