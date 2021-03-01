package com.example.gasolinaoualcoolporrafaelmoid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView editpa, editpg;
    public TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editpa=findViewById(R.id.editpa);
        editpg=findViewById(R.id.editpg);
        textResultado=findViewById(R.id.textResultado);


    }

    public void calcularPreco (View view) {

        String precoAlcool = editpa.getText().toString();
        String precoGasolina = editpg.getText().toString();
        validarCampos(precoAlcool, precoGasolina);
        Boolean camposValidados = true;


        if ( camposValidados ) {
            double valorAlcool = Double.parseDouble(precoAlcool);
            double valorGasolina = Double.parseDouble(precoGasolina);
            double resultado = valorAlcool / valorGasolina;

            if ( resultado >= 0.7 ){
                textResultado.setText("Gasolina");
            }else {
                textResultado.setText("Álcool");
            }

        }else{
            textResultado.setText("Preencha os preços primeiro");
        }
    }



    public void validarCampos (String pAlcool, String pGasolina ) {

        Boolean camposValidados = true;

        if ( pAlcool == null ) {
            camposValidados = false;
        } else if ( pGasolina == null ) {
            camposValidados = false;
        }
            }





        }



