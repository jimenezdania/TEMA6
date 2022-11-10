package com.example.tema6;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button inicio = (Button) findViewById(R.id.boton_arrancar);
        inicio.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                startService(new Intent(MainActivity.this, ServicioMusica.class));
            }
        });
        Button paro = (Button) findViewById(R.id.boton_detener);
        paro.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                stopService(new Intent(MainActivity.this, ServicioMusica.class));
            }
        });
    }
}