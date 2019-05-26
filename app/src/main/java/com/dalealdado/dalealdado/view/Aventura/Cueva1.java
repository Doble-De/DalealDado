package com.dalealdado.dalealdado.view.Aventura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.dalealdado.dalealdado.R;

public class Cueva1 extends AppCompatActivity {

    ImageButton bAbajo,bIzquierda;
    Intent bosque3,cueva2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cueva1);

        bAbajo = findViewById(R.id.izquierda6);
        bIzquierda = findViewById(R.id.derecha6);

        bosque3 = new Intent( this, Bosque3.class);
        cueva2 = new Intent( this, Cueva2.class);

        bAbajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(bosque3);
            }
        });

        bIzquierda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(cueva2);
            }
        });

    }
}
