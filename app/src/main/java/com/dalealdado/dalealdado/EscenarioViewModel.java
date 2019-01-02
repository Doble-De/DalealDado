package com.dalealdado.dalealdado;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

class EscenaroViewModel extends AndroidViewModel {

    EscenarioRepository escenarioRepository;

    public EscenaroViewModel(@NonNull Application application) {
        super(application);

        escenarioRepository = new EscenarioRepository(application);
    }

    public void insert(Escenario escenario){
        escenarioRepository.insert(escenario);
    }

    LiveData<List<Escenario>> getEscenarios(){
        return escenarioRepository.getEscenarios();
    }
    LiveData<Escenario> getEscenario(int id){
        return escenarioRepository.getEscenario(id);
    }
}
