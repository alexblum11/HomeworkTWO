package com.example.alexblum.homeworktwo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Login extends Activity implements View.OnClickListener{

    //declare widgets
    private Button button_login;
    private EditText edit_username;
    private EditText edit_password;
    private RadioButton rb_profile;
    private RadioButton rb_settings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Link Widgets to UI
        button_login = (Button) findViewById(R.id.button_login);
        edit_password = (EditText) findViewById(R.id.edit_password);
        edit_username = (EditText) findViewById(R.id.edit_username);
        rb_profile = (RadioButton) findViewById(R.id.rb_profile);
        rb_settings = (RadioButton) findViewById(R.id.rb_settings);

        button_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(edit_username.getText().toString().equals("user") & edit_password.getText().toString().equals("1234")) {
            // Correct login credentials
            if(rb_profile.isChecked()) {
                Intent intent = new Intent(this, Profile.class);
                startActivity(intent);
            } else {
                if (rb_settings.isChecked()) {
                    Intent intent = new Intent(this, Settings.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(this, "Please choose a Screen!", Toast.LENGTH_LONG).show();
                }
            }
        } else {
            // Wrong login credentials
            Toast.makeText(this, "Login denied. \n\nMarvin is sad.", Toast.LENGTH_LONG).show();
            edit_username.setText("");
            edit_password.setText("");
        }


    }

}
