/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana7Ejercicio1;


public class AppLlamadas {
    private int numMarcados;
    private AppLlamadas sigLlamada;
    
    public AppLlamadas(int numMarcados, AppLlamadas sigLlamada){
        this.numMarcados = numMarcados;
        this.sigLlamada = sigLlamada;
    }

    public int getNumMarcados() {
        return numMarcados;
    }

    public void setNumMarcados(int numMarcados) {
        this.numMarcados = numMarcados;
    }

    public AppLlamadas getSigLlamada() {
        return sigLlamada;
    }

    public void setSigLlamada(AppLlamadas sigLlamada) {
        this.sigLlamada = sigLlamada;
    }
    
    
    
}
