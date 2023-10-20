package com.example.mascotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Perro mio= new Perro("salchicha", "amarillo", 12, "pipo");
        System.out.println(mio.color);
        System.out.println(mio.raza);
        System.out.println(mio.age);
        System.out.println(mio.nombre);
    }
}