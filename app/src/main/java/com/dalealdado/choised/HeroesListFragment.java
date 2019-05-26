package com.dalealdado.choised;

import android.arch.lifecycle.LiveData;

import java.util.List;

public class HeroesListFragment extends HeroeListFragment {
    @Override
    LiveData<List<Heroe>> getHeroes() {
        return heroeViewModel.getAllHeroes();
    }
}

