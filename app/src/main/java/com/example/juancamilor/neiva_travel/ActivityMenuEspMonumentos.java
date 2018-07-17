package com.example.juancamilor.neiva_travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActivityMenuEspMonumentos extends AppCompatActivity {

    RadioButton rbParqueAndino, rbCaballoColombiano, rbMeLlevarasEnTi, rbLavandera, rbLlamarada, rbGuaduales, rbRaza, rbPalacioNinos, rbPuertoCaracoli, rbPentagrama, rbMohan, rbGaitana, rbMadreTierra, rbDomo, rbAlSur, rbLunaRojaUno, rbPlazaCivica, rbLosPotros, rbCentroConvenciones, rbParqueLeesburg, rbLunaRojaDos;
    Button btnSiguiente;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_monumentos);

        btnSiguiente = (Button) findViewById(R.id.btnSiguiente);
        rbParqueAndino = (RadioButton) findViewById(R.id.rbParqueAndino);
        rbCaballoColombiano = (RadioButton) findViewById(R.id.rbCaballoColombiano);
        rbMeLlevarasEnTi = (RadioButton) findViewById(R.id.rbMeLlevarasEnTi);
        rbLavandera = (RadioButton) findViewById(R.id.rbLavandera);
        rbLlamarada = (RadioButton) findViewById(R.id.rbLlamarada);
        rbGuaduales = (RadioButton) findViewById(R.id.rbGuaduales);
        rbRaza = (RadioButton) findViewById(R.id.rbRaza);
        rbPalacioNinos = (RadioButton) findViewById(R.id.rbPalacioNinos);
        rbPuertoCaracoli = (RadioButton) findViewById(R.id.rbPuertoCaracoli);
        rbPentagrama = (RadioButton) findViewById(R.id.rbPentagrama);
        rbMohan = (RadioButton) findViewById(R.id.rbMohan);
        rbGaitana = (RadioButton) findViewById(R.id.rbGaitana);
        rbLosPotros = (RadioButton) findViewById(R.id.rbPotros);
        rbCentroConvenciones = (RadioButton) findViewById(R.id.rbCentroConvenciones);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(rbParqueAndino.isChecked()){
                    Intent intent = new Intent(ActivityMenuEspMonumentos.this, ActivityMenuEspParqueAndino.class);
                    startActivity(intent);
                }
                else if (rbCaballoColombiano.isChecked()){
                    Intent intent = new Intent(ActivityMenuEspMonumentos.this, ActivityMenuEspCaballo.class);
                    startActivity(intent);
                }
                else if (rbMeLlevarasEnTi.isChecked()){
                    Intent intent = new Intent(ActivityMenuEspMonumentos.this, ActivityMenuEspMeLlevaras.class);
                    startActivity(intent);
                }
                else if (rbLavandera.isChecked()){
                    Intent intent = new Intent(ActivityMenuEspMonumentos.this, ActivityMenuEspLavandera.class);
                    startActivity(intent);
                }
                else if (rbLlamarada.isChecked()){
                    Intent intent = new Intent(ActivityMenuEspMonumentos.this, ActivityMenuEspLlamarada.class);
                    startActivity(intent);
                }
                else if(rbGuaduales.isChecked()){
                    Intent intent = new Intent(ActivityMenuEspMonumentos.this, ActivityMenuEspGuaduales.class);
                    startActivity(intent);
                }
                else if (rbRaza.isChecked()){
                    Intent intent = new Intent(ActivityMenuEspMonumentos.this, ActivityMenuEspRaza.class);
                    startActivity(intent);
                }
                else if (rbPalacioNinos.isChecked()){
                    Intent intent = new Intent(ActivityMenuEspMonumentos.this, ActivityMenuEspPalacio.class);
                    startActivity(intent);
                }
                else if (rbPuertoCaracoli.isChecked()){
                    Intent intent = new Intent(ActivityMenuEspMonumentos.this, ActivityMenuEspPuerto.class);
                    startActivity(intent);
                }
                else if (rbPentagrama.isChecked()){
                    Intent intent = new Intent(ActivityMenuEspMonumentos.this, ActivityMenuEspPentagrama.class);
                    startActivity(intent);
                }
                else if (rbMohan.isChecked()){
                    Intent intent = new Intent(ActivityMenuEspMonumentos.this, ActivityMenuEspMohan.class);
                    startActivity(intent);
                }
                else if (rbGaitana.isChecked()){
                    Intent intent = new Intent(ActivityMenuEspMonumentos.this, ActivityMenuEspGaitana.class);
                    startActivity(intent);
                }
                else if (rbLosPotros.isChecked()){
                    Intent intent = new Intent(ActivityMenuEspMonumentos.this, ActivityMenuEspPotros.class);
                    startActivity(intent);
                }
                else if (rbCentroConvenciones.isChecked()){
                    Intent intent = new Intent(ActivityMenuEspMonumentos.this, ActivityMenuEspCentroConvenciones.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Por favor seleccione una opción", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
