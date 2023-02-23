package com.example.dolaremreal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void converter(View view){

        EditText editDolar;

        TextView textResultado;

        editDolar = findViewById(R.id.editDolar);
        textResultado= findViewById(R.id.textResultado);

        double valorDolar = Double.parseDouble(editDolar.getText().toString());

        double valorConvertido = valorDolar*5.14;

        textResultado.setText("Valor em R$: "+valorConvertido);



    }
}