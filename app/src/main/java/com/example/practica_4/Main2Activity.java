package com.example.practica_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    TextView Nombre,APaterno,AMaterno,Edad,Direccion,Telefono,Carrera,Sexo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle(R.string.Pantalla_2);
        ArrayList <String> Datos_recibidos = getIntent().getStringArrayListExtra("Variable");
        Nombre = findViewById(R.id.TxtNombre2);
        APaterno = findViewById(R.id.TxtApellidoP2);
        AMaterno = findViewById(R.id.TxtApellidoM2);
        Edad = findViewById(R.id.TxtEdad2);
        Direccion = findViewById(R.id.TxtDireccion2);
        Telefono = findViewById(R.id.TxtTelefono2);
        Carrera = findViewById(R.id.TxtCarrera2);
        Sexo = findViewById(R.id.TxtSexo2);
        Nombre.setText(Datos_recibidos.get(0));
        APaterno.setText(Datos_recibidos.get(1));
        AMaterno.setText(Datos_recibidos.get(2));
        Edad.setText(Datos_recibidos.get(3));
        Direccion.setText(Datos_recibidos.get(4));
        Telefono.setText(Datos_recibidos.get(5));
        Sexo.setText(Datos_recibidos.get(6));
        Carrera.setText(Datos_recibidos.get(7));

    }
}
