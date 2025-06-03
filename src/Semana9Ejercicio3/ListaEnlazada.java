/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana9Ejercicio3;

/**
 *
 * @author LAB-USR-LCENTRO
 */
public class ListaEnlazada {
    private SO inicio, fin;

    public ListaEnlazada() {
        this.inicio = null;
        this.fin = null;
    }

    public SO getInicio() {
        return inicio;
    }

    public void setInicio(SO inicio) {
        this.inicio = inicio;
    }

    public SO getFin() {
        return fin;
    }

    public void setFin(SO fin) {
        this.fin = fin;
    }
    
    // Insert Inicio
    
    public void agregarInicio(String tarea){
        SO nuevaTarea = new SO(tarea);
        
        if(inicio == null){
            inicio = fin = nuevaTarea;
        } else{
            nuevaTarea.setSiguiente(inicio);
            inicio.setAnterior(nuevaTarea);
            inicio = nuevaTarea;
        }
    }
    
    public void agregarFinal(String tarea){
        SO nuevaTarea = new SO(tarea);
        
        if(fin == null){
            inicio = fin = nuevaTarea;
        } else{
            fin.setSiguiente(nuevaTarea);
            nuevaTarea.setAnterior(fin);
            fin = nuevaTarea;
        }
    }
    
}
