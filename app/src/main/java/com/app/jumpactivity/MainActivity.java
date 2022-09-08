package com.app.jumpactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnCambiarActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //capturar el botón del XML
        btnCambiarActivity=findViewById(R.id.buttonCambiarActivity);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(getApplicationContext(),"Cambiando de actividad",Toast.LENGTH_LONG).show();
        Intent i = new Intent(MainActivity.this,MenuActivity.class);
        startActivity(i);
    }
}