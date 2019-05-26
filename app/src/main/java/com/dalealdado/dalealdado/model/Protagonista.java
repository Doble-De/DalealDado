package com.dalealdado.dalealdado.model;

public class Protagonista {

    static int imagen, vida, fuerza, agilidad, defensa, magia, dinero;
    static String nombre;
    int[] inventario = new int[6];
    int[] cantidad = new int[6];

    public Protagonista(int imagen, int vida, int fuerza, int agilidad, int defensa, int magia, String nombre) {
        dinero = 20;

        for (int i = 0; i < inventario.length; i++) {
            inventario[i]=0;
        }
        for (int i = 0; i < cantidad.length; i++) {
            cantidad[i]=0;
        }
    }

    public void añadirInventario(int id){
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] == 0){
                inventario[i] = id;
                cantidad[i] ++;
                break;
            }
            else if (inventario[i] == id){
                cantidad[i]++;
                break;
            }
        }

    }

    public void eliminarInventario(int id){
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] == id){
                cantidad[i] --;
                if (cantidad[i] == 0){
                    inventario[i] = 0;
                }
                break;
            }
        }
        acualizarInventario();
    }

    void acualizarInventario(){
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] == 0 && inventario[i+1] != 0){
                inventario[i] = inventario[i+1];
            }
        }
    }

}
