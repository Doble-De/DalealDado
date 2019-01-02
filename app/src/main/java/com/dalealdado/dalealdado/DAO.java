package com.dalealdado.dalealdado;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public abstract class DAO {

    @Insert
    abstract void insert(Heroes heroes);

    @Insert
    abstract void insert (Enemigos enemigos);

    @Insert
    abstract void  insert(Escenario escenario);

    @Query("SELECT * FROM heroes")
    abstract LiveData<List<Heroes>> getAllHeroes();

    @Query("SELECT * FROM enemigos")
    abstract LiveData<List<Enemigos>> getAllEnemigos();

    @Query("SELECT * FROM escenario")
    abstract LiveData<List<Escenario>> getEscenarios();

    @Query("SELECT * FROM heroes WHERE id = :id")
    abstract LiveData<Heroes> getHeroe(int id);

    @Query("SELECT * FROM enemigos WHERE id = :id")
    abstract LiveData<Enemigos> getEnemigo(int id);

    @Query("SELECT * from escenario WHERE id=:id")
    abstract LiveData<Escenario> getEscenario(int id);
}
