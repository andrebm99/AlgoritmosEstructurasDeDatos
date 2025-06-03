/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana9Ejercicio1;

/**
 *
 * @author LAB-USR-LCENTRO
 */
public class Navegador {
    private String dato;
    private Navegador sig;
    private Navegador ant;
    
    // Inicio
    public Navegador(String dato, Navegador sig, Navegador ant) {
        this.dato = dato;
        this.sig = sig;
        this.ant = ant;
    }
    
    // Fin
    
    public Navegador(String dato){
        this.dato = dato; 
        this.sig = null;
        this.ant = null;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Navegador getSig() {
        return sig;
    }

    public void setSig(Navegador sig) {
        this.sig = sig;
    }

    public Navegador getAnt() {
        return ant;
    }

    public void setAnt(Navegador ant) {
        this.ant = ant;
    }
    
    
    
    
}
