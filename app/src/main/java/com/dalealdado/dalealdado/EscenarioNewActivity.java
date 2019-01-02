package com.dalealdado.dalealdado;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EscenarioNewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escenario_new);

        final EscenaroViewModel escenaroViewModel = ViewModelProviders.of(this).get(EscenaroViewModel.class);
        findViewById(R.id.guardar).setOnClickListener(new View.OnClickListener() {

            EditText nombrePokemon = findViewById(R.id.etnombre);
            EditText genPokemon = findViewById(R.id.etgen);
            EditText descPokemon = findViewById(R.id.etdesc);

            @Override
            public void onClick(View view) {

                Escenario escenario = new Escenario();

                escenario.nombre = nombrePokemon.getText().toString();
                escenario.gen = genPokemon.getText().toString();
                escenario.desc = descPokemon.getText().toString();

                escenaroViewModel.insert(escenario);
                finish();
            }
        });
    }
}

