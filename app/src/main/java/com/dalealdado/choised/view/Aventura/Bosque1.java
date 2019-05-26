package com.dalealdado.choised.view.Aventura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.dalealdado.dalealdado.R;

import java.util.Random;

public class Bosque1 extends AppCompatActivity {

    ImageButton bAbajo,bIzquierda,bDerecha;
    Intent bosque2,bosque4,fuente;
    int jabali;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bosque1);

        bAbajo = findViewById(R.id.abajoFuente);
        bIzquierda = findViewById(R.id.izquierda1);
        bDerecha = findViewById(R.id.derecha1);
        ImageView huellas = findViewById(R.id.huellas);

        fuente = new Intent( Bosque1.this, Fuente.class);
        bosque2 = new Intent( Bosque1.this, Bosque2.class);
        bosque4 = new Intent(Bosque1.this, Bosque4.class);

        bAbajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(bosque4);
            }
        });

        bIzquierda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(fuente);
            }
        });

        bDerecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(bosque2);
            }
        });

        jabali = random.nextInt(4);
        System.out.println(jabali);

        if (jabali != 3){
            huellas.setImageResource(R.drawable.transparente);
        } else {
            huellas.setImageResource(R.drawable.pisadasjabali);
        }

        YoYo.with(Techniques.BounceInUp)
                .duration(5000)
                .playOn(bAbajo);

        YoYo.with(Techniques.BounceInLeft)
                .duration(5000)
                .playOn(bIzquierda);

        YoYo.with(Techniques.BounceInRight)
                .duration(5000)
                .playOn(bDerecha);
    }
}
