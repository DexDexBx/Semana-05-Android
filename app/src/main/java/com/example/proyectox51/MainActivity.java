package com.example.proyectox51;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onResume(){
        super.onResume(); // Este codigo se ejecuta antes de todo.
        // En este punto la aplicacion ya cargo

        // This en un activity: es la escencia de una pantalla
        // This en un tipo contexto
        Toast.makeText(this,
                "Aplicacion iniciada",
                Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this,
                "ProyectoX51 se detuvo",
                Toast.LENGTH_SHORT).show();
    }
}
