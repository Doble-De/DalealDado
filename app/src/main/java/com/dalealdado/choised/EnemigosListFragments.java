package com.dalealdado.choised;

import android.arch.lifecycle.LiveData;

import java.util.List;

public class EnemigosListFragments extends EnemigoListFragment {
    @Override
    LiveData<List<Enemigo>> getEnemigos() {
        return enemigoViewModel.getAllEnemigos();
    }
}
