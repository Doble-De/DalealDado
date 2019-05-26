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

public class Bosque6 extends AppCompatActivity {

    ImageButton bArriba,bIzquierda;
    Intent bosque3,bosque5;
    int jabali;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bosque6);

        bArriba = findViewById(R.id.arriba6);
        bIzquierda = findViewById(R.id.izquierda6);
        ImageView huellas= findViewById(R.id.huellas);

        bosque3 = new Intent( this, Bosque3.class);
        bosque5 = new Intent( this, Bosque5.class);

        bArriba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(bosque3);
            }
        });

        bIzquierda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(bosque5);
            }
        });

        jabali = random.nextInt(4);
        System.out.println(jabali);

        if (jabali != 3){
            huellas.setImageResource(R.drawable.transparente);
        } else {
            huellas.setImageResource(R.drawable.pisadasjabali);
        }

        YoYo.with(Techniques.BounceInDown)
                .duration(5000)
                .playOn(bArriba);

        YoYo.with(Techniques.BounceInLeft)
                .duration(5000)
                .playOn(bIzquierda);

    }
}
