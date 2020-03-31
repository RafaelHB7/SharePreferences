package com.example.notepad;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultado;
    EditText texto;
    NotasController notas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notas = new NotasController(this);

        resultado = findViewById(R.id.Resultado);
        texto = findViewById(R.id.Ed);

        resultado.setTextColor(Color.BLACK);
        resultado.setTextSize(28);
    }

    public void Salvar(View v){
        String string = texto.getText().toString();
        notas.salvar("texto", string);

        resultado.setText(notas.recuperar("texto"));
    }

    protected void onStart() {
        super.onStart();

        resultado.setText(notas.recuperar("texto"));
    }
}
