package com.example.jons.smartwaiterwine;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton spain;
    int request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spain = (ImageButton) findViewById(R.id.spain);
        spain.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.spain:
                Log.i("MyActivity", "Se pulso el boton spain");
                Intent intent = new Intent(MainActivity.this, GridActivity.class);
                startActivityForResult(intent, request);
                break;
        }
    }
}
