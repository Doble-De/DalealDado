package com.dalealdado.dalealdado.view.Aventura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.dalealdado.dalealdado.R;

public class BarrioMagia extends AppCompatActivity {

    ImageButton bAbajo,bIzquierda,bDerecha;
    Intent arma,fuente,mercado;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_barrio_magia);

            bAbajo = findViewById(R.id.abajoFuente);
            bIzquierda = findViewById(R.id.izquierda1);
            bDerecha = findViewById(R.id.derecha1);

            fuente = new Intent( this, Fuente.class);
            arma = new Intent( this, BarrioArma.class);
            mercado = new Intent(this, Mercado.class);

            bAbajo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(fuente);
                }
            });

            bIzquierda.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(arma);
                }
            });

            bDerecha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(mercado);
                }
            });

        }

}
