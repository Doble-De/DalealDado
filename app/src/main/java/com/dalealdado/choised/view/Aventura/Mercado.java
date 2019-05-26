package com.dalealdado.choised.view.Aventura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.dalealdado.dalealdado.R;

public class Mercado extends AppCompatActivity {

    ImageButton mIzquierda, mAbajo;
    Intent barrioMagia, entradaBosque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercado);

        mIzquierda = findViewById(R.id.izquierda9);


        barrioMagia = new Intent(this, BarrioMagia.class);

        mIzquierda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(barrioMagia);
            }
        });
    }
}
