package com.dalealdado.dalealdado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Glide.with(this).load(R.drawable.lobi).into((ImageView)findViewById(R.id.imagenlobi));
        Glide.with(this).load(R.drawable.lobi).into((ImageView)findViewById(R.id.imagendados));
    }

}
