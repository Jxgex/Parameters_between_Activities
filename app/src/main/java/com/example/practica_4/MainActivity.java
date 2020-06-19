package com.example.practica_4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RadioButton Masculino,Femenino;
    EditText Nombre, ApellidoP,ApellidoM,Edad,Direccion,Telefono,Carrera;
    String [] Carreras = {"Ingeniería AgroIndustrial","Ingeniería Financiera", "Lic. Arquitectura Bioclimatica","Ingeniería en Software"};
    ArrayList<String> Datos = new ArrayList<>();
    Spinner SPCarrera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(R.string.Pantalla_1);
        ArrayAdapter<String> Contenido_Spinner = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,Carreras);
        SPCarrera = findViewById(R.id.SPCarreras);
        SPCarrera.setAdapter(Contenido_Spinner);
        Nombre = findViewById(R.id.TxtNombre2);
        ApellidoP = findViewById(R.id.TxtAPellidoP);
        ApellidoM = findViewById(R.id.TxtApellidoM2);
        Edad = findViewById(R.id.TxtEdad2);
        Direccion = findViewById(R.id.TxtDireccion2);
        Telefono = findViewById(R.id.TxtTelefono2);
        Masculino = findViewById(R.id.RBMasculino);
        Femenino = findViewById(R.id.RBFemenino);
    }
    public void Verificacion(View v){
        if(Nombre.getText().toString().isEmpty() || ApellidoP.getText().toString().isEmpty()||
        ApellidoM.getText().toString().isEmpty()||Edad.getText().toString().isEmpty()||
        Edad.getText().toString().isEmpty()||Direccion.getText().toString().isEmpty()||
        Telefono.getText().toString().isEmpty()){
            AlertDialog.Builder alerta = new AlertDialog.Builder(this);
            alerta.setTitle("Alerta");
            alerta.setMessage("Campos sin ingresar");
            alerta.setPositiveButton("Aceptar",null);
            AlertDialog dialogo = alerta.create();
            dialogo.show();
        }
        else{
            Datos.add(0,Nombre.getText().toString());
            Datos.add(1,ApellidoP.getText().toString());
            Datos.add(2,ApellidoM.getText().toString());
            Datos.add(3,Edad.getText().toString());
            Datos.add(4,Direccion.getText().toString());
            Datos.add(5,Telefono.getText().toString());
            if(Masculino.isChecked()){
                Datos.add(6,"Masculino");
            }
            else if(Femenino.isChecked()){
               Datos.add(6,"Femenino");
            }
            Datos.add(7,SPCarrera.getSelectedItem().toString());
            Toast.makeText(this,"Guardados",Toast.LENGTH_LONG).show();
            Cambio_de_Pantalla();
        }
    }
    public void Cambio_de_Pantalla(){
        Intent cambio_de_pantalla = new Intent(MainActivity.this,Main2Activity.class);
        cambio_de_pantalla.putStringArrayListExtra("Variable", Datos);
        startActivity(cambio_de_pantalla);
    }

}
