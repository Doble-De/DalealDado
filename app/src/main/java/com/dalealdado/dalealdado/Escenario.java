package com.dalealdado.dalealdado;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Escenario {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public String nombre;
    public String gen;
    public String desc;
}
