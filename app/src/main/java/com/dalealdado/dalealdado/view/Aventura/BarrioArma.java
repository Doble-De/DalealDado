package com.dalealdado.dalealdado.view.Aventura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.dalealdado.dalealdado.R;

public class BarrioArma extends AppCompatActivity {

    ImageButton bAbajo;
    Intent magia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barrio_arma);

        bAbajo = findViewById(R.id.derecha5);

        magia = new Intent( this, BarrioMagia.class);

        bAbajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(magia);
            }
        });

    }
}
