package com.example.alexblum.homeworktwo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Settings extends Activity implements View.OnClickListener{

    private Button button_logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        button_logout = (Button) findViewById(R.id.button_logout);
        button_logout.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {

        new AlertDialog.Builder(Settings.this)
                .setMessage("Do you really want to log out?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        Intent homePage = new Intent(Settings.this, Login.class);
                        startActivity(homePage);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        dialog.cancel();
                    }
                })
                .show();
    }
}
